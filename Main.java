import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                number1 motor = new number1(120);
                number2 Carro = new number2(motor);

                Carro.ligarCarro();

        }
}
