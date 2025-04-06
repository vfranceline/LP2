public class Main {
    public static void main(String[] args) {
        // Criando uma carteira de motorista
        Carteira carteira = new Carteira(
            12345, 
            "123.456.789-00", 
            "A", 
            "2027-12-31", 
            "2022-01-01"
        );

        // Mostrando os dados iniciais
        System.out.println("Número: " + carteira.getNum(0));
        System.out.println("CPF: " + carteira.getCpf());
        System.out.println("Tipo: " + carteira.getTipo());
        System.out.println("Validade: " + carteira.getValidade());
        System.out.println("Expedição: " + carteira.getExpedicao());
        System.out.println("Situação: " + carteira.getSituacao());
        carteira.saldo();
        carteira.verificarSituacao();

        // Adicionando pontos
        System.out.println("\nAdicionando 5 pontos...");
        carteira.addPontos(5);
        carteira.saldo();
        carteira.verificarSituacao();

        System.out.println("\nAdicionando mais 15 pontos...");
        carteira.addPontos(15);
        carteira.saldo();
        carteira.verificarSituacao(); // Deve estar "apreendida"

        // Zerando pontos
        System.out.println("\nZerando os pontos...");
        carteira.zerarPontos();
        carteira.saldo();
        carteira.verificarSituacao(); // Deve voltar a "valida"
    }
}
