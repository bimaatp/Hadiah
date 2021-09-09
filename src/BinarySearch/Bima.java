package BinarySearch;
import java.util.Scanner;
import java.util.Arrays;

public class Bima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cari, num;
        int angka[] = { 7, 3, 1, 5, 9 };
        Arrays.sort(angka); 
        System.out.println("Pada array "+ Arrays.toString(angka));
        System.out.print("Angka ? ");
        cari = input.nextInt(); 
        num = Arrays.binarySearch(angka, cari); 
        if (num >= 0) {
            System.out.println("Ditemukan pada index "+ num);
        } else {
            System.out.println("Tidak Ditemukan!");
        }
    }
}
