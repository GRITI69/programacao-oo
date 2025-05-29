package ed.sistemabancario;

/**
 * Classe que representa uma Conta Poupança.
 */
public class ContaPoupanca extends Conta {
    /**
     * Construtor da classe ContaPoupanca.
     *
     * @param cliente Nome do cliente titular da conta.
     * @param saldo   Saldo inicial da conta.
     */
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Aplica juros diários de 0.08% ao saldo da conta poupança.
     * O saldo é atualizado com o novo valor após a aplicação dos juros.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008; // 0.08% ao dia
    }

    /**
     * Imprime o extrato da conta poupança, incluindo o nome do cliente e o saldo atual.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança - Cliente: " + cliente + ", Saldo: " + saldo);
    }
}
