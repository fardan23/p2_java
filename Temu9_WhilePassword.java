package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu9_WhilePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = input.nextLine();
        
        while (!password.equals("fardan123")) {
            System.out.print("Password salah! coba lagi: ");
            password = input.nextLine();
        }
        System.out.println("Login berhasil!");
    }
}
