package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu11_ForFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int angka = input.nextInt();
        System.out.print("Deret Fibonacci: ");
        
        int deret1 = 0;
        int deret2 = 1;
        int total = 0;
        for (int i = 0; i < angka; i++) {
            System.out.print(deret1 + " ");
            total += deret1;
            
            int deretX = deret1 + deret2;
            deret1 = deret2;
            deret2 = deretX;
        }
        System.out.println("\nJumlah: " + total);
    }
}
