package Rencontre_5;

import java.util.Scanner;

public class Exercise {
    private static final Scanner sc = new Scanner(System.in);

    public static int countVowels(String sentence) {
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isWordInSentence(String sentence, String word) {
        return sentence.contains(word);
    }

    public static int compareNumbers(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else if (number2 > number1) {
            return number2;
        } else {
            return number1;
        }
    }

    public static void exercise1() {
        final String PROMPT_SENTENCE = "Write a sentence: ";
        final String NBR_VOWELS = "The number of vowels is: ";

        System.out.print(PROMPT_SENTENCE);
        String sentence = sc.nextLine();
        int vowelsCount = countVowels(sentence);
        System.out.println(NBR_VOWELS + vowelsCount);
    }

    public static void exercise2() {
        final String PROMPT_SENTENCE = "Write a sentence: ";
        final String PROMPT_WORD = "Write a word: ";
        final String WORD_IN_SENTENCE = "The word is in the sentence";
        final String WORD_NOT_IN_SENTENCE = "The word is not in the sentence";

        System.out.print(PROMPT_SENTENCE);
        String sentence = sc.nextLine();
        System.out.print(PROMPT_WORD );
        String word = sc.nextLine();

        if (isWordInSentence(sentence, word)) {
            System.out.println(WORD_IN_SENTENCE);
        }else {
            System.out.println(WORD_NOT_IN_SENTENCE);
        }
    }

    public static void exercise3() {
        final String PROMPT_NUMBER1 = "Write a number: ";
        final String PROMPT_NUMBER2 = "Write a second number: ";
        final String FIRST_SUPERIOR = "The first number is superior!";
        final String SECOND_SUPERIOR = "The second number is superior!";
        final String BOTH_EQUAL = "Both numbers have the same value!";


        System.out.print(PROMPT_NUMBER1);
        int number1 = sc.nextInt();
        System.out.print(PROMPT_NUMBER2 );
        int number2 = sc.nextInt();
        sc.nextLine();

        int result = compareNumbers(number1, number2);
        System.out.println(result == number1 ? FIRST_SUPERIOR :
                result == number2 ? SECOND_SUPERIOR  : BOTH_EQUAL);
    }

    public static void exercise4() {
        final String PROMPT_GRADE = "Write your grade on 20: ";
        final String BRAVO = "Bravo!";
        final String TRY_AGAIN = "Try again!";

        System.out.print(PROMPT_GRADE);
        int grade = sc.nextInt();
        System.out.println(grade >= 10 ? BRAVO  : TRY_AGAIN);
    }

    public static void exercise5() {
        final String PROMPT_Weight = "Enter your weight: ";
        final String LESS_50 = "Less than 50 kg: Light weight";
        final String LESS_70 = "Between 50 kg and 70 kg: Middle weight";
        final String OVER_70 = "Higher than 70 kg: Heavy weight";

        System.out.print(PROMPT_Weight);
        int weight = sc.nextInt();
        sc.nextLine();

        if (weight < 50) {
            System.out.println(LESS_50);
        } else if (weight < 70) {
            System.out.println(LESS_70);
        } else {
            System.out.println(OVER_70);
        }
    }

    public static void exercise6() {
        final String PROMPT_DAY = "Enter a number between 1-7 : ";
        final String INVALID_VALUE = "INVALID NUMBER !";

        System.out.println(PROMPT_DAY);
        int Day = sc.nextInt();

        switch (Day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
        if(Day < 1 || Day > 7){
            System.out.println(INVALID_VALUE);
        }


    }

    public static void exercise7() {
        final String PROMPT_YEAR = "Write a year : ";
        final String STR_YEAR_BISSEXTILE = "Year bissextile";
        final String STR_NOT_BISSEXTILE = "Year non-bissextile";

        System.out.println(PROMPT_YEAR);
        int Year = sc.nextInt();

        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0))
            System.out.println(STR_YEAR_BISSEXTILE);
        else {
            System.out.println(STR_NOT_BISSEXTILE);
        }
    }

    public static  void exercise8() {
       final String PROMPT_GRADE = "Write your grade : ";
       final String GRADE_F = "Grade between 0 & 9 : F ";
       final String GRADE_D = "Grade between 10 & 12 : D ";
       final String GRADE_C = "Grade between 13 & 15 : C ";
       final String GRADE_B = "Grade between 16 & 18 : B ";
       final String GRADE_A = "Grade between 19 & 20 : A ";
       final String ERROR = "Invalid value";

            System.out.println(PROMPT_GRADE);
            int Grade = sc.nextInt();

            if(Grade >= 0 && Grade <= 9){
                System.out.println(GRADE_F);
            } else if (Grade >= 10 && Grade <= 12) {
                System.out.println(GRADE_D);
            } else if (Grade >= 13 && Grade <= 15) {
                System.out.println(GRADE_C);
            }
              else if (Grade >= 16 && Grade <= 18) {
                System.out.println(GRADE_B);
            } else if (Grade >= 19 && Grade <= 20) {
                System.out.println(GRADE_A);
            } else{
                System.out.println(ERROR);
                }
        }

    public static void exercise9() {
    }

    public static void exercise10() {
    }

    public static void exercise11() {
    }

    public static int exercise12(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
    public static int exercise13(int[] array) {
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static int exercise14(int[] array , int number) {
        int counter = 0;
        for(int i = 0 ; i < array.length ; i ++){
            if(array[i] == number)
                counter++;
        }
        return counter;
    }

    public static int[] exercise15(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - i - 1];
        }

        return reversedArray;
    }


    public static void exercise16() {
    }

    public static void exercise17() {
    }


    public static void exercise18() {
    }
}



