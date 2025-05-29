package ed.sistemabancario;

/**
 * Classe abstrata que representa uma Conta Bancária genérica.
 */
public abstract class Conta {
    protected String cliente;
    protected double saldo;

      /**
     * Construtor da Conta.
     * @param cliente Nome do cliente.
     * @param saldo Saldo inicial da conta.
     */

    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    /**
     * Deposita um valor na conta.
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor) {
        saldo += valor;
    }

     /**
     * Realiza um saque na conta.
     * @param valor Valor a ser sacado.
     */
    public void sacar(double valor) {
        saldo -= valor;
    }

     /**
     * Realiza a transferência de um valor para outra conta.
     * @param destino Conta de destino.
     * @param valor Valor a ser transferido.
     */
    public void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

       /**
     * Aplica os juros diários de acordo com o tipo de conta.
     */
    public abstract void aplicarJurosDiarios();
/**
     * Imprime o extrato da conta.
     */
    public abstract void imprimirExtrato();
}
