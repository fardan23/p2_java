package pemograman2;
/**
 *
 * @author M.Fardan
 */
import javax.swing.JOptionPane;
public class Temu6_NestedIfJOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan usia:");
        int usia = Integer.parseInt(input);
        if (usia >= 0) {
            if (usia < 13) {
                JOptionPane.showMessageDialog(null, "Anak-anak");
            } else if (usia < 20) {
                JOptionPane.showMessageDialog(null, "Remaja");
            } else {
                JOptionPane.showMessageDialog(null, "Dewasa");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usia tidak valid!");
        }
    }
}
