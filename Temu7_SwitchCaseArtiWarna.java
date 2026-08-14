package pemograman2;
/**
 *
 * @author M.Fardan
 */
public class Temu7_SwitchCaseArtiWarna {
    public static void main(String[] args) {
        String warna = "MERAH";
        String arti;
        switch (warna.toLowerCase()) {
            case "merah":
                arti = "Berani";
                break;
            case "biru":
                arti = "Ketenangan";
                break;
            default:
                arti = "Tidak diketahui";
        }
        System.out.println("Arti warna : " + arti);
    }
}
