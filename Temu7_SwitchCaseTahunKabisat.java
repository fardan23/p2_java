package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu7_SwitchCaseTahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        
        String isKabisat = tahun % 4 == 0 && (tahun % 100 != 0 || tahun % 400 == 0)
                ? "Kabisat" : "Bukan kabisat";
        System.out.println("Tahun " + tahun + " adalah tahun " + isKabisat);
    }
}
