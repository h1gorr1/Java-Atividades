/*objetivo: Programa criado Para automatizar O Calculo Da Velocidade Média. 
Nome Do Programador: Higor Kaique 
Data Elaborada: 19/02/2026
 */
import java.util.Scanner;

//Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média
public class ex17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite O Tempo Em Horas! ");
        int tempo = sc.nextInt();

        double vm = (12/tempo);
        System.out.format(" A Velocidade Média é: %f ", vm);
         sc.close();
    }
}
