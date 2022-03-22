public class PersonagemGame {

    /**
     * A classe deve se chamar PersonagemGame
     * Deve possuir um atributo privado chamado saudeAtual
     * Deve possuir um atributo privado chamado nome
     * Deve possuir os métodos getters e setters para ambos atributos:
     * public int getSaudeAtual()
     * public void setSaudeAtual(int saudeAtual)
     * public String getNome()
     * public void setNome(String nome)
     */
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
