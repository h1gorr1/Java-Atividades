import java.util.Scanner;
public class Atividade_banco{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [5];
        while (true){
        Mostrar_Menu();
        System.out.println("Digite Sua Função Desejada! ");
        int opc = sc.nextInt();

        

        
        

        switch(opc) {
            case 1:
              Carrega_Notas(vetor);
              break;

            case 2:
                vetor = Sacar_Notas(vetor,sc);
                break;

            case 3:
                Consultar_Notas(vetor);
                break;

            case 9:
                System.out.println("Fim Do Programa!");
                sc.close();
                return ; //Para Encerrar O Programa.
            default :
                System.out.println("Opc Inválida! Tente Novamente Com Algum Número Do Menu! ");
                delay(2000);
              
            }
            }

        }
        static void Mostrar_Menu(){
        System.out.println("--------| Menu |-------- "); 
        System.out.println("Função 1 - Recarregar Notas! ");
        System.out.println("Função 2 - Sacar Notas! ");
        System.out.println("Função 3 - Consultar Notas Disponíveis! ");
        System.out.println("Função 9 - Fim Do Programa! ");
        
        
    }

     static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // pode ficar vazio
        }
    }

    static void Carrega_Notas(int vetor []) {
        for(int i=0;i<5;i++) {
            vetor[i] = 100;
        }
        System.out.println("Células Recarregadas Com Sucesso! ");
        delay(2000);
    }
    static void Consultar_Notas(int vetor[]){
        int [] v = {100,50,20,10,5};
        
        for(int i=0;i<5;i++){
            System.out.println(" Há " + vetor[i] + " Notas De " + v[i] +  "  Dispóniveis! ");
        }
        delay(2000);
    }
    static int[] Sacar_Notas(int [] vetor , Scanner sc) {
        int [] v = {100,50,20,10,5};
        System.out.println("Digite O Valor Do Saque! (Apenas Multíplos De 5) ");
        int saque = sc.nextInt();

        if(saque % 5 !=0) {
            System.err.println("Valor Digitado Inválido. (Apenas Multíplos De 5) ");
            delay(2000);
            return vetor;
            
        }
        else if(saque > (vetor[0] * v[0] + vetor[1] * v[1] + vetor[2] * v[2] + vetor[3] * v[3] + vetor[4] * v[4])){
        System.err.println("Valor De Saque Maior Do Que As Notas Disponiveis,Tente Novamente Com Uma Quantia Mais Baixa Ou Tente Recarregar As Notas.");
        return vetor;
    }
        for(int i=0;i<5;i++){
            int q = 0;
            while(saque >= v[i] && vetor[i] > 0){
                saque -= v[i];
                q += 1;
                vetor[i] -= 1;
            }
            System.out.println("Você Usou " + q + " Notas De " + v[i] + ", Ainda Há " + vetor[i] + " Notas De " + v[i] + " Disponíveis! ");
        }
        delay(2000);
        return vetor;

     }
    }

     
