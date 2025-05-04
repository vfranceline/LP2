package lista3.SistemaTelefone;

public class Tempo {
    private int hora, minuto, segundo;

    public Tempo (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    } 

    //converter o tempo para minutos (se seg > 0 vai contar como 1min)
    public int conversao(){
        int total = hora*60 + minuto;

        if (segundo > 0){
            total+=1;
        }

        return total;
    }

    // diferença entre dois tempos (em minutos)
    public int calcDif(int inicio, int fim){
        return fim - inicio;
   }

    //gets
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //sets
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
