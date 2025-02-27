package Test;
import java.util.Scanner;

public class Chiffrement {

    public static String chiffrementPhrase(String phrase, int decalage) {
        StringBuilder phraseChiffree = new StringBuilder();

        // Parcours de chaque caractère de la phrase
        for (int i = 0; i < phrase.length(); i++) {
            char caractere = phrase.charAt(i);

            // Chiffrement uniquement pour les lettres de l'alphabet
            if (Character.isLetter(caractere)) {
                // Décalage du caractère en fonction du décalage spécifié
                char nouveauCaractere = (char) (caractere + decalage);

                // Gestion des lettres en dehors de l'alphabet
                if ((Character.isUpperCase(caractere) && nouveauCaractere > 'Z') ||
                        (Character.isLowerCase(caractere) && nouveauCaractere > 'z')) {
                    nouveauCaractere = (char) (caractere - (26 - decalage));
                }

                // Ajout du caractère chiffré à la phrase chiffrée
                phraseChiffree.append(nouveauCaractere);
            } else {
                // Ajout des caractères autres que des lettres sans modification
                phraseChiffree.append(caractere);
            }
        }

        return phraseChiffree.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir une phrase
        System.out.print("Veuillez saisir une phrase à chiffrer : ");
        String phrase = scanner.nextLine();

        // Demande à l'utilisateur de saisir un décalage
        int decalage;
        do {
            System.out.print("Veuillez saisir un nombre entre 1 et 25 : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Vous devez saisir un nombre entier entre 1 et 25.");
                scanner.next();
            }
            decalage = scanner.nextInt();
        } while (decalage < 1 || decalage > 25);

        // Chiffre la phrase saisie avec le décalage spécifié
        String phraseChiffree = chiffrementPhrase(phrase, decalage);


        System.out.println("Phrase chiffrée : " + phraseChiffree);

        scanner.close();
    }
}
