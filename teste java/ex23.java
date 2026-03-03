//Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
// Nome Do Programador: Higor Kaique 
// Data Elaborada: 19/02/2026

import java.util.Scanner;
public class ex23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º Valor! ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o 2º Valor! ");
        int valor2 = sc.nextInt();

        System.out.println("Digite o 3º Valor! ");
        int valor3 = sc.nextInt();

        System.out.println("Digite O 4º Valor! ");
        int valor4 = sc.nextInt();

        if(valor1 > valor2 && valor1 > valor3 && valor2 > valor3 ){
            System.out.format("%d, %d, %d, %d",valor1,valor2,valor3,valor4);
        }else if(valor2 > valor1 && valor2 > valor3 && valor1 > valor3){
            System.out.format("%d, %d, %d, &d",valor2,valor1,valor3,valor4);
        }
    }
    
}
