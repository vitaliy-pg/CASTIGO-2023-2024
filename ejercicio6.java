public class ejercicio6 {
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        List<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.print(numero + " = ");
        for (int i = 0; i < factoresPrimos.size(); i++) {
            System.out.print(factoresPrimos.get(i));
            if (i < factoresPrimos.size() - 1) {
                System.out.print(" * ");
            }
        }
    }

    public static List<Integer> descomponerEnFactoresPrimos(int numero) {
        List<Integer> factoresPrimos = new ArrayList<>();

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos.add(i);
                numero /= i;
            }
        }

        return factoresPrimos;
    }
}