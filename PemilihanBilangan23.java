import java.util.Scanner;

public class PemilihanBilangan23 {
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        System.out.println("Angka " + (angka % 2 == 0 ? "Termasuk Bilangan Genap" : " Termasuk Bilangan Ganjil"));

      }
}
    