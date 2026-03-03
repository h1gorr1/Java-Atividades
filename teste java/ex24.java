//Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
// Nome Do Programador: Higor Kaique 
// Data Elaborada: 19/02/2026
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Um Valor! ");
        int valor = sc.nextInt();

        if(valor % 2 ==0 && valor % 3 == 0){
            System.out.format("O Valor %d é Divisivel Por 2 e 3",valor);
        }else{
            System.out.format("O Número %d Não é divisivel por 2 e 3 simultaneamente! ",valor);
        }
    }
}
