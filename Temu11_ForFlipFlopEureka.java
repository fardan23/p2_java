package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu11_ForFlipFlopEureka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int angka = input.nextInt();
        
        for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("eureka ");
            } else if (i % 3 == 0) {
                System.out.print("flip ");
            } else if (i % 5 == 0) {
                System.out.print("flop ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
