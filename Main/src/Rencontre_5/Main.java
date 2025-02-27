package Rencontre_5;

import Rencontre_5.Exercise;

public class Main {
    public static void main(String[] args) {
        Exercise.exercise1();
        Exercise.exercise2();
        Exercise.exercise3();
        Exercise.exercise4();
        Exercise.exercise5();
        Exercise.exercise6();
        Exercise.exercise7();
        Exercise.exercise8();
        Exercise.exercise9();
        Exercise.exercise10();
        Exercise.exercise11();
        int[] array1 = {1, 2, 3, 4, 5};
        int sum = Exercise.exercise12(array1);
        System.out.println("Sum of array elements: " + sum);
        int[] array2 = {1, 15, 3, 2, 6};
        int counter = Exercise.exercise13(array2);
        System.out.println("Sum of even numbers: " + counter);
        int[] array3 = {1, 24, 23, 22, 1, 2, 1, 4, 3, 1};
        counter = Exercise.exercise14(array3, 1);
        System.out.println("Sum of occurrences of the number 1: " + counter);


        int[] array4 = {9, 8, 7, 6, 5};
        int[] reversedArray = Exercise.exercise15(array4);
        System.out.print("Reversed array: ");
        printArray(reversedArray);

        Exercise.exercise16();
        Exercise.exercise17();
        Exercise.exercise18();
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
