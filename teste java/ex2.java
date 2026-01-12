import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual O Valor Do Salário?");
        int salario = sc.nextInt();

        double salarioNovo = salario*1.15;

        System.out.println("O Novo Salário É : " + salarioNovo);
        sc.close();
    }
}
