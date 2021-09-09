package EvenOdd;

public class Bima {
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 12, 13, 23, 123};
        for (int i : number) {
            if (i % 2 == 0) {
                System.out.println(i + " Adalah bilangan genap");
            } else if (i % 2 == 1) {
                System.out.println(i + " Adalah bilangan ganjil");
            }
        }
    }
}
