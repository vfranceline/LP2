
/**
 * Escreva uma descrição da classe ContaTelefone aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ContaTelefone
{
    private int mes,ano, contrato;
    private Ligacao[] ligacoes;
    
    public ContaTelefone(int mes, int ano, int contrato){
        this.mes = mes;
        this.ano = ano;
        this.contrato = contrato;
        this.ligacoes = new Ligacao[50];
    }
    
    public void addLigacao(Ligacao lig){
        int cont;
        for (cont=0;cont<this.ligacoes.length;cont++)
           if (this.ligacoes[cont]==null){
               this.ligacoes[cont]=lig;
               break;
           }
           
    }
    
    public float totalConta(){
        float total=0;
        int cont;
        for (cont=0;cont<this.ligacoes.length;cont++)
           if (this.ligacoes[cont]!=null)
               total+=this.ligacoes[cont].valorLigacao();
        return total;
    }
}
