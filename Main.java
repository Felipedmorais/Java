import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                LocalDate d01 = LocalDate.now();
                LocalTime d02 = LocalTime.now();
                System.out.println("A data atual é " + d01 + " Horário: " + d02 );
        }
}
