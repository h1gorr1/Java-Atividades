
//Criar e coletar um vetor [100] inteiro e exibir: 
// O maior e o menor valor; 
// A média dos valores. 
import java.util.Scanner;
// import java.util.Arrays;

public class Ex2_Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Até Parece que eu vou preencher 100 Posições :)
        int[] vetor = new int[10];
        

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite Um Valor Para O Vetor!");
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 0; i < 10; i++) {
            if(vetor[i] > maior){
                maior = vetor[i];
            }else if(vetor[i] < menor){
                menor = vetor[i];
            }

        }

        System.out.println("O Maior É: " + maior + " E o Menor É: " + menor);

        double média = Função_Média(vetor);
        System.out.println("O Valor Da Média É " + média );
        sc.close();

    }

    static double Função_Média(int vetor[]){
        int soma = 0;
        int média = 0;
        for(int i=0;i<10;i++){
            soma  += vetor[i];
            média += 1.00;
        }
        int resultado = soma/média;
        return resultado;
    }

}