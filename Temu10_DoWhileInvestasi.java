package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu10_DoWhileInvestasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input modal awal: ");
        double modal = input.nextInt();
        System.out.print("Bunga per tahun (%): ");
        double bunga = input.nextDouble() / 100;
        System.out.print("Target: Rp. ");
        int target = input.nextInt();
        double hasil = modal;
        
        int i = 1;
        do {
            hasil += hasil * bunga;
            System.out.println("Tahun ke-" + i + " : Rp. " + String.format("%.2f", hasil));
            ++i;
        } while (hasil < target);
    }
}
