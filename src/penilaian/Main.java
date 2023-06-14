
package penilaian;


public class Main {
    public static void main(String[] args) {
        NilaiAkhir nilaiAkhir = new NilaiAkhir("Alif Ramahdan", "2110010172", 75, 80, 80);
        
        double nilaiAkhirMahasiswa = nilaiAkhir.hitungNilaiAkhir();
        
        
        System.out.println("NPM: " + nilaiAkhir.getNpm());
        System.out.println("Nama: " + nilaiAkhir.getNama());
        System.out.println("Nilai Akhir: " + nilaiAkhirMahasiswa);
    }   
}
