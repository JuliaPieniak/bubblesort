package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] ints = {5, 2, 8, 1, 3, 6, 4, 7, 5};
        char[] chars = {'a', 'z', 'e', '1', 'o', 'b'};

        Util.bubbleSort(ints);
        Util.bubbleSort(chars);

        for (int i : ints) {
            System.out.print(i);
        }

        System.out.println();

        for (char c : chars) {
            System.out.print(c);
        }

    }
}