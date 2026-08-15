package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu14_ArrayCariMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();
        int[] data = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        
        int max = data[0];
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Nilai tertinggi: " + max);
    }
}
