package pemograman2;
/**
 *
 * @author M.Fardan
 */
public class Temu5_KeteranganSuhu {
    public static void main(String[] args) {
        int suhu = 28;
        if (suhu <= 0){
            System.out.println("Suhu sangat dingin, hati-hati beku!");
        }else if (suhu > 0 && suhu <= 18){
            System.out.println("Suhu dingin, pakai jaket ya.");
        }else if (suhu > 18 && suhu <= 30){
            System.out.println("Suhu normal,nyaman untuk beraktivitas.");
        }else if (suhu > 30 && suhu <= 40){
            System.out.println("Suhu panas, banyak minum air putih.");
        }else{
            System.out.println("Suhu ekstrem! Berbahaya untuk kesehatan.");
        }
    }
}
