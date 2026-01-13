//Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1
//  mês de aplicação
//  sabendo que rende 1,3% a. m. 
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite O Valor Depositado Na Conta ! ");
        double valor = sc.nextDouble();

        // System.out.println("Digite A Quantidade De Meses Também ! ");
        // int mes = sc.nextInt(); isso caso queira controlar os meses também!

       double lucro = (valor * 0.013) + valor;

       System.out.println("O Valor Após 1 Mês De Investimento Na Poupança é : " + lucro);
        
       sc.close();

    }
}