//Receba o número da base e do expoente. Calcule e mostre o valor da potência. 
import java.util.Scanner;
public class Ex44Função{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite O Valor Da Base! ");
        int base = sc.nextInt();

        System.out.println("Digite O Valor Do Expoente! ");
        int expoente = sc.nextInt();

        int resultado = Função_Potência(base,expoente);

        System.out.println("O Valor Da Potência é: " + resultado);
        sc.close();
    }

    static int Função_Potência(int base,int expoente){
        int resultado = 1;
        while(expoente >= 1){
            resultado = resultado*base;
            expoente -= 1;
        }
        return resultado;
    }

}