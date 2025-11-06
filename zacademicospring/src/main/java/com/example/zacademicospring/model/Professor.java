package model;
public class Professor extends Usuario {

    int siape;
    String areaFormacao;
    String nivelInstrucao;
    public Professor (String nome, String cpf, String email_pessoal, int siape, String areaFormacao, String nivelInstrucao){
        super(nome, cpf, email_pessoal);
        this.siape = siape;
        this.areaFormacao = areaFormacao;
        this.nivelInstrucao = nivelInstrucao;
    }

    //Getters e Setters
    public void imprimeInfo(){
        System.out.println(this.getNome());
        System.out.println(this.siape);
    }
}
