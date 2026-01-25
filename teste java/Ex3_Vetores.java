//Criar e coletar em um vetor [30] real e calcular e exibir: 

// A média do grupo; 

// A quantidade de notas acima do grupo; 

// As posições dos valores abaixo da média do grupo. 
    
import java.util.Scanner;
import java.util.Arrays;

public class Ex3_Vetores{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double [10];
        for(int i=0;i<10;i++){
            System.out.println("Digite Um Valor Para O Vetor");
            vetor[i] = sc.nextDouble();
            
        }
        sc.close();
        //Função Calcular Média
        double média = Função_Média(vetor);
        System.out.println("O Valor Da Média Da Sala é: " + média);

        //Função Calcular Notas A Cima Da Média.
        int quantidade = Função_Quantidade(vetor,média);
        System.out.println("A Quantidade De Alunos A Cima Da Média É: " + quantidade);

        //Procedimento Mostrar Alunos A Baixo Da Média
        Procedimento_Mostra(vetor,média);
    }

    static void Procedimento_Mostra(double vetor[], double média){
        System.out.println(Arrays.toString(vetor));
        for(int i=0;i<10;i++){
            if(vetor[i] < média){
                System.out.println("O Aluno " + i + " Está A Baixo Da Média Com A Nota: " + vetor[i] );
            }
        }
    }

    static int Função_Quantidade(double vetor[],double média){
        int quantidade = 0;
        for(int i=0;i<10;i++){
            if(vetor[i] > média){
                quantidade += 1;
            }
        }
        return quantidade;
    }

    static double Função_Média(double vetor[]){
        int média = 0;
        double soma = 0;

        for(int i=0;i<10;i++){
            soma += vetor[i];
            média += 1;
            
        }
        double resultado = soma/média;
        return resultado;
    }
}
