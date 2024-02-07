public class ejercicio4 {
}
import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        int N = 10;
        int[][] multiplicationTables = generateMultiplicationTables(N);

        for (int i = 0; i < N; i++) {
            System.out.println("Tabla de multiplicar del número " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + multiplicationTables[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generateMultiplicationTables(int N) {
        int[][] multiplicationTables = new int[N][10];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTables[i][j] = i * j;
            }
        }

        return multiplicationTables;
    }
}