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
public class EnergiKinetik {
 private double massa, kecepatan;
    
    public double getMassa() {
        return this.massa / 1000;
    }
    
    public void setMassa(double massa) {
        this.massa = massa;
    }
    
    public double getKecepatan() {
        return this.kecepatan;
    }
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik(double massa, double kecepatan) {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
    
    public double hitungUsaha(double kecepatanAwal) {
        return 0.5 * massa * (Math.pow(kecepatan, 2) - Math.pow(kecepatanAwal, 2));
    }
}