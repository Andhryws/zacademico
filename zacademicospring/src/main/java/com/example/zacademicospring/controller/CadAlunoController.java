package com.example.zacademicospring.controller;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.AlunoDAO;

public class CadAlunoController {
    List <Aluno> cadastroAlunos;

    public CadAlunoController(){
        this.cadastroAlunos = ArrayList<Aluno>();
    }

    public void cadastraAluno(List<String> dadosAluno){
        String nome = dadosAluno.get(0);        
        String cpf = dadosAluno.get(1);        
        String emailPessoal = dadosAluno.get(2);        
        String matricula = dadosAluno.get(3);        
        
        Aluno aluno = new Aluno(nome, cpf, emailPessoal, matricula);
        
        AlunoDAO alunoDAO = new AlunoDAO( this.cadastroAlunos);
        alunoDAO.createAluno(aluno);
    }
}
