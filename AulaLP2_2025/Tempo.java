
/**
 * Escreva uma descrição da classe Tempo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Tempo
{
    private int hora, minuto, segundo;
    
    public Tempo(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public void setHora(int hora){
        this.hora = hora;
    }
    public int getHora(){
        return this.hora;
    }
    public int getMinuto(){
        return this.minuto;
    }
    public int getSegundo(){
        return this.segundo;
    }
    
    public int converteParaSegundo(){
        return this.hora*60*60+this.minuto*60+this.segundo;
    }
    
}
