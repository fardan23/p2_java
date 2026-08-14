package pemograman2;
/**
 *
 * @author M.Fardan
 */
import javax.swing.JOptionPane;
public class Temu6_KategoriNilai {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan nilai ujian (0-100):");
        int nilai = Integer.parseInt(input);
        
        String kategori;
        if (nilai >= 90 && nilai <= 100) {
            kategori = "A";
        } else if (nilai >= 80 && nilai <= 89) {
            kategori = "B";
        } else if (nilai >= 70 && nilai <= 79) {
            kategori = "C";
        } else {
            kategori = "D";
        }
        JOptionPane.showMessageDialog(null,
                "Nilai kamu: " + nilai +
                "\nKategori: " + kategori);
    }
}
