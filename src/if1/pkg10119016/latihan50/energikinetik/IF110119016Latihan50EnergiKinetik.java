package if1.pkg10119016.latihan50.energikinetik;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * menghitung energi kinetik menggunakan getter setter
 */
public class IF110119016Latihan50EnergiKinetik {

    
    public static void main(String[] args) {
    EnergiKinetik energiKinetik = new EnergiKinetik();
        energiKinetik.setMassa(145.0);
        energiKinetik.setKecepatan(25.0);
        double massa = energiKinetik.getMassa();
        double kecepatan = energiKinetik.getKecepatan();
        System.out.println("Sebuah bola baseball dengan massa " + massa + " g dilempar dengan kecepatan " + kecepatan + " m/s");
        System.out.println("a.Berapakah energi kinetiknya ? " + energiKinetik.hitungEnergiKinetik(massa, kecepatan));
        System.out.println("b.Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan ini, jika dimulai dari keadaan diam? " + energiKinetik.hitungUsaha(0));
        System.out.println("Alasan : Karena energi kinetik awal adalah nol, maka usaha total yang dilakukan sama dengan energi kinetik akhir, yaitu 45 joule.");
    }
    
}