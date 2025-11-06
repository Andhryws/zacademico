package model;
public class TecAdm extends Usuario{
    int siape;
    String especialidade;
    String nivelInstrucao;

    public TecAdm (String nome, String cpf, String email_pessoal, int siape, String especialidade, String nivelInstrucao){
        super(nome, cpf, email_pessoal);
        this.siape = siape;
        this.especialidade = especialidade;
        this.nivelInstrucao = nivelInstrucao;
    }
    
    @Override
    public void imprimeInfo(){
        System.out.println(this.getIdade());
        System.out.println(this.getNome());
        System.out.println(this.siape);
        System.out.println(this.especialidade);
        System.out.println(this.nivelInstrucao);
    }
}