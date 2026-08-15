package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu9_WhilePerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input sebuah angka: ");
        int angka = input.nextInt();
        int i = 10;
        while (i >= 1) {
            int hasil = i * angka;
            System.out.println(angka + " x " + i + " = " + hasil);
            i--;
        }
    }
}
