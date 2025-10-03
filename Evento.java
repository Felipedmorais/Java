import java.util.ArrayList;
public class Evento {
    private ArrayList<Jogo> jogos;
    private String nomeEvento;
    private ArrayList<Particpante> participantes;

    public Evento(String nomeEvento) {
        this.jogos = new ArrayList<>();
        this.participantes = new ArrayList<>();
        this.nomeEvento = nomeEvento;
    }
    public void adicionarjogo(Jogo jogo){
        jogos.add(jogo);
    }
    public void adicionarparticipantes(Particpante particpante){
        participantes.add(particpante);
    }

    public void exibirdetalhes(){
        System.out.println("Evento: "+ nomeEvento);

        System.out.println("\nJogos Evento: ");
        for (Jogo jogo: jogos){
            System.out.println("-" + jogo.getNomedojogo() + "( Instrutor: "+ jogo.getInstrutor().getName()+
                    ", Especialização " + jogo.getInstrutor().getEspecializacao()+ " )");

        }

        System.out.println("\nParticipantes");

        for (Particpante p : participantes){
            if (p.participando() == true){
                System.out.println("- " + p.getName() + " Status: Particpando!");
            }
            else{
                System.out.println("- " + p.getName() + " Status: Não Participando!");
            }
        }
    }
}
