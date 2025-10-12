import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                number1 order = new number1(1080,new Date(), Order.PedidoPago);

                if (order.getStatus().equals(Order.PedidoPago)){
                        order.setStatus(Order.Processando);
                        if (order.getStatus().equals(Order.Processando)){
                                order.setStatus(Order.Entregue);
                        }
                }

                System.out.println(order);

        }
}
