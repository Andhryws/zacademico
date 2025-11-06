package model;
public abstract class Usuario {
    private String nome;
    private String cpf;
    private int idade;
    private String email_pessoal;
    private String email_institucional;
    private String senha;

    public Usuario(String nome, String cpf, String email_pessoal){
        this.nome = nome;
        this.cpf = cpf;
        this.email_pessoal = email_pessoal;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEmail_pessoal(){
        return this.email_pessoal;
    }
    public void setEmail_pessoal(String email_pessoal){
        this.email_pessoal = email_pessoal;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public abstract void imprimeInfo();
}
