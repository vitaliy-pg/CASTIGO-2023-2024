package Main;

public class java2 {
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        // Obtener todos los múltiplos de 5 entre begin y end
        int[] multiplesOf5 = getMultiplesOf5(begin, end);

        // Mostrar cada múltiplo de 5
        for (int multiple : multiplesOf5) {
            System.out.println(multiple);
        }

        // Calcular la suma de todos los múltiplos de 5
        int sum = calculateSum(multiplesOf5);
        System.out.println("La suma de los múltiplos de 5 es: " + sum);
    }

    // Función para obtener todos los múltiplos de 5 entre begin y end
    public static int[] getMultiplesOf5(int begin, int end) {
        List<Integer> multiples = new ArrayList<>();

        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiples.add(i);
            }
        }

        // Convertir la lista de múltiplos a un array
        int[] multiplesArray = new int[multiples.size()];
        for (int i = 0; i < multiples.size(); i++) {
            multiplesArray[i] = multiples.get(i);
        }

        return multiplesArray;
    }

    // Función para calcular la suma de todos los valores en un array
    public static int calculateSum(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum;
    }
}