public class Dosen26 {
    String kode;
    String nama;
    boolean jenisKelamin; // true = Laki-laki, false = Perempuan
    int usia;

    // Constructor
    public Dosen26(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan data
    public void tampilInfo() {
        System.out.println("Kode Dosen   : " + kode);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + usia);
        System.out.println("-----------------------------------");
    }
}