public class Exercise_Conversion {
    public static void main(String[] args) {

        String toto = "Toto";
        String TOTO = "TOTO";

        if(toto != TOTO){
            System.out.println(toto.equals(TOTO));
            System.out.println(toto.equalsIgnoreCase(TOTO));
            System.out.println(toto.compareTo(TOTO));

            Integer unInteger = 25;
            System.out.println(unInteger.equals(unInteger));
            String integerVersString = Integer.toString(unInteger);
            String integerStringVersString = String.valueOf(unInteger);

            int b = 20;
            String str1 = Integer.toString(b);
            System.out.println(b);
        }
    }
}
