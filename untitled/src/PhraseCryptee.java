package Test;
import java.util.Scanner;

public class PhraseCryptee {

    public static String crypterPhrase(String phrase) {

        String phraseCryptee = phrase.replaceAll("a", "5").replaceAll("o", "v").replaceAll("e", "B");
        return phraseCryptee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Veuillez saisir une phrase : ");
        String phrase = scanner.nextLine();


        String phraseCryptee = crypterPhrase(phrase);


        System.out.println("Phrase cryptée : " + phraseCryptee);

        scanner.close();
    }
}
