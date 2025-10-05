public class number1 {
    private int[][] matriz;
    private int tamanho;

    public number1(int[][] matriz) {
        this.matriz = matriz;
    }

    public void exibirmatriz(int[][] matriz, int n) {
        System.out.println("Matriz digitada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


}
