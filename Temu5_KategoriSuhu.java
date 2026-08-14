package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Temu5_KategoriSuhu {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan nilai suhu \t: ");
        int suhu = Integer.parseInt(br.readLine());

        String kategori;
        if (suhu < 0) {
            kategori = "Beku";
        } else if (suhu <= 20) {
            kategori = "Dingin";
        } else if (suhu <= 30) {
            kategori = "Sejuk";
        } else if (suhu <= 40) {
            kategori = "Panas";
        } else {
            kategori = "Sangat Panas";
        }
        System.out.println("Kategori \t\t: " + kategori);
    }
}
