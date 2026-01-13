//Receba os valores do comprimento,
//  largura e altura de um paralelepípedo. Calcule e mostre seu volume
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite O Valor Da Base ! ");
        int base = sc.nextInt();

        System.out.println("Digite O Valor Da Altura ! ");
        int altura = sc.nextInt();

        System.out.println("Digite O Valor Da Largura! ");
        int largura = sc.nextInt();

        int volume = (base*altura*largura);

        System.out.println("O Volume Do Seu Paralelepípedo é : " + volume);
        
        sc.close();

    }
}