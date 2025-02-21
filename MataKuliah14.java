public class MataKuliah14 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah14() {   
        this.kodeMK = "001";
        this.nama = "Bahasa Indonesia";
        this.sks = 4;
        this.jumlahJam = 8;
    }

    public MataKuliah14(String kodeMK, String nama, int sks, int jumlahJam) {    
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {  
        System.out.println("Kode Matkul : " + kodeMK);
        System.out.println("Nama Matkul : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("------------------------------");
    }

    public void ubahSKS(int sksBaru) {  
        this.sks = sksBaru;
        System.out.println("SKS diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) { 
        this.jumlahJam += jam;
        System.out.println("Jumlah jam ditambah menjadi: " + jumlahJam);
    }

    public void kurangiJam(int jam) {  
        
        if (jam > jumlahJam) {
            System.out.println("------------------------------");
            System.out.println("Pengurangan gagal");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
            
        }
    }
}