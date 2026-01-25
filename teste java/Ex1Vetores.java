//Criar e coletar um vetor [50] inteiro. Calcular e exibir: 

// A média dos valores entre 10 e 200; 

// A soma dos números ímpares. 

import java.util.Scanner;


public class Ex1Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Preencher O Vetor
        int vetor[] = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite Um Valor!");
            int valor = sc.nextInt();
            vetor[i] = valor;
        }

        //Função Calcular Média
        double media = Função_Média(vetor);
        System.out.println("O Valor Da Média Dos Números De 10 A 200 é : " + media);
        
        //Função Calcular Números Impares
        int soma = Função_Soma(vetor);
        System.out.println("O Valor Da Soma Dos Números Impares é: " + soma);

        sc.close();


    }

    static int Função_Soma(int vetor []){
        int soma = 0;
        for(int i=0;i<20;i++){
            if(vetor[i] % 2 != 0){
                soma += vetor[i];
            }else{
                // Faz Nada :)
            }
        }

        return soma;
    }

    static double Função_Média(int vetor[]){
        int media = 0;
        int soma = 0;
        for(int i=0;i<20;i++){
            if(vetor[i] >= 10 && vetor[i] <= 200){
                soma += vetor[i];
                media += 1;
            }
            else{
                media += 1;
            }
        }
        double resultado = soma / media;
        return resultado;
    }
}
