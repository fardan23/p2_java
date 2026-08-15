package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu16_PolaXO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah sisi : ");
        int sisi = input.nextInt();

        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                if (i == j) {
                    System.out.print("o ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
