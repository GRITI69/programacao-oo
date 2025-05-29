package ed.jogorpg;

/**
 * Classe principal para executar o jogo de RPG.
 * Cria instâncias de Guerreiro, Mago e Arqueiro, e demonstra suas habilidades.
 */
public abstract class Personagem {
    /**
     * Nome do personagem.
     */
    // Atributo protegido para permitir acesso em subclasses
    // e manter encapsulamento
    protected String nome;
    protected int hp = 100;
    protected int ataqueBase = 10;

    /**
     * Construtor da classe Personagem.
     *
     * @param nome Nome do personagem.
     */
    public Personagem(String nome) {
        this.nome = nome;
    }

    /**
     * Método para atacar outro personagem.
     *
     * @param inimigo O personagem inimigo a ser atacado.
     */
    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase);
    }

    /**
     * Método para defender-se de um ataque.
     *
     * @param dano O dano recebido.
     */
    public void defender(int dano) {
        hp -= dano;
    }

    /**
     * Método abstrato para usar habilidade especial.
     * Cada personagem terá sua própria implementação.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Método para exibir o status do personagem.
     * Exibe o nome e os pontos de vida (HP) atuais.
     */
    public void status() {
        System.out.println(nome + " - HP: " + hp);
    }
}
