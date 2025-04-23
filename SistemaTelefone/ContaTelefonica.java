package SistemaTelefone;

import java.util.ArrayList;

public class ContaTelefonica {
    // Continuando o exercício anterior, crie uma classe conta telefônica. Uma conta telefônica possui
    // como atributos, o mês e o ano de referência, o número do contrato que lhe deu origem e uma
    // lista de ligações telefônicas. Para esta classe crie os métodos abaixo (necessário conhecimento
    // sobre arrays):

    private String mes;
    private int ano, numContrato;
    private ArrayList<Ligacao> ligacoes;




// • Método que permita criar uma conta telefônica sem nenhuma ligação (uma nova conta).
    public ContaTelefonica(String mes, int ano, int numContrato){
        this.mes = mes;
        this.ano = ano;
        this.numContrato = numContrato;
        this.ligacoes = new ArrayList<>();
    }

// • Método que permita adicionar uma ligação a uma conta telefônica.
    public void addLigacao(Ligacao ligacao){
        ligacoes.add(ligacao);
    }

// • Método que calcule e retorne o valor total da conta telefônica. O valor total da conta
// corresponde a soma dos valores de todas as ligações associadas à conta.
    public float calcTotal(){
        float total = 0;
        for (Ligacao ligacao : ligacoes){
            total += ligacao.calcValor();
        }
        return total;
    }

// • Sobrecarregue o membro anterior para receber uma String contendo o local de destino da
// ligação como parâmetro e retorne o valor acumulado das ligações para aquele destino. 
    public float calcTotal(String localidade_destino){
        float total = 0;
        for(Ligacao ligacao : ligacoes){
            if (ligacao.getLocalidade_destino().equals(localidade_destino)){
                total += ligacao.calcValor();
            }
        }

        return total;
    }
}
