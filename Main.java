import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o tamanho da sua matriz: ");
                int n = sc.nextInt();

                int[][] matriz = new int[n][n];

                for (int i = 0; i < n; i++){
                        for (int j = 0;j < n; j++){
                                System.out.println("Digite o valor da posição " + i + " " + j);
                                matriz[i][j] = sc.nextInt();
                        }
                }
                System.out.println("----------------------------------");
                System.out.println();
                number1 m1 =  new number1(matriz);
                m1.exibirmatriz(matriz, n);

                sc.close();
        }
}
