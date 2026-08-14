package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu3_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();
        System.out.println("Halo " + nama + "! Usia Anda adalah " + usia + " tahun");
    }
}
