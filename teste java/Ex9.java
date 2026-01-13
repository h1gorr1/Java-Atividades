import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite O Valor Do Primeiro Número! ");
        int a = sc.nextInt();
        a = a*a;

        System.out.println("Digite O Valor Do Segundo Valor Agora! ");
        int b = sc.nextInt();
        b = b*b;

        System.out.println("O Primeiro Valor Ao Quadrado é: " + a  +  " E O Segundo É : " + b);
        sc.close();
    }

}