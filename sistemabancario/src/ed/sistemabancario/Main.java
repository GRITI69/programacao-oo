package ed.sistemabancario;

/**
 * Classe principal para execução do Sistema Bancário.
 * Realiza operações de exemplo com contas bancárias.
 */
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Kevyn", 6000);
        ContaPoupanca cp = new ContaPoupanca("Vinicius", 2000);
        ContaSalario cs = new ContaSalario("Lazaro", 5800);

        cc.depositar(200);
        cp.sacar(100);
        cs.transferir(cc, 300);

        cc.aplicarJurosDiarios();
        cp.aplicarJurosDiarios();
        cs.aplicarJurosDiarios();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}
