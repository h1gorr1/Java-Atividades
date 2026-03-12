/*objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles. */
// Nome Do Programador: Higor Kaique 
// Data Elaborada: 12/03/2026
import java.util.Scanner;

public class ex40funcao {
    public static void main(String[] args){
        Scanner hi = new Scanner(System.in);

        System.out.println("Digite O Valor 1");
        int v1 = hi.nextInt();

        System.out.println("Digite O Valor 2");
        int v2 = hi.nextInt();

        hi.close();

        int h = funcaoPrimos(v1,v2);



    }

    static int funcaoPrimos(int v1,int v2){
        for (int i = v1;i <= v2;i++){
            int contador = 0;
            for(int j = 1;j <= v1;j++){
                if(i % j == 0){
                    contador++;
                }

            }
            if(contador == 2){
               System.out.println(i);
            }
            
        }
        return v1;
    }
}
