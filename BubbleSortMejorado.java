public class BubbleSortMejorado {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    intercambios++;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
    }
}