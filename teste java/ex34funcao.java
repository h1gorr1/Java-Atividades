/*objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número. */
// Nome Do Programador: Higor Kaique 
// Data Elaborada: 12/03/2026

import java.util.Scanner;

public class ex34funcao {
    public static void main(String[] args){
        Scanner hi = new Scanner(System.in);

        System.out.println("Digite Um Valor Para Mostrar A Tabuada Desse Número! ");
        int n = hi.nextInt();
        hi.close();

        n = funcaoTabuada(n);
    }
    static int funcaoTabuada(int n){
        for(int i=1;i<11;i++){
            int total = n*i;
            System.out.format("%d X %d é igual a %d \n", n,i,total);
        }
        return n;
    }
}
