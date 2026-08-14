package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu4_HitungDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total belanja \t\t: ");
        int totalBelanja = input.nextInt();
        int diskon, totalBayar;
        if (totalBelanja >= 500000){
            diskon = totalBelanja * 10 / 100;
            totalBayar = totalBelanja - diskon;
        } else {
            diskon = 0;
            totalBayar = totalBelanja - diskon;
        }
        System.out.println("Diskon \t\t\t\t: " + diskon);
        System.out.println("Total bayar setelah diskon \t: " + totalBayar);
  
    }
}
