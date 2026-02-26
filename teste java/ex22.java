/*objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Nome Do Programador: Higor Kaique 
Data Elaborada: 19/02/2026
 */
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Um Valor! ");
        int valor1 = sc.nextInt();

        System.out.println("Digite Outro Valor! ");
        int valor2 = sc.nextInt();

        if(valor1 > valor2){
            System.out.println("O Valor 1 é Maior Do Que O Valor 2! ");
}
