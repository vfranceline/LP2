package lista3.SistemaFaculdade;
public class Curso {
    private int cod, duracao, anoCriacao;
    private String nome;
    private double valorTotal;

    public Curso (int cod, int duracao, int anoCriacao, String nome, double valorTotal){
        this.cod = cod;
        this.duracao = duracao;
        this.anoCriacao = anoCriacao;
        this.nome = nome;
        this.valorTotal = valorTotal;
    }

    public Curso (int cod, int anoCriacao, String nome, double valorTotal){
        this.cod = cod;
        this.duracao = 8;
        this.anoCriacao = anoCriacao;
        this.nome = nome;
        this.valorTotal = valorTotal;
    }

    public double calcMensalidade (int parcelas){
        return valorTotal / parcelas;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
