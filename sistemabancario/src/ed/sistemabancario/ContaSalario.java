package ed.sistemabancario;

/**
 * Classe que representa uma Conta Poupança.
 */
public class ContaSalario extends Conta {
    /**
     * Construtor da Conta Corrente.
     * @param cliente Nome do cliente.
     * @param saldo Saldo inicial.
     */
    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Aplica juros diários de 0.05% ao saldo da conta salário.
     * O saldo é atualizado com o novo valor após a aplicação dos juros.
     */
    @Override
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }

    /**
     * Imprime o extrato da conta salário, incluindo o nome do cliente e o saldo atual.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Salário - Cliente: " + cliente + ", Saldo: " + saldo);
    }
}
