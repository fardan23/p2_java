package pemograman2;
/**
 *
 * @author M.Fardan
 */
import java.util.Scanner;
public class Temu11_WhileSoalMatematika {
    public static void main(String[] args) {
        /*
        Anda diminta membuat program untuk menampilkan sejumlah soal matematika
        dalam bentuk penjumlahan, dan menginputkan jawaban dari setiap soal
        yang ditampilkan !!!
        tampilkan jumlah benar dan jumlah salah dari jawaban yang diinputkan
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Input jumlah soal: ");
        int soal = input.nextInt();
        int benar = 0; int salah = 0;
        int i = 1;
        while (i <= soal) {
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            System.out.print(x + " + " + y + " = ");
            int jawaban = input.nextInt();
            if (jawaban == (x + y)) {
                benar++;
            } else {
                salah++;
            }
            i++;
        }
        System.out.println("Jumlah benar: " + benar);
        System.out.println("Jumlah salah: " + salah);
    }
}
