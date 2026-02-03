import java.util.Random;
public class testeRandom{
    public static void main(String[] args) {
        Random gerador = new Random();
        int numero = gerador.nextInt(6) + 1;
        System.out.println(numero);
    }
}

// O Bound Serve Para DEFINIR o Maior Número Possível a ser Gerado E o +1 Para Definir o Número Minímo;
//Ramdom É A Biblioteca De Ramdomizar (Aleatório), no caso gerando números Inteiros Aleatórios;