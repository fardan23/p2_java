package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu7_SwitchCaseVokalKonsonan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input sebuah huruf: ");
        String huruf = input.nextLine().toUpperCase();
        
        String jenis = "";
        switch(huruf){
            case "A":
            case "I":
            case "U":
            case "E":
            case "O":
                jenis = "Vokal";
                break;
            default:
                jenis = "Konsonan";
                break;
        }
        System.out.println("Huruf " + huruf + " adalah " + jenis);
    }
}
