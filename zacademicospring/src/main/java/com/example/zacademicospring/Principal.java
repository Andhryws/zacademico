

import com.example.zacademicospring.controller.CadAlunoController;
import com.example.zacademicospring.view.ViewCadastraAluno;

public class Principal {
    public static void main(String[] args){

       ViewCadastraAluno viewCadAluno= new ViewCadastraAluno();

      CadAlunoController alunoController = new CadAlunoController();

       var dadosAluno = viewCadAluno.getDadosAluno();
       alunoController.cadastraAluno(dadosAluno);
    }
}
