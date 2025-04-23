package SistemaTelefone;

public class main {
    public static void main(String[] args) {
        // Criando momento de início e fim
        Tempo inicio = new Tempo(10, 15, 30);
        Tempo fim = new Tempo(10, 45, 0);

        // Criando ligação
        Ligacao ligacao = new Ligacao(inicio, "Salvador", 99999999, "Recife", 22222222);

        // Definindo momento final da ligação
        ligacao.setMomento_final(fim);

        // Calculando valor
        float valor = ligacao.calcValor();
        System.out.println("Valor da ligação: R$ " + valor);

        // Verificando números envolvidos
        System.out.println(ligacao.verificaDestino(99999999));
        System.out.println(ligacao.verificaDestino(22222222));
        System.out.println(ligacao.verificaDestino(12345678));
    }
}
