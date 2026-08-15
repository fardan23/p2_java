package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu13_NestedForAngkaUrut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Jumlah kolom: ");
        int kolom = input.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
