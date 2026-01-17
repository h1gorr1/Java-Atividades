//Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa. 
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite O Valor Do Cateto Oposto! ");
        double oposto = sc.nextDouble();

        System.out.println("Digite O Valor Do Cateto Adjascente! ");
        double Adjascente = sc.nextDouble();

        double hipotenusa = (Adjascente * Adjascente) + (oposto * oposto);
        hipotenusa = Math.sqrt(hipotenusa);

        System.out.println("O Valor Da Hipotenusa É : " + hipotenusa );
        sc.close();
    }
}
