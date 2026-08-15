package pemograman2;
/**
 *
 * @author M.Fardan
 */
public class Temu11_DoWhilePertumbuhan {
    public static void main(String[] args) {
        /* 
        Sebuah kota memiliki populasi awal 10.000 jiwa dengan pertumbuhan 5% per tahun.
        Berapa tahun dibutuhkan untuk mencapai populasi 15.000 jiwa?
        */
        int tahun = 0;
        double populasi = 10000;
        do {
            populasi *= 1.05;
            tahun++;
        } while (populasi < 15000);
        System.out.println("Butuh " + tahun);
    }
}
