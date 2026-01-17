//Receba um número inteiro. Calcule e mostre o seu fatorial. 
import java.util.Scanner;
public class Ex32funcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Um Número Inteiro! ");
        int n = sc.nextInt();

        int total = funcao(n);
        System.out.println("O Valor Fatorial De N É: " + total );
        sc.close();

    } 
    static int funcao(int n){
        int resultado = 1;
        while (n > 0){
            resultado = n*resultado;
            n -= 1;

        }
        return resultado;
    }
}
