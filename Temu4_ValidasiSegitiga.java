package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu4_ValidasiSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan sudut A : ");
        int A = input.nextInt();
        System.out.print("Masukan sudut B : ");
        int B = input.nextInt();
        System.out.print("Masukan sudut C : ");
        int C = input.nextInt();
        
        int jumlah = A + B + C;
        if (jumlah == 180) {
            System.out.println("Keterangan \t: Ketiga sudut dapat membentuk segitiga valid");
        } else {
            System.out.println("Keterangan \t: Ketiga sudut tidak membentuk segitiga valid");
        }
    }
}
