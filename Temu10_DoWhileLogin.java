package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu10_DoWhileLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        
        do {
            System.out.print("Input username: ");
            String username = input.nextLine();
            System.out.print("Input password: ");
            String password = input.nextLine();
            isValid = username.equals("admin") && password.equals("admin123");
            if (!isValid){
                System.out.println("Username atau password tidak valid!");
            }   
        } while (!isValid); 
        System.out.println("Login berhasil!");
    }
}
