public class Medicamento {
    private String nome, principioAtivo;
    private float precoCusto;

    public Medicamento(String nome, String principioAtivo, float precoCusto){
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.precoCusto = precoCusto;
    }

    public Medicamento(String nome, float precoCusto){
        this(nome, nome, precoCusto);
        // this.nome = nome;
        // this.principioAtivo = nome;
        // this.precoCusto = precoCusto;
    }

    public float precoVenda(float percLucro){
        return this.precoCusto + this.precoCusto*percLucro/100;
    }

    public float precoVenda(){
        return this.precoVenda(30);
    }

    public String getNome() {
        return nome;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }



}
