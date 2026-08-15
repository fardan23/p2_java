package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu15_KonversiTinggiBadan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi dalam cm: ");
        int cm = input.nextInt();
        
        int kaki = (int) (cm / 30.48);
        int inci = (int) ((cm - kaki * 30.48) / 2.54);
        System.out.println(cm + " cm = " + kaki + " kaki " + inci + " inci");
    }
}
