package ed.jogorpg;

/**
 * Classe principal para executar o jogo de RPG.
 * Cria instâncias de Guerreiro, Mago e Arqueiro, e demonstra suas habilidades.
 */
public class Mago extends Personagem {
    /**
     * Construtor da classe Mago.
     *
     * @param nome Nome do personagem.
     */
    public Mago(String nome) {
        super(nome);
        ataqueBase = 12;
    }

    /**
     * Método para usar a habilidade especial do Mago.
     * Neste caso, o Mago usa a habilidade "Bola de Fogo".
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Bola de Fogo!");
    }
}
