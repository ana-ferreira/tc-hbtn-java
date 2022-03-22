public class PersonagemGame {

    private int saudeAtual;
    private String nome;
    private String status;

    public String getStatus() {
        return status;
    }
    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (saudeAtual == 0){
            this.status = "morto";
        } else {
            this.status = "vivo";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano (int quantidadeDeDano){
        if (this.getSaudeAtual()-quantidadeDeDano < 0){
            this.setSaudeAtual(0);
        }else{
            this.setSaudeAtual(this.getSaudeAtual()-quantidadeDeDano);
        }
    }

    public void receberCura(int quantidadeDeCura){
        this.setSaudeAtual(this.getSaudeAtual()+quantidadeDeCura);
        if (saudeAtual > 100){
            this.saudeAtual = 100;
        }
    }
}
