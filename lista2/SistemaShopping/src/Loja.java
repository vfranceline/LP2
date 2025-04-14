public class Loja {
    private String nomeFantasia, razaoSocial, numCnpj, publicoAlvo;
    private int digitoCnpj;
    private double faturamento, area;

    public Loja (String nome, String razaoSocial, String numCnpj, int digitoCnpj){
        this.nomeFantasia = nome;
        this.razaoSocial = razaoSocial;
        this.numCnpj = numCnpj;
        this.digitoCnpj = digitoCnpj;
    }

    public Loja (String nome, String numCnpj, int digitoCnpj, double faturamento, String publicoAlvo){
        this(nome, nome, numCnpj, digitoCnpj);
        this.faturamento = faturamento;
        this.publicoAlvo = publicoAlvo;
    }

    public double calcularAluguel () {
        return this.area * 50;
    }

    public boolean compararFaturamento(Loja outraLoja){
        return this.faturamento > outraLoja.faturamento;
    }

    // gets
    public double getArea() {
        return area;
    }
    public int getDigitoCnpj() {
        return digitoCnpj;
    }
    public double getFaturamento() {
        return faturamento;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public String getNumCnpj() {
        return numCnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public String getPublicoAlvo() {
        return publicoAlvo;
    }
    
    // sets
    public void setArea(double area) {
        this.area = area;
    }
    public void setDigitoCnpj(int digitoCnpj) {
        this.digitoCnpj = digitoCnpj;
    }
    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public void setNumCnpj(String numCnpj) {
        this.numCnpj = numCnpj;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }
}
