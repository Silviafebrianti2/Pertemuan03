public class DataDosen26 {

    // a. Menampilkan semua data dosen
    public void dataSemuaDosen(Dosen26[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (Dosen26 dsn : arrayOfDosen) {
            dsn.tampilInfo();
        }
    }

    // b. Jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen26[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("\nJumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    // c. Rata-rata usia per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen26[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                totalPria += dsn.usia;
                jumlahPria++;
            } else {
                totalWanita += dsn.usia;
                jumlahWanita++;
            }
        }

        double rataPria = jumlahPria > 0 ? (double) totalPria / jumlahPria : 0;
        double rataWanita = jumlahWanita > 0 ? (double) totalWanita / jumlahWanita : 0;

        System.out.println("\nRata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
    }

    // d. Info dosen paling tua
    public void infoDosenPalingTua(Dosen26[] arrayOfDosen) {
        Dosen26 tertua = arrayOfDosen[0];

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }

        System.out.println("\n=== DOSEN PALING TUA ===");
        tertua.tampilInfo();
    }

    // e. Info dosen paling muda
    public void infoDosenPalingMuda(Dosen26[] arrayOfDosen) {
        Dosen26 termuda = arrayOfDosen[0];

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }

        System.out.println("\n=== DOSEN PALING MUDA ===");
        termuda.tampilInfo();
    }
}