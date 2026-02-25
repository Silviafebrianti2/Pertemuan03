import java.util.Scanner;

public class MatakuliahDemo26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Matakuliah26[] arrayMK = new Matakuliah26[jumlah];

        for (int i = 0; i < jumlah; i++) {
            arrayMK[i] = new Matakuliah26("", "", 0, 0);

            System.out.println("Data Matakuliah ke-" + (i+1));

            System.out.print("Kode MK : ");
            String kode = sc.nextLine();

            System.out.print("Nama MK : ");
            String nama = sc.nextLine();

            System.out.print("SKS     : ");
            int sks = sc.nextInt();

            System.out.print("Jam     : ");
            int jam = sc.nextInt();
            sc.nextLine();

            arrayMK[i] = new Matakuliah26(kode, nama, sks, jam);
        }

        System.out.println("\n=== DATA MATAKULIAH ===");

        for (int i = 0; i < jumlah; i++) {
            arrayMK[i].cetakInfo();
        }

        sc.close();
    }
}