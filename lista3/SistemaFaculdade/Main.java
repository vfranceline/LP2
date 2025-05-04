package lista3.SistemaFaculdade;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Curso (código, ano de criação, nome, valor total)
        Curso curso1 = new Curso(1, 2018, "Análise de Sistemas", 12000.0);
        Curso curso2 = new Curso(2, 2020, "Engenharia de Software", 15000.0);
        Curso curso3 = new Curso(3, 2021, "Análise de Sistemas", 12500.0); // nome duplicado
        Curso curso4 = new Curso(4, 2025, "Ciência da Computação", 18000.0);
        Curso curso5 = new Curso(5, 2023, "Banco de Dados", 10000.0);

        // Criando uma Faculdade
        Faculdade facul = new Faculdade("Faculdade Tech", 2020);
        System.out.println("--- Teste de addCurso ---");
        facul.addCurso(curso1); // deve adicionar
        facul.addCurso(curso2); // deve adicionar
        facul.addCurso(curso3); // deve imprimir duplicado
        facul.addCurso(curso4); // deve adicionar
        System.out.println();

        System.out.println("--- Lista de cursos atuais ---");
        for (Curso c : facul.getCursos()) {
            System.out.println(c.getNome() + " (" + c.getAnoCriacao() + ") - Mensalidade em 10x: R$ " + String.format("%.2f", c.calcMensalidade(10)));
        }
        System.out.println();

        System.out.println("--- Teste de removerCurso por nome ---");
        facul.removerCurso("Engenharia de Software"); // deve remover
        facul.removerCurso("Matemática");           // não existe
        System.out.println();

        System.out.println("--- Lista de cursos após remoção ---");
        for (Curso c : facul.getCursos()) {
            System.out.println(c.getNome());
        }
        System.out.println();

        System.out.println("--- Teste de novaFaculdade ---");
        // Nova faculdade deve incluir cursos criados até 2020+5=2025
        Faculdade novaFacul = facul.novaFaculdade("Faculdade Inovação", 2020);
        System.out.println("Cursos na nova faculdade (até 5 anos após 2020):");
        for (Curso c : novaFacul.getCursos()) {
            System.out.println(c.getNome() + " (" + c.getAnoCriacao() + ")");
        }
    }
}
