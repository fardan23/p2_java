package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu4_IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        if (angka % 2 == 0){
            System.out.println("Angka yang Anda masukkan adalah genap.");
        } else {
            System.out.println("Angka yang Anda masukkan adalah ganjil.");
        }
        input.close();
    }
}
