package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Temu5_InputStreamReader {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan nama: ");
        String nama = br.readLine();
        System.out.print("Masukkan umur: ");
        int umur = Integer.parseInt(br.readLine());
        System.out.println(nama + " berumur " + umur + " tahun");
    }
}
