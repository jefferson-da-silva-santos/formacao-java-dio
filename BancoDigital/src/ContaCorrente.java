public class ContaCorrente extends Conta implements IConta {

    private static int SEQUENCIAL = 0;

    public ContaCorrente() {
        super.numero = SEQUENCIAL++;
        super.agencia = Conta.AGENCIA_PADRAO;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }
}
