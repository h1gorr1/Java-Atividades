
// Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a
// diagonal principal terá seus dados carregados no programa segundo:
import java.util.Scanner;
// import java.util.Arrays;

public class Ex2_Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[4][4];

        // Função Leia Matriz (Caso Não Saiba Funções ou Procedimentos, apenas Aplique o
        // Código sem os statics e etc)
        mat = Função_Carrega(mat, sc);
        sc.close();
        Proc_Mostra(mat);

    }
    //Achei Apenas Essa maneira Podre De Mostrar Os Números Que Estavam Em Diagonal, Perdoa o Pai :(
    static void Proc_Mostra(int[][] mat) {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (x == y) {
                    System.out.println(mat[x][y]);
                }
            }
        }
    }

    static int[][] Função_Carrega(int mat[][], Scanner sc) {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                {
                    System.out.println("Digite Um Valor Para A Matriz");
                    mat[x][y] = sc.nextInt();
                }
            }
        }
        return mat;
    }
}
