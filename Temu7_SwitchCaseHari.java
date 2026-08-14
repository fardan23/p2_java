package pemograman2;
/**
 *
 * @author M.Fardan
 */
public class Temu7_SwitchCaseHari {
    public static void main(String[] args) {
        int hari = 3;
        String namaHari;
        switch (hari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            default:
                namaHari = "Hari tidak valid";
        }
        System.out.println("Hari ini adalah " + namaHari);
    }
}
