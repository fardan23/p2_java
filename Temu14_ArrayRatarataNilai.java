package pemograman2;
/**
 *
 * @author M.Fardan
 */
public class Temu14_ArrayRatarataNilai {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 90, 65, 85};
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        double rataRata = (double) total / nilai.length;
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}
