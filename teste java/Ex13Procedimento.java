////Receba a quantidade de alimento em quilos. Calcule e mostre 
// quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia. 
import java.util.Scanner;
public class Ex13Procedimento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite O Valor Do Alimento Em Kg ");
        int kg = sc.nextInt();
        Calc_Duração(kg);
        System.out.println("Fim Do Programa :) ");
        sc.close();
    }
    static void Calc_Duração(int kg){
        kg = kg * 1000;
        int total = kg/50;
        System.out.println("O Total Em Dias Consumindo Esse Mesmo Alimento Diariamente Será De " + total + " Dias ");
    }
}
