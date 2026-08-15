package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu14_ArrayHitungBilanganGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int angka = input.nextInt();
        int[] bilangan = new int[angka];
        
        for (int i = 0; i < angka; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = input.nextInt();
        }
        
        int genap = 0;
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] % 2 == 0) {
                ++genap;
            }
        }
        System.out.println("\nJumlah bilangan genap ada " + genap);
    }
}
