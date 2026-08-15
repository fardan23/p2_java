package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu11_WhileFaktorBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int angka = input.nextInt();
        
        System.out.print("Output: ");
        int i = 1;
        while (i <= angka) {
            if (angka % i == 0) {
                System.out.print(i + " ");
            }
            ++i;
        }
        System.out.println();
    }
}
