import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ran = (int) (Math.random() * 100);
        int a;
        do {
            System.out.println("Guess the number ");
            a = sc.nextInt();
            if (a == ran) {
                System.out.println("Whoooho Currect ");
                break;
            } else if (a > ran) {
                System.out.println("Your number is too large");
            } else{
                System.out.println("Your number is too low");
            }
        } while (a >= 0);
        System.out.println("My number was "  + ran);
    }
}
