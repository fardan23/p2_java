package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu4_IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        if (angka > 0){
            System.out.println("Angka yang Anda masukkan adalah positif");
        }
        input.close();
    }
}
