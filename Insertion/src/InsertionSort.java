public class InsertionSort {

    public static void insertionSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }

    public static void insertionSort3(int[] array) {
        for (int i = array.length - 2; i >= 0; i--) {
            int temp = array[i];
            int j = i + 1;

            while (j < array.length && array[j] < temp) {
                array[j - 1] = array[j];
                j++;
            }

            array[j - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {20, 50, 90, 30, 10, 40, 70, 80, 100, 60};
        int[] array2 = array1.clone();

        System.out.println("Array asli:");
        printArray(array1);

        insertionSort2(array1);
        System.out.println("=====Descending=====");
        System.out.println("Array setelah diurutkan (Descending):");
        printArray(array1);

        insertionSort3(array2);
        System.out.println("=====Ascending=====");
        System.out.println("Array setelah diurutkan (Ascending dari ujung kanan):");
        printArray(array2);
    }
}
