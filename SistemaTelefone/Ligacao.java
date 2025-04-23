package SistemaTelefone;

public class Ligacao {
    private int numero_origem, numero_destino;
    private String localidade_origem, localidade_destino;
    private float valor_total;
    Tempo momento_inicio = new Tempo(0, 0, 0);
    Tempo momento_final = new Tempo(0, 0, 0); 
    
    public Ligacao (int numero_destino, int numero_origem, String localidade_origem, String localidade_destino, float valor_total, Tempo momento_final, Tempo momento_inicio){
        this.numero_destino = numero_destino;
        this.numero_origem = numero_origem;
        this.localidade_origem = localidade_origem;
        this.localidade_destino = localidade_destino;
        this.valor_total = valor_total;
        this. momento_final = momento_final;
        this.momento_inicio = momento_inicio;
    }

    // Método que permita criar uma ligação fornecendo o momento do inicio, 
    // o local e o número de origem e o local e o número de destino da ligação.

    public Ligacao (Tempo momento_inicio, String localidade_origem, int numero_origem, String localidade_destino, int numero_destino){
        this.momento_inicio = momento_inicio;
        this.localidade_origem = localidade_origem;
        this.numero_origem = numero_origem;
        this.localidade_destino = localidade_destino;
        this.numero_destino = numero_destino;
    }

    // Método que calcule o valor da ligação. O valor da ligação será correspondente a R$ 1.00
    // por minuto. Mesmo que o usuário fale por 30s será cobrado um minuto. Divida as
    // responsabilidades e construa os métodos nas classes mais apropriadas.

    public float calcValor(){

        int inicioMinutos = momento_inicio.conversao();
        int fimMinutos = momento_final.conversao();
        int duracaoMinutos = momento_inicio.calcDif(inicioMinutos, fimMinutos);
        valor_total = duracaoMinutos * 1.0f;

        return valor_total;
    }

    // Método que receba como parâmetro um número de telefone e informe se a ligação foi
    // originada ou se destinava ao número informado. Exemplo: para uma ligação originada do
    // número 99999999 e que se destinava ao número 2222222. O método deve retornar
    // positivamente a mensagem que pergunta se 99999999 é um telefone envolvido e a
    // mensagem que pergunta se 2222222 é um telefone envolvido e negativamente para
    // qualquer outra.

    public String verificaDestino(int num){
        if (num == numero_destino){
            return "O número " + num + " é o telefone de destino dessa ligação.";
        }
        else if (num == numero_origem){
            return "O número " + num + " é o telefone de origem dessa ligação.";
        } 
        else {
            return "O número " + num + " não está envolvido nessa ligação.";
        }

    }

    public void setMomento_inicio(Tempo momento_inicio) {
        this.momento_inicio = momento_inicio;
    }
    public void setMomento_final(Tempo momento_final) {
        this.momento_final = momento_final;
    }
    public void setNumero_destino(int numero_destino) {
        this.numero_destino = numero_destino;
    }
    public void setNumero_origem(int numero_origem) {
        this.numero_origem = numero_origem;
    }
    public void setLocalidade_destino(String localidade_destino) {
        this.localidade_destino = localidade_destino;
    }
    public void setLocalidade_origem(String localidade_origem) {
        this.localidade_origem = localidade_origem;
    }
    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public String getLocalidade_destino() {
        return localidade_destino;
    }
}
