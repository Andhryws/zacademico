package model;

import java.util.List;

public class Disciplina {
    private String nome;
    private int chTotal;
    private List<Professor> professores;


    public Disciplina() {
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChTotal() {
        return this.chTotal;
    }

    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }

    public List<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

}
