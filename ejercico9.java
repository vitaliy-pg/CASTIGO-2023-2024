public class ejercico9 {
}
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dimension = obtenerDimension();
        int[][] matriz = crearMatrizSimetrica(dimension);
        imprimirMatriz(matriz);
    }

    public static int obtenerDimension() {
        // Aquí puedes solicitar al usuario la dimensión de la matriz
        // y devolver el valor ingresado
    }

    public static int[][] crearMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = random.nextInt(100); // Cambia el rango de los números aleatorios según tus necesidades
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio;
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
