/*objetivo: Programa criado Para automatizar O Calculo Da Diferença de valores.
Nome Do Programador: Higor Kaique 
Data Elaborada: 19/02/2026
 */
//Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
import java.util.Scanner;
public class ex18 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite Um Valor Para o 1° Inteiro");
    int v1 = sc.nextInt();

    System.out.println("Digite Um Valor Para o 2° Inteiro");
    int v2 = sc.nextInt();

    if(v1 > v2){
        int diferenca = (v1-v2);
        System.out.format("A Diferença é de %d A Mais Do valor 1 para o valor 2",diferenca);
    }else if(v1 == v2){
        System.out.println("Não Há Nemhuma Diferença Do Valor 1 Para O Valor 2");
    }else{
        int diferenca = (v2-v1);
        System.out.format("A Diferença É De %d A Mais Do Valor 2 Para O Valor 1", diferenca);
    }

    }
}
