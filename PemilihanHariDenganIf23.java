import java.util.Scanner;

public class PemilihanHariDenganIf23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int hari = sc.nextInt();

        if (hari >= 1 && hari <= 5) {
            System.out.println("weekday");
        } else if (hari == 6 || hari == 7) {
            System.out.println("weekend");
        } else {
            System.out.println("invalid number");
        }

        sc.close();
    }
}