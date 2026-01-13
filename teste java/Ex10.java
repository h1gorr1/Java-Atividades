//Receba 2 números reais. Calcule e mostre a diferença desses valores. 
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite O Valor Do Primeiro Número Real! ");
        Double valor1 = sc.nextDouble();

        System.out.println("Digite O Valor Do Segundo Número Real! ");
        double valor2 = sc.nextDouble();

        if (valor1 > valor2) {
            double diferenca = valor1 - valor2;
            System.out.println("O Valor 1 É Maior Com A Diferença De " + diferenca + " Do Valor 2." );
        }else if (valor1 == valor2) {
            System.out.println("Os Dois Valores São Iguais E Não Tem Diferença e nem Maior Ou Igual.");

        } else {
            double diferenca = valor2 - valor1; 
            System.out.println("O Valor 2 é Maior Com " + diferenca + " A Mais Que o Valor 1. ");
        }

        sc.close();



    }
}