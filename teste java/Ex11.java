//Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência. 
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite O Valor Do Raio!: ");
        int raio = sc.nextInt();

        double pi = 3.14;

        double comprimento = (pi*raio*2);

        System.out.println("O Comprimento Daa Circunferência é :" + comprimento);

        sc.close();
    }
}