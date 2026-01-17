////Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência. 
import java.util.Scanner;
public class Ex11Procedimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite O Valor Do Raio! ");
        int raio = sc.nextInt();

        Calcular_Circunferência(raio);
        System.out.println("Fim Do Programa :) ");
        sc.close();
    }

    static void Calcular_Circunferência(int raio){
        double comprimento = raio*3.14*2;
        System.out.println("O Valor Do Comprimento É De: " + comprimento);
    }
    
    
}