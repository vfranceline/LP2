import java.time.LocalDate;

public class Carteira {
    private int pontos, num;
    private String cpf, tipo, situacao, validade, expedicao;

    public Carteira(int num, String cpf, String tipo, String validade, String expedicao){
        this.num = num;
        this.cpf = cpf;
        this.tipo = tipo;
        this.validade = validade;
        this.expedicao = expedicao;
        this.pontos = 0;
        this.situacao = "valida";
    }

    public void addPontos(int qntDePontos){
        //this.pontos += qntDePontos;

        this.setPontos(this.getPontos()+qntDePontos);

        if (this.pontos >= 20){
            apreender();    
        }
    }

    public void saldo(){
        System.out.println("Sua carteira tem "+ this.pontos + " pontos");
    }

    public void zerarPontos(){
        this.pontos = 0;
        this.situacao = "valida";
    }

    public void apreender(){
        if(this.pontos>= 20){
            this.situacao = "apreendida";
        }
    }

    public void verificarSituacao(){

        if (this.situacao.equals("valida")){   //basicamente faz oq o (this.situacao == "valida") faria
            System.out.println("sua carteira esta valida");
        }
        else{
            System.out.println("sua carteira não está valida");
        }
    }

    //na prova vamos fazer só um get e set (assumindo que os outros vão seguir o mesmo padrão)
    public void setNum (int num){
        this.num = num;
    }

    public int getNum (int num){
        return this.num;
    }

}
