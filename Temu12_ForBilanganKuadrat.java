package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu12_ForBilanganKuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int angka = input.nextInt();
        
        System.out.print("Deret " + angka + " bilangan kuadrat pertama: ");
        int total = 0;
        for (int i = 1; i <= angka; i++) {
            int kuadrat = i * i;
            total += kuadrat;
            System.out.print(kuadrat + " ");
        }
        System.out.println("\nJumlah seluruh bilangan kuadrat: " + total);
    }
}
