public class Dosen14 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen14() {
        this.idDosen = "2441";
        this.nama = "Wildan";
        this.statusAktif = true;
        this.tahunBergabung = 2006;
        this.bidangKeahlian = "Bahasa Indonesia";
    }

    public Dosen14(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    } 

    public void tampilInformasi() {
        System.out.println("ID Dosen                : " + idDosen);
        System.out.println("Nama Dosen              : " + nama);
        System.out.println("Status Dosen            : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung Dosen   : " + tahunBergabung);
        System.out.println("Bidang Keahlian Dosen   : " + bidangKeahlian);
        System.out.println("------------------------------");
    }

    public void setStatusAktif(boolean statusBaru) {
        this.statusAktif = statusBaru;
        System.out.println("Status Dosen Diubah Menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("BIdang Keahlian Di Ubah Menjadi: " + bidangKeahlian);
    }
}
