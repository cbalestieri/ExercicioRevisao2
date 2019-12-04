package br.com.digitalhouse;

public class Aula extends Materia{

    private Materia materiaEspecifica;

    public Aula() {
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    public Materia getMateriaEspecifica() {
        return this.materiaEspecifica;
    }

    public void setMateriaEspecifica(Materia novaMateria) {
        this.materiaEspecifica = novaMateria;
    }

    private String horarioInicio;

    private String horarioTermino;
}