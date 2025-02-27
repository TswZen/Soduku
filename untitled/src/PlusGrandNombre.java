import java.util.Scanner;

public class PlusGrandNombre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le premier nombre : ");
        int Nombre1 = sc.nextInt();

        System.out.println("Veuillez entrer le deuxieme nombre : ");
        int Nombre2 = sc.nextInt();

        if(Nombre1 > Nombre2){
            System.out.println("Le premier nombre est le plus grand :" + Nombre1);
        }
        else{
        System.out.println("Le deuxieme nombre est le plus grand : " + Nombre2);
            sc.close();
        }
    }
}
