public class Matakuliah26 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah26(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void cetakInfo() {
    System.out.println("Kode MK  : " + kode);
    System.out.println("Nama MK  : " + nama);
    System.out.println("SKS      : " + sks);
    System.out.println("Jam      : " + jumlahJam);
    System.out.println("------------------------");
}
    
}
