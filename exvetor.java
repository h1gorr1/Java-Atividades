//funcao 1 = carrega, 2 classifica, 3 mostra, 9 fim

import java.util.Arrays;
import java.util.Scanner;

public class exvetor{
    public static void main(String[] args){
        Scanner hi = new Scanner(System.in);
        int vetor [] = new int[4];
        int opc = 0;

        while(opc != 9){
            System.out.println("Digite Uma Opção! ");
            opc = hi.nextInt();

            switch(opc){
                case 1:
                    vetor = funcaoCarrega(hi,vetor);
                    break;
                case 2:
                    vetor = funcaoClassifica(vetor);
                    break;
                case 3:
                    procMostra(vetor);
                    break;

                case 9:
                    System.out.println("Fim Programa");
                    return;
                default:
                    System.out.println("Valor Inexistente, Tente Algum Número Do Menu! ");
                
            }
        } 

    }
    static int[] funcaoCarrega(Scanner hi, int vetor[]){
        for(int i = 0;i<4;i++){
            System.out.println("Digite Um Valor! ");
            vetor[i] = hi.nextInt();
        }
        return vetor;
    }

    static int[] funcaoClassifica(int vetor[]){
        for(int i = 0;i<4;i++){
            for(int j = i+1;j<4;j++){
                if(vetor[i] >= vetor[j]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;

                }
            }
        }
        return vetor;
    }

    static void procMostra(int vetor []){
        System.out.println(Arrays.toString(vetor));
    }
}