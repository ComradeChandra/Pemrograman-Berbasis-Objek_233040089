package TugasFinalStatic;

public class TestMahasiswa {
    public static void main(String[] args) {
        // Membuat beberapa objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("230001", "Aurellia");
        Mahasiswa m2 = new Mahasiswa("230002", "Nadia");
        Mahasiswa m3 = new Mahasiswa("230003", "Alya");

        // Menampilkan info masing-masing mahasiswa
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        // Menampilkan jumlah total mahasiswa yang sudah dibuat
        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}

/*
Penjelasan:
- Program ini membuat tiga objek Mahasiswa dengan NIM dan nama berbeda.
- Setiap kali objek dibuat, totalMahasiswa otomatis bertambah.
- Method displayInfo() menampilkan data masing-masing mahasiswa, termasuk batas maksimum SKS.
- Di akhir, jumlah total mahasiswa yang sudah dibuat ditampilkan lewat method static getTotalMahasiswa().
- Output akan menampilkan data tiga mahasiswa dan total mahasiswa: 3.
*/
