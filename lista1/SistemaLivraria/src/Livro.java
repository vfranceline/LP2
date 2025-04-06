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


    // gets
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getAno() {
        return ano;
    }

    public double getCustoProd() {
        return custoProd;
    }

    // sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCustoProd(double custoProd) {
        this.custoProd = custoProd;
    }
}
