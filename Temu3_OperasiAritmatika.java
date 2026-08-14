package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu3_OperasiAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Input bilangan kedua: ");
        int bil2 = input.nextInt();
        
        int jumlah = bil1 + bil2;
        int kurang = bil1 - bil2;
        int kali = bil1 * bil2;
        int bagi = bil1 / bil2;
        int sisabagi = bil1 % bil2;
        
        System.out.println("\nHasil penjumlahan: " + jumlah);
        System.out.println("Hasil pengurangan: " + kurang);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);
        System.out.println("Hasil modulus: " + sisabagi);
    }
}
