package pemograman2;
/**
 *
 * @author M.Fardan
 */
public class Temu2_TipeDataVariabelKonstanta {
    public static void main(String[] args) {
        final long NIK = 1234567890123456L;
        final String TEMPAT_LAHIR = "LOREM";
        final String TANGGAL_LAHIR = "19-09-9999";
        final String JENIS_KELAMIN = "LAKI-LAKI";

        String nama = "FARDAN";
        String alamat = "JL. IPSUM NO. 123";
        String agama = "ISLAM";
        String statusPerkawinan = "BELUM KAWIN";
        String pekerjaan = "MAHASISWA";
        String kewarganegaraan = "WNI";

        System.out.println("=== DATA KTP ===");
        System.out.println("NIK \t\t\t: " + NIK);
        System.out.println("Nama \t\t\t: " + nama);
        System.out.println("Tempat, Tanggal Lahir \t: " + TEMPAT_LAHIR + ", " + TANGGAL_LAHIR);
        System.out.println("Jenis Kelamin \t\t: " + JENIS_KELAMIN);
        System.out.println("Alamat \t\t\t: " + alamat);
        System.out.println("Agama \t\t\t: " + agama);
        System.out.println("Status Perkawinan \t: " + statusPerkawinan);
        System.out.println("Pekerjaan \t\t: " + pekerjaan);
        System.out.println("Kewarganegaraan \t: " + kewarganegaraan);
    }
}
