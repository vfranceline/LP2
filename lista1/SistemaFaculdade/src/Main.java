public class Main {
    public static void main(String[] args) {
        // Criando um aluno com o construtor
        Aluno aluno = new Aluno("072410150", "Vitória", 2024, "Sistemas de Informação");

        // Mostrando dados básicos
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Ano de ingresso: " + aluno.getAnoIngresso());
        System.out.println("Está matriculado? " + (aluno.getMatriculado() ? "Sim" : "Não"));
        System.out.println("Número de disciplinas: " + aluno.getNumDisciplinas());
        System.out.println("Mensalidade: R$ " + aluno.mensalidade());

        // Atualizando número de disciplinas
        System.out.println("\nAtualizando número de disciplinas para 8...");
        aluno.informaDisciplina(8);

        // Calculando tempo de permanência
        int anoAtual = 2025;
        int tempoPermanencia = aluno.permanencia(anoAtual);
        System.out.println("\nTempo de permanência até " + anoAtual + ": " + tempoPermanencia + " anos");

        // Modificando alguns dados
        aluno.setCurso("Engenharia de Robôs");
        aluno.setNome("Vitória Matos");
        System.out.println("\nDados atualizados:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
    }
}
