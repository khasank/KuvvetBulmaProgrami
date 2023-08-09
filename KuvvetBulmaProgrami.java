import java.util.Scanner;

public class KuvvetBulmaProgrami {
    public static void main(String[] args) {
        int n;
        int kuvvet = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();
        System.out.println(n + " Sayısına kadar 4 ün kuvvetleri ;");
        while (n > kuvvet) {
            System.out.println(kuvvet);
            kuvvet = kuvvet * 4;
        }

        kuvvet = 1;
        System.out.println("\n" + n + " Sayısına kadar 5 in kuvvetleri ;");
        while (n > kuvvet) {
            System.out.println(kuvvet);
            kuvvet = kuvvet * 5;
        }
    }
}
