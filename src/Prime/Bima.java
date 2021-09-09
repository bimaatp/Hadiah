package Prime;
import java.util.Scanner;

public class Bima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Primes Checker =====");
        int number, check = 0;
        System.out.print("Number ? ");
        number = input.nextInt();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                check++;
            }
        }
        if (check == 1) {
            System.out.println(number + " is Primes");
        } else {
            System.out.println(number + " is not Primes");
        }
    }
}
