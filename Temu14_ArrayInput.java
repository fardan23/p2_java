package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu14_ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] angka = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        
        System.out.print("\nArray yang diinput: ");
        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }
}
