package ed.jogorpg;

/**
 * Classe principal para executar o jogo de RPG.
 * Cria instâncias de Guerreiro, Mago e Arqueiro, e demonstra suas habilidades.
 */
public class Guerreiro extends Personagem {
    /**
     * Construtor da classe Guerreiro.
     *
     * @param nome Nome do personagem.
     */
    public Guerreiro(String nome) {
        super(nome);
        ataqueBase = 15;
    }

    /**
     * Método para usar a habilidade especial do Guerreiro.
     * Neste caso, o Guerreiro usa a habilidade "Golpe Duplo".
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Golpe Duplo!");
        ataqueBase *= 2;
    }

    /**
     * Método para atacar outro personagem.
     * O Guerreiro causa dano dobrado ao atacar.
     *
     * @param inimigo O personagem inimigo a ser atacado.
     */
    @Override
    public void defender(int dano) {
        super.defender(dano / 2); // Reduz dano pela metade
    }
}
