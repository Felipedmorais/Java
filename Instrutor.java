public class Instrutor extends Pessoa {
    private String especializacao;

    public Instrutor(String name, int idade, String especializacao) {
        super(name, idade);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
