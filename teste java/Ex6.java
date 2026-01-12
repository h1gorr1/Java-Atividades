//Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos. 
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite O Valor De X " );
        int x = sc.nextInt();

        System.out.println("Digite O Valor De Y : ");
        int y = sc.nextInt();

        int aux = x;
        x = y;
        y = aux;

        System.out.println("A Sequência Agora É: " + x + "," + y );
        sc.close();

    }
}