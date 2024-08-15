import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int tpn = 0;

        for (int i = 1; i < number; i++) {
            int remaining = number % i;
            if (remaining == 0) {
                tpn += i;
            }
        }
        if (tpn == number) {
            System.out.println("Sayınız mükemmel sayıdır ; Değeriniz = " + tpn);
        } else {
            System.out.println("Sayınız mükemmel sayı değildir ; Değeriniz = " + tpn);
        }

    }
}