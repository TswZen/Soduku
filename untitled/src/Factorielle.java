//for
package Test;
public class Factorielle {

    public static int factorielleFor(int n) {
        int resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }

    public static void main(String[] args) {
        int nombre = 5; // Exemple de nombre pour tester
        System.out.println("Factorielle avec for : " + factorielleFor(nombre));
    }
}

// While
//public class Factorielle {
//
//    public static int factorielleWhile(int n) {
//        int resultat = 1;
//        int i = 1;
//        while (i <= n) {
//            resultat *= i;
//            i++;
//        }
//        return resultat;
//    }
//
//    public static void main(String[] args) {
//        int nombre = 5;
//        System.out.println("Factorielle avec while : " + factorielleWhile(nombre));
//    }
//}


// Do while
//public class Factorielle {
//
//    public static int factorielleDoWhile(int n) {
//        int resultat = 1;
//        int i = 1;
//        do {
//            resultat *= i;
//            i++;
//        } while (i <= n);
//        return resultat;
//    }
//
//    public static void main(String[] args) {
//        int nombre = 5; // Exemple de nombre pour tester
//        System.out.println("Factorielle avec do...while : " + factorielleDoWhile(nombre));
//    }
//}


