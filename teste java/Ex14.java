//Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo. 
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o Valor Do Primeiro Ângulo! ");
        double angulo1 = sc.nextDouble();

        System.out.println("Digite o Valor Do Segundo Ângulo!  ");
        double angulo2 = sc.nextDouble();

        while (angulo1 + angulo2 > 180) {
            System.out.println("Ângulo Inválido! Tente Novamente. ");

            
        System.out.println("Digite o Valor Do Primeiro Ângulo! ");
        angulo1 = sc.nextDouble();

        System.out.println("Digite o Valor Do Segundo Ângulo!  ");
        angulo2 = sc.nextDouble();
        }

        double angulo3 = 180.00 - (angulo1 + angulo2);

        System.out.println("O Valor Do 3ª Ângulo É De " + angulo3 + " Graus!");

        sc.close();
    }
}
