package pemograman2;
/**
 *
 * @author M.Fardan
 */
import javax.swing.JOptionPane;
public class Temu6_ConfirmDialog {
    public static void main(String[] args) {
        int pilihan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin?");

        if (pilihan == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Ya");
        } else if (pilihan == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Tidak");
        } else {
            JOptionPane.showMessageDialog(null, "Batal");
        }
    }
}
