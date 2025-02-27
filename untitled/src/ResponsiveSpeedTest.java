import java.util.Scanner;

class ResponsiveSpeedTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed of the car : ");
        double speed = sc.nextDouble();

        System.out.println("Enter the speed limit : ");
        double limit = sc.nextDouble();

        double SpeedAllowed = limit - 30;

        if (speed > limit) {
            System.out.println("You are too fast, slow down");
        } else if (speed < SpeedAllowed) {
            System.out.println("Speed up , you're going to be late");
        } else if (speed < limit) {
            System.out.println("Thank you for respecting the limit");
        }
        sc.close();
    }
}