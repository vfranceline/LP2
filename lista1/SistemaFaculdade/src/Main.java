public class Main {
    public static void main(String[] args) throws Exception {
        //só pode executar um método depois de criar um objeto
        Aluno aluna1 = new Aluno("072410150", "Vitória", 2024, "SI");
        //aluna.criarAluno("072410150", "Vitória", 2024, "SI");

        System.out.println(aluna1.permanencia(2025));
        System.out.println(aluna1.mensalidade());
    }
}