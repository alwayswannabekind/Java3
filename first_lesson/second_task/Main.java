package first_task.first_lesson.second_task;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println("Second task");
        System.out.println("-------------------\n");
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6};
        arrayToList(array);
        System.out.println("\n");
        System.out.println("-------------------");
    }

    private static <T> void arrayToList(T[] array) {
        ArrayList<T> arrayList = new ArrayList();

        int i;
        for(i = 0; i < array.length; ++i) {
            arrayList.add(array[i]);
        }

        for(i = 0; i < arrayList.size(); ++i) {
            System.out.printf(arrayList.get(i) + " ");
        }

    }
}