//Criar e coletar em um vetor [20] com números aleatórios. 
// Classificar este vetor em ordem crescente e mostre os dados. 
import java.util.Scanner;
import java.util.Arrays;
public class Ex6vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [10];
        for(int i = 0;i<10;i++) {
                System.out.println("Digite O Valor A Ser Digitado No Vetor! ");
                vetor[i] = sc.nextInt();
        }

        for(int i = 0;i<10;i++) {
            for(int j = i+1;j<10;j++) {
                if (vetor[i] > vetor[j]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                    }
                }
            }
            
        System.out.println(Arrays.toString(vetor));
            
            sc.close();
    }
}
