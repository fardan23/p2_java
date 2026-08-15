package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu9_WhileDeretPenjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        
        int loop = 1;
        int jumlah = 0;
        while (loop <= angka) {
            System.out.print(loop);
            jumlah += loop;
            if (loop < angka) {
                System.out.print(" + ");
            }
            loop++;
        }
        System.out.println(" = " + jumlah);
    }
}
