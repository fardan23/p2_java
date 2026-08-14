package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu4_HitungTHR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lama Bekerja (bulan) \t: ");
        int lamaKerja = input.nextInt();
        System.out.print("Gaji Perbulan \t\t: ");
        int gaji = input.nextInt();

        int thr;
        if (lamaKerja >= 12) {
            thr = gaji;
        } else {
            thr = gaji / lamaKerja;
        }
        System.out.println("THR yang didapat \t: " + thr);
    }
}
