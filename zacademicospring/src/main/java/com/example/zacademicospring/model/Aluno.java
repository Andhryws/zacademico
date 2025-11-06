package model;
public class Aluno extends Usuario{
    private String matricula;
    private int ano_conclusao_fundamental;
    private Escola escolaOrigem;

    public Aluno(String nome, String cpf, String email_pessoal, String matricula){
        super(nome,cpf,email_pessoal);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getAno_conclusao_fundamental() {
        return this.ano_conclusao_fundamental;
    }

    public void setAno_conclusao_fundamental(int ano_conclusao_fundamental) {
        this.ano_conclusao_fundamental = ano_conclusao_fundamental;
    }

    public Escola getEscolaOrigem() {
        return this.escolaOrigem;
    }

    public void setEscolaOrigem(Escola escolaOrigem) {
        this.escolaOrigem = escolaOrigem;
    }

    public int somar(int a, int b){
        return a+b;
    }
    
    public int somar(int a, int b, int c){
        return a + b+ c;
    }

    public double somar(double a, double b){
        return a + b;
    }

    @Override
    public void imprimeInfo(){
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
        System.out.println(this.matricula);
    }
}
