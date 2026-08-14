package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu7_SwitchCaseBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nomor bulan: ");
        int no = input.nextInt();
        
        String bulan = "";
        switch(no){
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Februari";
                break;
            case 3:
                bulan = "Maret";
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan = "Mei";
                break;
            case 6:
                bulan = "Juni";
                break;
            case 7:
                bulan = "Juli";
                break;
            case 8:
                bulan = "Agustus";
                break;
            case 9:
                bulan = "September";
                break;
            case 10:
                bulan = "Oktober";
                break;
            case 11:
                bulan = "November";
                break;
            case 12:
                bulan = "Desember";
                break;
            default:
                bulan = "Bulan tidak valid!";
        }
        System.out.println("Bulan ke-" + no + " adalah " + bulan);
    }
}
