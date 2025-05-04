import java.util.ArrayList;

public class ShoppingCenter {
    private String nome;
    private ArrayList<Loja> lojas;

    public ShoppingCenter(String nome){
        this.nome = nome;;
        this.lojas = new ArrayList<>();
    }

    public ArrayList<Loja> getlojas(){
        return this.lojas;
    }
    
    // Um membro que permita verificar qual o nome de fantasia da 
    // loja com maior faturamento do shopping

    public String maiorFaturamento(){
        Loja maior = lojas.get(0);

        for (Loja loja : lojas){
            if(loja.getFaturamento() > maior.getFaturamento()){
                maior = loja;
            }
        }
        return maior.getNomeFantasia();
    }

    // Um membro que permita verificar qual o faturamento médio 
    // das lojas com aluguel superior a R$1.000,00.

    public float faturamentoMedio(){
        float soma = 0;
        int quant = 0;

        for(Loja loja : lojas){
            if (loja.calcularAluguel() > 1000){
                soma += loja.getFaturamento();
                quant++;
            }
        }
        return soma/quant;
    }
}
