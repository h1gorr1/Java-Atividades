//Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5. 
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite O Valor Em CelSius Para Ser Convertido Em Fahrenheit F. ");
            double celsius = sc.nextDouble();
            double fahrenheit = ((9*celsius + 160) / 5.0);
            System.out.println("O Valor Final Convertido é : " + fahrenheit);
            sc.close();
    }
}
