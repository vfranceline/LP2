
/**
 * Escreva uma descrição da classe Ligacao aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Ligacao
{
    private String localOrig, numOrig, localDest, numDest;
    private Tempo inicio, fim;
    
    public Ligacao(String localOrig, String numOrig, String localDest, String numDest, Tempo inicio){
     this.localOrig = localOrig;
     this.numOrig = numOrig;
     this.localDest = localDest;
     this.numDest = numDest;
     this.inicio = inicio;
    }
    
    public void setFim(Tempo fim){
        this.fim = fim;
    }
    
    public float valorLigacao(){
        int segundoIni, segundoFim, segundo;
        
        segundoIni = inicio.converteParaSegundo();
        segundoFim = fim.converteParaSegundo();
        segundo = segundoFim - segundoIni;
        if (segundo%60 > 0)
           return segundo/60+1;
        else
           return segundo/60;
              
        
    }
}
