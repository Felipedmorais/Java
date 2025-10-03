public class Jogo {
    private Instrutor instrutor;
    private String nomedojogo;

    public Jogo(Instrutor instrutor, String nomedojogo) {
        this.instrutor = instrutor;
        this.nomedojogo = nomedojogo;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public String getNomedojogo() {
        return nomedojogo;
    }
}
