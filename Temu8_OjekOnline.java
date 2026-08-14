package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Temu8_OjekOnline {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Nama customer: ");
        String nama = br.readLine();
        System.out.print("Jarak yang ditempuh (km): ");
        int km = Integer.parseInt(br.readLine());
        
        double tarif = 0;
        if (km > 4) {
            tarif = 9_500 + ((km-4) * 2_500);
        } else {
            tarif = 9_500;
        }
        
        double diskon = 0;
        if (km > 10 && km <= 15) {
            diskon = 2_000;
        } else if (km > 15) {
            diskon = 5_000;
        }
        
        double total = tarif - diskon;
        System.out.println("Selamat, Anda mendapatkan potongan Rp. " + (int) diskon);
        System.out.println("Tarif yang harus dibayar " + nama + " sebesar Rp. " + (int) total);
    }
}
