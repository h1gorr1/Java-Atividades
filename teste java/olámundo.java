public class olámundo {
    public static void main(String[] args)
    {
        System.out.println("Olá mundo! ");
    }
}
// 🔹 public

// Significa que esse método pode ser acessado de qualquer lugar.

// O Java precisa acessar esse método para iniciar o programa.

// 📌 Sem public, o Java não consegue começar a execução.

// 🔹 static

// Permite que o Java execute esse método sem criar um objeto da classe.

// Simplificando: o Java pode rodar o programa direto.

// 👉 Você vai entender melhor isso quando aprender classes e objetos, mas por enquanto:

// static = o Java consegue rodar sozinho

// 🔹 void

// Indica que o método não retorna nenhum valor.

// Ou seja, ele só executa comandos.

// Exemplo de método que retorna algo:

// int soma() {
//     return 5;
// }


// Aqui no main, não retorna nada.

// 🔹 main

// É o nome do método.

// O Java exige exatamente esse nome.

// Não pode mudar para Main, principal, etc.

// 🔹 String[] args

// É um parâmetro do método.

// Serve para receber informações passadas pelo terminal quando o programa é executado.

// Exemplo (não precisa usar agora):