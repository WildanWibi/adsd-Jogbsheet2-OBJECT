public class MahasiswaMain14 {

    public static void main(String[] args) {
        
        Mahasiswa14 mhsl = new Mahasiswa14();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa14 mhs2 = new Mahasiswa14("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa14 mhsWildan = new Mahasiswa14("M Wildan Wibisono", "244107060118", 3.5, "SIB 1C");
        mhsWildan.tampilkanInformasi();
    }
}