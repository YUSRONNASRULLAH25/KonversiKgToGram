import java.util.Scanner;

public class KonversiKgToGram {
   /** Ini adalah deklarasi kelas utama dengan nama "KonversiKgToGram
   * public static void main(String[] args) {
        /**Baris ini membuat objek Scanner yang disebut "input" untuk menerima input dari pengguna melalui keyboard.
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat dalam kilogram (KG): ");
        /**ini adalah pesan yang akan ditampilkan kepada pengguna untuk meminta mereka memasukkan berat dalam kilogram.*/
        double beratKg = input.nextDouble();
        /** Program akan membaca angka yang dimasukkan oleh pengguna dan menyimpannya dalam variabel "beratKg"
        *  sebagai tipe data double.*/

        double beratGram = beratKg * 1000; // 1 KG = 1000 Gram
        /**1000 Gram: Ini adalah baris perhitungan yang mengonversi berat dalam kilogram ke gram
         * dengan mengalikan nilai "beratKg" dengan 1000, karena 1 kilogram setara dengan 1000 gram.
         */

        System.out.println(beratKg + " kilogram adalah setara dengan " + beratGram + " gram.");
    }   /** Baris ini mencetak hasil konversi dalam format yang jelas, dengan menampilkan berat
        *dalam kilogram dan hasil konversinya dalam gram.*/
}