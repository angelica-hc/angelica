import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] pruebas = {
            {5, 3, 8, 2},
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1}
        };

        for (int[] arr : pruebas) {
            int[] copia = Arrays.copyOf(arr, arr.length);

            System.out.println("Original: " + Arrays.toString(arr));

            BubbleSortMejorado.bubbleSort(copia);

            System.out.println("Ordenado: " + Arrays.toString(copia));
            System.out.println("----------------------");
        }
    }
}