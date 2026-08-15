package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu10_DoWhileBilanganMagic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka dibawah 100: ");
        int angka = input.nextInt();
        System.out.println("Bilangan magic yang kurang dari " + angka + " adalah");
        int i = 1;
        do {
            int digit1 = i / 10;
            int digit2 = i % 10;
            int hasil = digit1 + digit2;
            if (hasil % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= angka);
        System.out.println("");
    }
}
