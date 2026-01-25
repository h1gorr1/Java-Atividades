//Receba o número da base e do expoente. Calcule e mostre o valor da potência. 
import java.util.Scanner;
public class Ex44 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite O Valor Da Base!");
        int base = sc.nextInt();

        System.out.println("Digite O Valor Do Expoente!");
        int expo = sc.nextInt();

        int resultado = 1;

        while(expo >= 1){
            resultado = resultado*base;
            expo -= 1;
        }

        System.out.println("O Valor Da Potência é: " + resultado );
        sc.close();
    }
}
