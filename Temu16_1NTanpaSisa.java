package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu16_1NTanpaSisa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int angka = input.nextInt();
        
        System.out.println("Angka yang dapat membagi " + angka + " tanpa sisa adalah: ");
        int i = 1;
        do {
            if (angka % i == 0) {
                System.out.print(i);
                if (i < angka) {
                    System.out.print(", ");
                }
            }
            i++;
        } while (i <= angka);
        System.out.println();
    }
}
