package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu12_ForPenjumlahanDeret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int batas = input.nextInt();
        
        System.out.print("Deret bilangan: ");
        int total = 0;
        for (int i = 1; i <= batas; i++) {
            System.out.print(i + " ");
            total += i;
        }
        System.out.println("\nTotal seluruh angka: " + total);
    }
}
