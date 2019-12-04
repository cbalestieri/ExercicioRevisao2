package br.com.digitalhouse;

public class Aluno extends Aula {

    private String registroAcademico;
    private String nomeAluno;
    private String sobrenomeAluno;


    public assistirAula(Aula){
        super();
    }

    public fazerLicoes(boolean){
        return this.getMateriaEspecifica();
        System.out.println("O aluno está fazendo a lição sobre " + getMateriaEspecifica());
    }
}