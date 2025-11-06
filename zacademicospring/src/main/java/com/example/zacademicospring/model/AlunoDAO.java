package model;

import java.util.List;
import org.springframework.jdbc.core.simple.JdbcClient;


@Repository
public class AlunoDAO {
    private final JdbcClient jdbcClient;

    public AlunoDAO(JdbcClient jdbcClient){
    this.jdbcClient = jdbcClient;
    }

    public Integer create(Aluno aluno){
        String sqlInsert = "insert into aluno(nome, cpf, idade, email_pessoal, senha, matricula) values (:nome, :cpf:, :idade, :email_pessoal, :matricula)";

        return jdbcClient.sql(sqlInsert)
        .param("nome", aluno.getNome())
        .param("cpf", aluno.getCpf())
        .param("idade", aluno.getEmail_pessoal())
        .param("matricula", aluno.getMatricula())
        .update();
    }

}

