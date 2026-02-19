/*objetivo: Programa criado Para automatizar O Calculo Da Velocidade Média. 
Nome Do Programador: Higor Kaique 
Data Elaborada: 19/02/2026
 */
//Receba 2 valores reais. Calcule e mostre o maior deles.
import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite O Valor Do Primeiro Valor! ");
        double v1 = sc.nextDouble();  

        System.out.println("Digite O Valor Do Segundo Valor! ");
        double v2 = sc.nextDouble();

        if(v1 > v2){
            System.out.println("O Valor 1 é Maior Do Que O Valor 2! ");
        }
        else if(v1 == v2) {
            System.out.println("Os Valores São Iguais! ");

        }else{
            System.out.println("O Valor 2 é Maior Do Que O Valor 1! ");
        }
    }}

