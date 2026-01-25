//Criar uma matriz [8][8] onde o programa irá carregar segundo: 
import java.util.Arrays;

public class Ex3_Matrizes {
    public static void main(String[] args) {
        int[][] matriz = new int [8][8];
        matriz = Função_Carrega_Mat(matriz);
        System.out.println(Arrays.deepToString(matriz));
    }

    static int[][] Função_Carrega_Mat (int matriz [][]){
        int dobro = 2;
        for(int x=0;x<8;x++){
            for(int y=0;y<8;y++){
                if(x == y && x < 1 && y < 1){
                    matriz[x][y] = 1;
                }else{
                    matriz[x][y] = dobro;
                    dobro = dobro*2;
                }
            }
        }
        return matriz;
    }
}
