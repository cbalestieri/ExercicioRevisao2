package br.com.digitalhouse;

public class Professor extends Aula, Aluno {

    private String nomeProfessor;
    private String registroDocente;

    public darAulas (Aula){
        return this.getMateriaEspecifica();
        System.out.println("O professor está dando a aula sobre " + getMateriaEspecifica());
    }

    public fazerChamada(Aluno){
    }
}
