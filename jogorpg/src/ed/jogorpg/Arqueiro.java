package ed.jogorpg;

/**
 * Classe principal para executar o jogo de RPG.
 * Cria instâncias de Guerreiro, Mago e Arqueiro, e demonstra suas habilidades.
 */
public class Arqueiro extends Personagem {
    /**
     * Construtor da classe Arqueiro.
     *
     * @param nome Nome do personagem.
     */
    public Arqueiro(String nome) {
        super(nome);
        ataqueBase = 10;
    }

    /**
     * Método para usar a habilidade especial do Arqueiro.
     * Neste caso, o Arqueiro usa a habilidade "Chuva de Flechas".
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Chuva de Flechas!");
    }
}
