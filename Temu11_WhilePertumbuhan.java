package pemograman2;
/**
 *
 * @author M.Fardan
 */
public class Temu11_WhilePertumbuhan {
    public static void main(String[] args) {
        /* 
        Sebuah kota memiliki populasi awal 10.000 jiwa dengan pertumbuhan 5% per tahun.
        Berapa tahun dibutuhkan untuk mencapai populasi 15.000 jiwa?
        */
        int tahun = 0;
        double populasi = 10000;
        while (populasi < 15000) {
            populasi *= 1.05;
            tahun++;
        }
        System.out.println("Butuh " + tahun);
    }
 
}
