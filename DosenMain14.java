public class DosenMain14 {
    public static void main(String[] args) {
        Dosen14 ds1 = new Dosen14();
        System.out.println("Informasi Dosen 1 (Default): ");
        ds1.tampilInformasi();

        Dosen14 ds2 = new Dosen14("2442", "Wibisono", true, 2007, "Bahasa Inggris");
        System.out.println("Informasi Dosen 2 (Berparameter): ");
        ds2.tampilInformasi();

        System.out.println("Dosen 1:");
        ds1.setStatusAktif(true);
        ds1.ubahKeahlian("ASD"); 
        System.out.println("Masa Kerja: " + ds1.hitungMasaKerja(2024) + " Tahun");

        System.out.println("Dosen 2: ");
        ds2.setStatusAktif(false);
        ds2.ubahKeahlian("-");
        System.out.println("Masa Kerja: " + ds2.hitungMasaKerja(2024) + " Tahun");

        System.out.println("------------------------------");
        System.out.println("Informasi Dosen setelah perubahan:");
        ds1.tampilInformasi();
        ds2.tampilInformasi();
    }
}
