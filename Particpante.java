public class Particpante extends Pessoa {
    private boolean participando;

    public Particpante(String name, int idade, boolean participando) {
        super(name, idade);
        this.participando = participando;
    }

    public boolean participando(){
         return participando;
    }

    public void setParticipando(boolean participando) {
        this.participando = participando;
    }

}
