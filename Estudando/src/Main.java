import empresa.Empresa;
import empresa.Funcionario;
import empresa.FuncionarioComum;
import empresa.Gerente;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FuncionarioComum f1 = new FuncionarioComum("Jefferson", 3778);
        FuncionarioComum f2 = new FuncionarioComum("Lucas", 2888);
        Gerente f3 = new Gerente("Kassio", 12222, 899);
        Gerente f4 = new Gerente("Boreu", 12222, 899);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add((Funcionario) f1);
        funcionarios.add((Funcionario) f2);
        funcionarios.add((Funcionario) f3);
        funcionarios.add((Funcionario) f4);

        Empresa emp = new Empresa();
        String resu = emp.mostrarFolhaDePagamento((List<empresa.Funcionario>) funcionarios);

        System.out.println(resu);


    }
}