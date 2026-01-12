//Receba a base e a altura de um triângulo. Calcule e mostre a sua área. 
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual É O Valor Da Base? ");
        int base = sc.nextInt();
        
        System.out.println("Qual É O Valor Da Altura?");
        int altura = sc.nextInt();

        double area = (base * altura / 2.0);
        System.out.println("A Área Do Triângulo é :  " + area);

        sc.close();

    }
    
}
