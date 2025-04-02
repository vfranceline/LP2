public class Aluno {

    // Boa prática: outras classes não devem acessar os atributos diretamente, apenas chamar os métodos
    private int anoIngresso, numDisciplinas;
    private String matricula, nome, curso;
    private boolean matriculado;

    //metodo para criar aluno
    //public void criarAluno(String numMatricula, String nomeAluno, int anoIngressoAluno, String cursoAluno) {
    //    // 'this' referencia o próprio objeto
    //    this.matricula = numMatricula;
    //    this.nome = nomeAluno;
    //    this.anoIngresso = anoIngressoAluno;
    //    this.curso = cursoAluno;
    //    this.numDisciplinas = 6;
    //    this.matriculado = true;
    //}

    //construtor
    public Aluno(String matricula, String nome, int anoIngresso, String curso) {
        // 'this' referencia as definições gerais da classe
        this.matricula = matricula;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.numDisciplinas = 6;
        this.matriculado = true;
    }

    public int permanencia(int anoAtual) {
        return anoAtual - this.anoIngresso;
    }

    public int mensalidade() {
        return this.numDisciplinas * 150;
    }

    void informaDisciplina(int numDisciplinas){
        this.numDisciplinas = numDisciplinas;
        
    }
}