package br.com.digitalhouse;

public class Turma extends Curso {

    private String nomeTurma;
    private Curso cursoAssociado;

    public void setcursoAssociado(Curso novoCurso) {
        this.cursoAssociado = novoCurso;
    }
}
