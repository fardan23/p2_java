package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu12_ForFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int angka = input.nextInt();
        
        int faktorial = 1;
        for (int i = 1; i <= angka; i++) {
            faktorial *= i;
        }
        System.out.println(angka + "!= " + faktorial);
    }
}
