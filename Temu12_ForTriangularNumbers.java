package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu12_ForTriangularNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int angka = input.nextInt();
        
        System.out.print("Deret " + angka + " bilangan Triangular Number pertama: ");
        int totalTri = 0;
        int totalGenap = 0; int totalGanjil = 0;
        for (int i = 1; i <= angka; i++) {
            int tri = i * (i + 1) / 2;
            System.out.print(tri + " ");
            totalTri += tri;
            if (tri % 2 == 0) {
                totalGenap += tri;
            } else {
                totalGanjil += tri;
            }
        }
        System.out.println("\nTotal triangular: " + totalTri);
        System.out.println("Total genap: " + totalGenap);
        System.out.println("Total ganjil: " + totalGanjil);
    }
}
