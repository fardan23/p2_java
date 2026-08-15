package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu9_WhileLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        int coba = 0;
        while (lanjut) {
            coba++;
            System.out.print("Masukkan username: ");
            String username = input.nextLine();
            System.out.print("Masukkan password: ");
            String password = input.nextLine();
            
            if (coba >= 3) {
                lanjut = false;
                System.out.println("Akun Anda diblokir");
            } else if (username.equals("admin") && password.equals("admin123")) {
                System.out.println("Login berhasil!");
                lanjut = false;
            } else {
                System.out.println("Username atau password invalid, coba lagi!");
            }
        }
    }
}
