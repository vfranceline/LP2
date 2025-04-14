public class Tempo {
    private int hora, minuto, segundo;

    public Tempo (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    } 

    public int conversao(){
        int total;

        total = hora*60 + minuto;

        if (segundo > 0){
            total+=1;
        }

        return total;
    }

    public int calcDif(int inicio, int fim){
        int diferenca;
        diferenca = fim - inicio;
        return diferenca;
    }
}


public class Ligacao {
    private int numero_origem, numero_destino;
    private String localidade;
    private float valor_total;
    Tempo momento_inicio = new Tempo(0, 0, 0);
    Tempo momento_final = new Tempo(0, 0, 0);

    public Ligacao (int numero_destino, int numero_origem, String localidade, float valor_total, Tempo momento_final, Tempo momento_inicio){
        this.numero_destino = numero_destino;
        this.numero_origem = numero_origem;
        this.localidade = localidade;
        this.valor_total = valor_total;
        this. momento_final = momento_final;
        this.momento_inicio = momento_inicio;
    }

    public Ligacao (int numero_origem, String localidade, Tempo momento_inicio){
        this.numero_origem = numero_origem;
        this.localidade = localidade;
        this.momento_inicio = momento_inicio;
    }

    public float calcValor(){
        valor_total = ;

        return this.valor_total;
    }


}
