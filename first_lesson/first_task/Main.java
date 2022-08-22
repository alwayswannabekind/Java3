package first_task.first_lesson.first_task;

public class Main {
    public static void main(String[] args) {
        System.out.println("First task");
        System.out.println("-------------------\n");
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6};

        int i;
        for(i = 0; i < array.length; ++i) {
            System.out.printf(array[i] + " ");
        }

        System.out.println();
        System.out.println("swap");
        swapElements(array, 0, 1);

        for(i = 0; i < array.length; ++i) {
            System.out.printf(array[i] + " ");
        }

        System.out.println("\n");
        System.out.println("-------------------");
    }

    private static <T> void swapElements(T[] array, int firstElement, int secondElement) {
        if (array.length > firstElement & array.length > secondElement) {
            T x = array[secondElement];
            array[secondElement] = array[firstElement];
            array[firstElement] = x;
        } else {
            System.out.printf("Array doesn't have such an elements");
        }

    }
}