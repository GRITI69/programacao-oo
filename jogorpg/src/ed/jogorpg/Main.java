package ed.jogorpg;

/**
 * Classe principal para executar o jogo de RPG.
 * Cria instâncias de Guerreiro, Mago e Arqueiro, e demonstra suas habilidades.
 */
public class Main {
    /**
     * Método principal que inicia o jogo.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Criação de instâncias de cada classe
        // Guerreiro, Mago e Arqueiro
        // e demonstração de suas habilidades
        // e status
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        // Exibindo status iniciais
        g.status();
        m.status();
        a.status();

        // Exibindo habilidades especiais
        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        // Exibindo status após ataque
        g.status();
        m.status();
        a.status();
    }
}
