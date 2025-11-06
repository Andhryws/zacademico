package com.example.zacademicospring.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewCadastraAluno {
    
    
    public List<String> getDadosAluno(){
        Scanner scanner = new Scanner(System.in);
        List<String> dadosAluno = new ArrayList<String>();
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        dadosAluno.add(nome);
        System.out.println("Digite o cpf do aluno:");
        String cpf = scanner.nextLine();
        dadosAluno.add(cpf);
        System.out.println("Digite o e-mail pessoal do aluno:");
        String emalPessoal = scanner.nextLine();
        dadosAluno.add(emalPessoal);
        System.out.println("Digite o matrícula do aluno:");
        String matricula = scanner.nextLine();
        dadosAluno.add(matricula);

        return dadosAluno;
    }
}
