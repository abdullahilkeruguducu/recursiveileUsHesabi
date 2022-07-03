//Patika.dev linkim --> https://app.patika.dev/ailker

import java.util.Scanner;

public class Main {
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban degeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Us degeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuc : " + result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        power();
    }
}