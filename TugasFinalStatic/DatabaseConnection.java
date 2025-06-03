package TugasFinalStatic;

public class DatabaseConnection {
    // Variabel static: hanya ada satu untuk seluruh kelas, tidak per objek
    public static String connectionString;

    // Static block: dijalankan sekali saat kelas pertama kali diakses (sebelum objek dibuat)
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb"; // inisialisasi koneksi database
        System.out.println("Koneksi database diinisialisasi.");
    }
}

/*
Penjelasan:
- Variabel static connectionString digunakan untuk menyimpan string koneksi database.
- Static block akan otomatis dijalankan sekali saja saat kelas DatabaseConnection pertama kali digunakan (misal, saat variabel/method static diakses atau objek dibuat).
- Static block cocok untuk inisialisasi resource yang hanya perlu dilakukan sekali, seperti koneksi database, konfigurasi awal, dsb.
- Pada contoh ini, setiap kali kelas DatabaseConnection diakses pertama kali, akan muncul pesan "Koneksi database diinisialisasi." di konsol.
*/
