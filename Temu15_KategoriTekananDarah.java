package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu15_KategoriTekananDarah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tekanan sistolik: ");
        int sistolik = input.nextInt();
        System.out.print("Masukkan tekanan diastolik: ");
        int diastolik = input.nextInt();
        
        String kategori = "";
        if ((sistolik >= 90 && sistolik <= 120) && (diastolik >= 60 && diastolik<= 80)) {
            kategori = "Normal";
        } else if ((sistolik > 120 && sistolik <= 140) || (diastolik > 80 && diastolik <= 90)) {
            kategori = "Pra-Hipertensi";
        } else if (sistolik > 140 || diastolik > 90) {
            kategori = "Hipertensi";
        }
        System.out.println("Kategori: " + kategori);
    }
}
