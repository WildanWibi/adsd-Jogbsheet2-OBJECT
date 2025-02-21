public class MataKuliahMain14 { 
    public static void main(String[] args) {
        // Objek pertama menggunakan konstruktor default
        MataKuliah14 mk1 = new MataKuliah14();
        System.out.println("Informasi Mata Kuliah 1 (Default):");
        mk1.tampilInformasi();

        // Objek kedua menggunakan konstruktor berparameter
        MataKuliah14 mk2 = new MataKuliah14("002", "Bahasa inggris", 3, 6);
        System.out.println("Informasi Mata Kuliah 2 (Berparameter):");
        mk2.tampilInformasi();

        // Menggunakan method-method yang ada
        System.out.println("Matkul 1:");
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(2);

        System.out.println("Matkul 2:");
        mk2.ubahSKS(4);
        mk2.tambahJam(1);
        mk2.kurangiJam(6);

        // Menampilkan informasi terbaru
        System.out.println("------------------------------");
        System.out.println("Informasi Mata Kuliah setelah perubahan:");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}
