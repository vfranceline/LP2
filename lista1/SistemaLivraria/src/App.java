public class App {
    public static void main(String[] args) throws Exception {
        Livro pjo = new Livro("mar de monstros", "rick", 5, 2013, 30);

        pjo.printInfo();
        System.out.println(pjo.calcPreco(0.5));
    }
}
