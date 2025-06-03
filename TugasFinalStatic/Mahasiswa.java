package TugasFinalStatic;

public class Mahasiswa {
    private final String nim; // NIM tidak bisa diubah setelah objek dibuat
    private String nama;

    // Variabel static: digunakan untuk menghitung jumlah seluruh mahasiswa yang pernah dibuat
    private static int totalMahasiswa = 0;

    // Konstanta: batas maksimum SKS yang bisa diambil mahasiswa
    public static final int MAX_SKS = 24;

    // Konstruktor: setiap kali objek Mahasiswa dibuat, totalMahasiswa bertambah 1
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Max SKS   : " + MAX_SKS);
    }

    // Method static untuk mendapatkan jumlah total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}

/*
Penjelasan:
- Setiap mahasiswa punya NIM dan nama masing-masing.
- Variabel totalMahasiswa bertipe static, sehingga nilainya sama dan dibagi untuk semua objek Mahasiswa.
- Setiap kali objek Mahasiswa dibuat lewat konstruktor, totalMahasiswa akan bertambah satu.
- MAX_SKS adalah konstanta global yang nilainya tetap, bisa diakses tanpa membuat objek.
- Method displayInfo() digunakan untuk menampilkan data mahasiswa.
- Untuk mengetahui jumlah mahasiswa yang sudah dibuat, bisa langsung pakai Mahasiswa.getTotalMahasiswa().
*/