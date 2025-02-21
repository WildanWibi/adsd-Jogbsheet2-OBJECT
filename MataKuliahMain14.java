public class MataKuliahMain14 { 
    public static void main(String[] args) {
     
        MataKuliah14 mk1 = new MataKuliah14();
        System.out.println("Informasi Mata Kuliah 1 (Default):");
        mk1.tampilInformasi();

        MataKuliah14 mk2 = new MataKuliah14("002", "Bahasa inggris", 3, 6);
        System.out.println("Informasi Mata Kuliah 2 (Berparameter):");
        mk2.tampilInformasi();

        System.out.println("Matkul 1:");
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(2);

        System.out.println("Matkul 2:");
        mk2.ubahSKS(4);
        mk2.tambahJam(1);
        mk2.kurangiJam(6);
        
        System.out.println("------------------------------");
        System.out.println("Informasi Mata Kuliah setelah perubahan:");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}
