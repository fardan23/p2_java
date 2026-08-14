package pemograman2;
/**
 *
 * @author M.Fardan
 */
import javax.swing.JOptionPane;
public class Temu6_HitungPajak {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan nama:");
        String golongan = JOptionPane.showInputDialog("Masukkan golongan pekerjaan (A/B/C):");
        String inputGaji = JOptionPane.showInputDialog("Masukkan gaji:");
        double gaji = Double.parseDouble(inputGaji);
        
        double pajak = 0;
        if (golongan.equalsIgnoreCase("A")) {
            if (gaji >= 10000000) {
                pajak = 0.10;
            } else {
                pajak = 0.05;
            }
        } else if (golongan.equalsIgnoreCase("B")) {
            if (gaji >= 8000000) {
                pajak = 0.08;
            } else {
                pajak = 0.04;
            }
        } else if (golongan.equalsIgnoreCase("C")) {
            pajak = 0.03;
        }
        
        double jumlahPajak = gaji * pajak;
        JOptionPane.showMessageDialog(null,
        "Nama: " + nama +
        "\nGolongan: " + golongan +
        "\nGaji: " + String.format("%.0f", gaji) +
        "\nPajak: " + (pajak * 100) + "%" +
        "\nJumlah Pajak: " + String.format("%.0f", jumlahPajak));
    }
}
