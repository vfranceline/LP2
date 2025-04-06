public class Main {
    public static void main(String[] args) {
        // Criando um livro com os dados
        Livro livro = new Livro(
            "O Mar de Monstros", 
            "Rick Riordan", 
            3, 
            2006, 
            45.00f
        );

        // Imprimindo as informações do livro
        livro.printInfo();

        // Calculando o preço com lucro
        double lucroLoja = 1.8; // Exemplo de 80% de lucro
        double precoFinal = livro.calcPreco(lucroLoja);
        System.out.println("Preço de venda com lucro de 80%: R$ " + precoFinal);

        // Alterando alguns dados com setters
        livro.setCustoProd(50.00);
        livro.setAno(2020);

        System.out.println("\nApós atualização de custo e ano:");
        livro.printInfo();

        precoFinal = livro.calcPreco(2.0); // 100% de lucro
        System.out.println("Preço de venda com lucro de 100%: R$ " + precoFinal);
    }
}
