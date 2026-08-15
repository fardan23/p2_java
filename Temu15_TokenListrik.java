package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Temu15_TokenListrik {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Harga token: ");
        int harga = Integer.parseInt(br.readLine());
        System.out.print("Golongan: ");
        int golongan = Integer.parseInt(br.readLine());
        
        double token = 0;
        switch (golongan) {
            case 1:
                token = harga / 1352.0;
                break;
            case 2:
                token = harga / 1447.0;
                break;
            case 3:
                token = harga / 1699.0;
                break;
        }
        System.out.println("Token didapat: " + String.format("%.2f", token) + " kW");
    }
}
