package lista3.SistemaFaculdade;

import java.util.ArrayList;

public class Faculdade {
    private String nome;
    private int anoCriacao;
    private ArrayList<Curso> cursos;

    public Faculdade(String nome, int anoCriacao){
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.cursos = new ArrayList<>();
    }

    // Adicionar um Curso (passado como parâmetro) à faculdade. Entretanto, não é possível 
    // adicionar um curso já existindo um outro curso com o mesmo nome na Faculdade.
    public boolean addCurso(Curso novoCurso){
        for(Curso curso : cursos){
            if(novoCurso.getNome().equals(curso.getNome())){
                System.out.println("já exite um curso com esse nome");
                return false;
            }
        }
        cursos.add(novoCurso);
        System.out.println("curso adicionado com sucesso");
        return true;
    }

    // Remover um Curso dado um nome, passado como parâmetro. Se não houver nenhum 
    // curso com o nome fornecido, uma mensagem deve ser impressa na tela informando o fato
    public boolean removerCurso(Curso cursoRemove){
        for(int i = 0; i < cursos.size(); i++){
            if (cursos.get(i).getNome().equals(cursoRemove.getNome())){
                cursos.remove(i);
                System.out.println("curso removido com sucesso");
                return true;
            }
        }
        System.out.println("não exite um curso com o nome fornecido");
        return false;
    }

    public void removerCurso(String nomeCurso){
        for (int i = 0; i < cursos.size(); i++){
            if(cursos.get(i).getNome().equals(nomeCurso)){
                cursos.remove(i);
                System.out.println("curso removido com sucesso");
                return;
            }
        }
        System.out.println("não exite um curso com o nome fornecido");
    }

    // Retornar uma nova Faculdade (uma nova instância da classe Faculdade) que contenha 
    // como cursos, os cursos que foram criados no máximo 5 anos depois da Faculdade. Este 
    // método deve receber como parâmetro o nome e o ano de criação da nova faculdade. 
    public Faculdade novaFaculdade(String nome, int anoCriacao){
        Faculdade novaFacul = new Faculdade(nome, anoCriacao);
        for(Curso curso : this.cursos){
            if(curso.getAnoCriacao() <= anoCriacao+5){
                novaFacul.addCurso(curso);
            }
        }
        return novaFacul;
    }

    public int getAnoCriacao() {
        return this.anoCriacao;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
}
