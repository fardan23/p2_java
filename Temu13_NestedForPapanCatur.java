package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu13_NestedForPapanCatur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah angka: ");
        int angka = input.nextInt();
        
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
