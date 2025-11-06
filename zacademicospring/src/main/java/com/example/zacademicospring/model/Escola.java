package model;

import java.util.List;

public class Escola {
    private int id_mec;
    private String nome;
    private String endereco;
    private String tipo;
    private String tipo_local;
    private List<Aluno> alunos;

    public Escola(int id_mec, String nome){
        this.id_mec = id_mec;
        this.nome = nome;
    }


    public int getId_mec() {
        return this.id_mec;
    }

    public void setId_mec(int id_mec) {
        this.id_mec = id_mec;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo_local() {
        return this.tipo_local;
    }

    public void setTipo_local(String tipo_local) {
        this.tipo_local = tipo_local;
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    

}
