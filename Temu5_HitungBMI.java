package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Temu5_HitungBMI {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan berat badan (kg) \t: ");
        double berat = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tinggi badan (m) \t: ");
        double tinggi = Double.parseDouble(br.readLine());
        
        double bmi = berat / (tinggi * tinggi);
        System.out.println("BMI \t\t\t\t: " + String.format("%.2f", bmi));
        
        String kategori;
        if (bmi < 18.5) {
            kategori = "Kurus";
        } else if (bmi < 25) {
            kategori = "Normal";
        } else if (bmi < 30) {
            kategori = "Gemuk";
        } else {
            kategori = "Obesitas";
        }
        System.out.println("Status \t\t\t\t: " + kategori);
    }
}
