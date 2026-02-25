import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen26[] arrayDosen = new Dosen26[jumlah];

        // 🔹 FOR → untuk input dan membuat array of object
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P) : ");
            String jkInput = sc.nextLine();
            boolean jenisKelamin = jkInput.equalsIgnoreCase("L");

            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayDosen[i] = new Dosen26(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n===== DATA DOSEN =====");

        // 🔹 FOREACH → untuk menampilkan data
        for (Dosen26 dsn : arrayDosen) {
            dsn.tampilInfo();
        }

        sc.close();
    }
}