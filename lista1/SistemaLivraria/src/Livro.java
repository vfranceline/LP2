public class Livro {
    private String nome, autor;
    private int edicao, ano;
    private double custoProd;

    public Livro(String nomeLivro, String nomeAutor, int Edicao, int Ano, float CustoProd){
        this.nome = nomeLivro;
        this.autor = nomeAutor;
        this.edicao = Edicao;
        this.ano = Ano;
        this.custoProd = CustoProd;
    }

    public double calcPreco(double lucroLoja){
        return lucroLoja * this.custoProd;
    }

    public void printInfo(){
        System.out.println("O nome do livro é: " + this.nome);
        System.out.println("O autor do livro é: " + this.autor);
        System.out.println("O ano do livro é: " + this.ano);
        System.out.println("A edição do livro é: " + this.edicao);
    }
}
