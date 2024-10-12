public class Shorting {
    public static void main(String[] args) {
        int[] array = {70, 30, 20, 40, 60, 50};

        System.out.println("Array sebelum diurutkan:");
        printArray(array);

        bubbleShort(array);

        System.out.println("\nArray setelah diurutkan:");
        printArray(array);
    }

    public static void bubbleShort(int[] array) {
        boolean swapped = true;
        int start = 0;
        int end = array.length - 1;

        while (swapped) {
            swapped = false;

            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;

            end--;

            swapped = false; // Reset swapped untuk pass kedua
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    swapped = true;
                }
            }

            start++;
        }
    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
