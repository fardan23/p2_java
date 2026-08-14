package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Temu8_PenginapanHotel {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Jenis kelas kamar: ");
        String kelas = br.readLine();
        System.out.print("Lama menginap (malam): ");
        int malam = Integer.parseInt(br.readLine());
        
        int tarif = 0;
        if (kelas.equalsIgnoreCase("Standard")) {
            if (malam <= 2) {
                tarif = 350_000;
            } else if (malam > 2) {
                tarif = 400_000;
            }
        } else if (kelas.equalsIgnoreCase("Eksekutif")) {
            if (malam <= 2) {
                tarif = 1_200_000;
            } else if (malam > 2) {
                tarif = 1_000_000;
            }
        }
        
        int totalBayar = tarif * malam;
        System.out.println("Total yang harus dibayar: Rp. " + totalBayar);
    }
}
