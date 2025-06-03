package TugasFinalStatic;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Saat baris di bawah dijalankan, kelas DatabaseConnection akan diakses untuk pertama kali.
        // Static block di DatabaseConnection akan otomatis dijalankan sebelum baris ini dieksekusi.
        System.out.println("URL koneksi: " + DatabaseConnection.connectionString);
    }
}

/*
Penjelasan:
- Ketika DatabaseConnection.connectionString diakses, Java akan memuat kelas DatabaseConnection.
- Static block di DatabaseConnection akan langsung dijalankan satu kali, menampilkan "Koneksi database diinisialisasi."
- Setelah itu, nilai connectionString yang sudah diinisialisasi akan ditampilkan di konsol.
- Output yang dihasilkan:
  Koneksi database diinisialisasi.
  URL koneksi: jdbc:mysql://localhost:3306/mydb
*/
