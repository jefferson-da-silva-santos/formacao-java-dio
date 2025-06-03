package empresa;

public class FuncionarioComum extends Funcionario {
    public FuncionarioComum(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    double calcularSalarioFinal() {
        return getSalarioBase();
    }
}
