import java.util.Scanner;

public class StoreDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the amount of boxes of chocolate you would like to buy : ");
        int Box = sc.nextInt();

        System.out.println("Type the price per box : ");
        double PricePerBox = sc.nextDouble();

        double ItemMultipliedPerPrice = (Box * PricePerBox);
        double DiscountOf10 = ItemMultipliedPerPrice - (ItemMultipliedPerPrice * 0.10);
        double DiscountOf15 = ItemMultipliedPerPrice - (ItemMultipliedPerPrice * 0.15);

        final String Prompt10 = "You can use a 10% discount";
        final String Prompt15 = "You can use a 15% discount";
        final String PromptPrice = "The price is : ";

        if (Box >= 5 && Box < 50) {
            System.out.println(Prompt10);
            System.out.println(PromptPrice + DiscountOf10);

        }
        else if (Box >= 50) {
            System.out.println(Prompt15);
            System.out.println(PromptPrice + DiscountOf15);

        }
    }
}
