/*
* A classe Conta é abstrata para garantir que ela não será instanciada, ou seja,
* não será possível dar um new Conta(). Ela só serve para as classes filhas.
* */
public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public abstract void sacar(double valor);

    @Override
    public abstract void depositar(double valor);

    @Override
    public abstract void transferir(double valor, Conta contaDestino);
}
