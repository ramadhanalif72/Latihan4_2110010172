
package penilaian;


public class NilaiAkhir {
    private int tugas;
    private int uts;
    private int uas;

    public NilaiAkhir(String nama, String nim, int tugas, int uts, int uas) {
        super(Nama, Npm);
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        double nilaiAkhir = 0.3 * tugas + 0.3 * uts + 0.4 * uas;
        return nilaiAkhir;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Nilai Tugas: " + tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
    }
}

// Contoh penggunaan class NilaiAkhir
public class Mahasiswa {
    public static void main(String[] args) {
        NilaiAkhir mahasiswa1 = new NilaiAkhir("Alif Ramadhan", "2110010172", 80, 75, 85);
        mahasiswa1.info();
    }
}
