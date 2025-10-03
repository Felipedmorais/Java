import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Evento evento = new Evento("Festival de Jogos de Tabuleiro");

                Instrutor instrutor1 = new Instrutor("Carlos", 35, "Xadrez");
                Instrutor instrutor2 = new Instrutor("Ana", 28, "War");

                Jogo jogo1 = new Jogo(instrutor1, "Torneio de Xadrez");
                Jogo jogo2 = new Jogo(instrutor2, "Campeonato War");

                evento.adicionarjogo(jogo1);
                evento.adicionarjogo(jogo2);

                Particpante p1 = new Particpante("João", 20, true);
                Particpante p2 = new Particpante("Maria", 22, false);
                Particpante p3 = new Particpante("Pedro", 19, true);

                evento.adicionarparticipantes(p1);
                evento.adicionarparticipantes(p2);
                evento.adicionarparticipantes(p3);

                evento.exibirdetalhes();


                sc.close();
        }
}
