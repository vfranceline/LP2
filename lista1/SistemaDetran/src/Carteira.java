import java.time.LocalDate;

public class Carteira {
    private int pontos;
    private String num, cpf, tipo, situacao;
    private LocalDate validade, expedicao;

    public Carteira(String num, String cpf, String tipo, LocalDate validade, LocalDate expedicao){
        this.cpf = cpf;
        this.tipo = tipo;
        this.num = num;
        this.situacao = "valida";
        this.validade = validade;
        this.expedicao = expedicao;
        this.pontos = 0;
    }

    public void acrescentarPontos(int qntDePontos){
        this.pontos += qntDePontos;

        if (this.pontos >= 20){
            apreender();    
        }
    }

    public int consultaPontos(){
        return this.pontos;
    }

    public void zerarPontos(){
        this.pontos = 0;
        this.situacao = "valida";
    }

    public void apreender(){
        this.situacao = "apreendida";
    }

    public String verificarSituacao(){

        if(LocalDate.now().isBefore(validade)){
            this.situacao = "vencida";
        }

        return this.situacao;
    }

}
