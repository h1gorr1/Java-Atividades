
// Receba a hora de início e de final de um jogo (HH,MM),
//  calcular o tempo do jogo em horas e minutos,
//  sabendo que o tempo máximo é menor que 24 horas e pode começar num dia 
// e terminar noutro. 
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horainicial;
        int minutoinicial;
        int horafinal;
        int minutofinal;

        do {
            System.out.println("Digite A Hora Em Que Você Começou A Jogatina");
            horainicial = sc.nextInt();

            System.out.println("Digite O Minuto Exato Em Que Você Entrou No Jogo! ");
            minutoinicial = sc.nextInt();

            System.out.println("Digite A Hora Que Você Parou De Jogar! ");
            horafinal = sc.nextInt();

            System.out.println("Digite Os Minutos Também! ");
            minutofinal = sc.nextInt();

            if (horainicial > 23 || horafinal > 23 || horainicial < 0 || horafinal < 0 || minutoinicial > 59
                || minutoinicial < 0 || minutofinal > 59 || minutofinal < 0) {
                    System.err.println("Informações Inválidas! Tente Novamente. ");
                }
        }while (horainicial > 23 || horafinal > 23 || horainicial < 0 || horafinal < 0 || minutoinicial > 59
                || minutoinicial < 0 || minutofinal > 59 || minutofinal < 0);

        horainicial = horainicial * 60;
        horafinal = horafinal * 60;
        int minutosiniciaistotais = horainicial + minutoinicial;
        int minutosfinaistotais = horafinal + minutofinal;

        int horastotais;
        int minutostotais;

        if (minutosiniciaistotais > minutosfinaistotais) {
            minutosfinaistotais += 1440;
            int minutosjogados = minutosfinaistotais - minutosiniciaistotais;
            horastotais = minutosjogados / 60;
            minutostotais = minutosjogados % 60;
            System.out.println(" Você Ficou " + horastotais + " Hora(s) e " + minutostotais + " Minuto(s) Jogando! " );
        }else if(minutosiniciaistotais == minutosfinaistotais) {
            horastotais = 24;
            minutostotais = 0;
            System.out.println("Você Ficou No Tempo Máximo! (24 horas e 0 minutos) ");
        }else{
            int minutosjogados = minutosfinaistotais - minutosiniciaistotais;
            horastotais = minutosjogados / 60;
            minutostotais = minutosjogados % 60;
            System.out.println(" Você Ficou " + horastotais + " Hora(s) e " + minutostotais + " Minuto(s) Jogando! " );
            }

            sc.close();

        

                

        
        
    }
}
