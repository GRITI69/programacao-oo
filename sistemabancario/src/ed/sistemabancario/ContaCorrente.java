package ed.sistemabancario;

/**
 * Classe que representa uma Conta Corrente.
 */
public class ContaCorrente extends Conta {
    /**
     * Construtor da classe ContaCorrente.
     *
     * @param cliente Nome do cliente titular da conta.
     * @param saldo   Saldo inicial da conta.
     */
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Aplica juros diários de 0.1% ao saldo da conta corrente.
     * O saldo é atualizado com o novo valor após a aplicação dos juros.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001; // 0.1% ao dia
    }

    /**
     * Imprime o extrato da conta corrente, incluindo o nome do cliente e o saldo atual.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente - Cliente: " + cliente + ", Saldo: " + saldo);
    }
}
