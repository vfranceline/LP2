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
        return anoAtual - this.anoIngresso; //esse this é opcional pq só tem uma variavel anoIngresso nesse metodo
    }

    public int mensalidade() {
        return this.numDisciplinas * 150;
    }

    void informaDisciplina(int numDisciplinas){
        this.numDisciplinas = numDisciplinas;
        System.out.println("sua mensalidade será:" + this.mensalidade()); //usando o this para informar que o metodo mensalidade é dessa classe
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumDisciplinas() {
        return numDisciplinas;
    }

    public String getCurso() {
        return curso;
    }

    public boolean getMatriculado() {
        return matriculado;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumDisciplinas(int numDisciplinas) {
        this.numDisciplinas = numDisciplinas;
    }
    

}
