/*objetivo: Programa criado Para automatizar O Calculo Da Média De Um Aluno E Retornar alguma estatistica. 
Nome Do Programador: Higor Kaique 
Data Elaborada: 19/02/2026
 */
// Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:

// a. Se a média for >= 6,0 exibir “APROVADO”;

// b. Se a média for >= 3,0 E < 6,0 exibir “EXAME”;

// c. Se a média for < 3,0 exibir “RETIDO”.

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        
        double soma = (n1 + n2 + n3+ n4);
        double media = soma/4;

        System.out.format("O Aluno Tem a Nota %f !!! a média dele é de %f",soma,media);

        if(media >= 6){
            System.out.println("O Aluno Está Aprovado Com A Nota : " + media);
        }else if(media >= 3 && media < 6){
            System.out.format("O Aluno Está De Recuperação Com A Nota: %f",media);
        }else{
            System.out.format("O Aluno Foi Reprovado Com A Nota: %f ",media);
        }
    }
}
