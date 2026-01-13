//Receba a quantidade de alimento em quilos. Calcule e mostre 
// quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.  
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite A Quantidade De Kg De Alimentos! ");
        int quilos = sc.nextInt();

        int gramas = (quilos*1000);
        int consumo = (gramas / 50);

        System.out.println("A Quantidade De Dias Consumindo 50G Desse Mesmo Alimento Todo Dia Será De " + consumo + " Dias.");
        sc.close();
    }
}
