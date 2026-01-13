//Receba o ano de nascimento e o ano atual.
//  Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos. 
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite O Ano Do Seu Nascimento!"); 
        int anonasc = sc.nextInt();

        System.out.println("Digite O Ano Atual! ");
        int anoatual = sc.nextInt();

        while (anonasc > anoatual) {
            System.out.println("Informações erradas, Tente Inserir Denovo! ");

            System.out.println("Digite O Ano Do Seu Nascimento!"); 
            anonasc = sc.nextInt();

            System.out.println("Digite O Ano Atual! ");
            anoatual = sc.nextInt();
        }

        int idade = (anoatual - anonasc);
        int idadefutura = (idade + 17);

        System.out.println("A Sua Idade Atual é " + idade + " E A Sua Idade Daqui a 17 Anos Será " + idadefutura + " .");
        sc.close();

    }
}