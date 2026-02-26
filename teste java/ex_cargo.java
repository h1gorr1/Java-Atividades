import java.util.Scanner;

 public class ex_cargo {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite O Valor Do Salário! ");
         double salario = sc.nextDouble();

        while (true){
        mostrar_menu();
        int funcao = sc.nextInt();

        switch(funcao){
            case1:
                double aumento = funcaoEscrituario(salario);
                break;
            case2:
                double aumento = funcaoGerente(salario);
                break;
            case3:
                double aumento = funcaoCaixa(salario);
                break;
            case4:
                double aumento = funcaoSecretario();
                break;
            default:
                System.out.println("A Função Não Existe!!!");

        }
    }


     static void mostrar_menu(){
        System.out.println("Digite 1 Caso Seja Escrituario! ");
        System.out.println("Digite 2 Caso Seja Gerente! ");
        System.out.println("Digite 3 Caso Seja Caixa! ");
        System.out.println("Digite 4 Caso Seja Secretário! ");
        System.out.println("Digite A Sua Função Aqui!" );
    }

    static double funcaoEscrituario(double salario){
        salario = (salario*0.50 + salario);
        return salario;
    }

    static double funcaoGerente(double salario){
        salario = (salario*0.10 + salario);
        return salario;
    }

    static double funcaoCaixa(double salario){
        salario = (salario*0.20 + salario);
        return salario;
    }

    static double funcaoSecretario(double salario){
        salario = (salario * 0.35 + salario);
        return salario;
    }



 }

 

//escrituario = 50% 1
//gerente = 10% 4
//Caixa = 20% 3
//secretário = 35% 2
