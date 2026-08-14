package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu3_HitungAngsuranPinjaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total pinjaman: ");
        int pinjaman = input.nextInt();
        System.out.print("Lama pinjam (bulan): ");
        int lama = input.nextInt();
        
        int pokokPinjamanPerbulan = pinjaman / lama;
        double bungaPertahun = pinjaman * 0.1;
        double bungaPerbulan = bungaPertahun / 12;
        double cicilan = pokokPinjamanPerbulan + bungaPerbulan;
        
        System.out.println("Pokok pinjaman perbulan: " + pokokPinjamanPerbulan);
        System.out.println("Bunga pertahun: " + (int)bungaPertahun);
        System.out.println("Bunga perbulan: " + (int)bungaPerbulan);
        System.out.println("Cicilan yang dibayar: " + (int)cicilan);
    }
}
