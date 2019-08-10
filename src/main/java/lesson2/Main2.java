package lesson2;

import lesson2.array.Array;
import lesson2.array.ArrayImpl;
import lesson2.array.SortedArrayImpl;


public class Main2 {
    public static void main(String[] args) {
        final int ITER = 30000;
        Array<Double> array = new ArrayImpl<>();
        Array<Double> array2 = new ArrayImpl<>();
        Array<Double> array3 = new ArrayImpl<>();

        for (int i = 0; i < ITER; i++) {
            double j = (Math.random() * 100);
            array.add(j);
            array2.add(j);
            array3.add(j);
        }
        System.out.println(array.equals(array2) + " " + array.equals(array3) + " " + array2.equals(array3));
//        array.display();
//        array2.display();
//        array3.display();
        long start = System.currentTimeMillis();
        array.sortBubble();
        System.out.println("Сортировка пузырьком занимает " + (System.currentTimeMillis() - start) + " мс");
        long start2 = System.currentTimeMillis();
        array2.sortSelect();
        System.out.println("Сортировка выборкой занимает " + (System.currentTimeMillis() - start2) + " мс");
        long start3 = System.currentTimeMillis();
        array3.sortInsert();
        System.out.println("Сортировка вставкой занимает " + (System.currentTimeMillis() - start3) + " мс");

    }

    private static void displayArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("-----");

//      Stream.of(array).forEach(System.out::println);
        System.out.println("-----");

        for (Integer element : array) {
            System.out.println(element);
        }
    }
}
