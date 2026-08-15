package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu16_ForPembagianSisaBagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int angka = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int bagi = angka / i;
            int sisa = angka % i;
            System.out.println(angka + " : " + i + " = " + bagi + " sisa " + sisa);
        }
    }
}
