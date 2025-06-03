package empresa;

import java.util.List;

public class Empresa {
    public String mostrarFolhaDePagamento(List<Funcionario> funcionarios) {
        String result = "";
        for (int i = 0; i <= funcionarios.size()-1; i++) {
            result = funcionarios.get(i).getNome() + " " + funcionarios.get(i).getSalarioBase();
        }
        return result;
    }
}
