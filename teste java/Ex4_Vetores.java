
//Criar e coletar em um vetor [30] real e calcular e exibir: 
// A média do grupo; 
// A quantidade de notas acima do grupo; 
// As posições dos valores abaixo da média do grupo. 
import java.util.Scanner;
import java.util.Arrays;

public class Ex4_Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[10];

        //Função Calcular Média E Criar O Vetor
        double média = Função_Média(vetor, sc);
        sc.close();
        
        //Mostrar O Vetor Feito
        System.out.println(Arrays.toString(vetor));

        //Mostrar Média;
        System.out.println("A Média Da Turma É De: " + média);

        // Procedimento Quantidade De Pessoas A Cima Da Média;
        Procedimento_AcimaDa_Média(vetor,média);

        //Procediimento Abaixo Da Média e posição(Aluno)
        Procedimento_Abaixo_Média(vetor,média);

    }

    static void Procedimento_Abaixo_Média(double vetor[],double média){
        for(int i=0;i<10;i++){
            if(vetor[i] < média){
                System.out.println("O Aluno " + (i+1) + " Está Abaixo Da Média Com A Nota: " + vetor[i]);
            }else{
                // Faz Nada :)
            }
        }
    }

    static void Procedimento_AcimaDa_Média(double vetor[],double média){
        int Q = 0;
        for(int i=0;i<10;i++){
            if(vetor[i] > média){
                Q++;
            }
        }
        System.out.println("A Quantidade De Pessoas Acima Da Média é De : " + Q + " Alunos");
    }

    static double Função_Média(double vetor[], Scanner sc) {
        int i = 0;
        double soma = 0;
        double média = 0;
        while (i < 10) {
            System.out.println("Digite O Valor Da Nota! ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota Inválida! Digite Uma Nota De 0 A 10");
            } else {
                vetor[i] = nota;
                soma += nota;
                média++;
                i++;
            }
        }

        double resultado = soma / média;
        return resultado;

    }
}
