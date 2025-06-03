package TugasFinalStatic;

public class TestAppConfig {
    public static void main(String[] args) {
        System.out.println("Base URL      : " + AppConfig.BASE_URL);
        System.out.println("App Version   : " + AppConfig.APP_VERSION);
        System.out.println("Timeout (ms)  : " + AppConfig.DEFAULT_TIMEOUT);
    }
}
// Output:
// Base URL      : https://www.myapp.com/api
// App Version   : 1.0.0
// Timeout (ms)  : 5000 
/*
    Penjelasan:
    Program ini merupakan contoh penggunaan class konfigurasi aplikasi dengan field static.
    Pada method main, program mencetak tiga informasi penting:
    1. BASE_URL: Merupakan alamat dasar (base URL) API yang digunakan aplikasi.
    2. APP_VERSION: Menunjukkan versi aplikasi saat ini.
    3. DEFAULT_TIMEOUT: Menentukan waktu tunggu (timeout) default dalam satuan milidetik.

    Field-field tersebut diakses secara langsung melalui nama class AppConfig tanpa perlu membuat objek,
    karena field tersebut bertipe static. Hal ini memudahkan pengelolaan konfigurasi yang sifatnya global
    dan konsisten di seluruh bagian aplikasi.

    Output yang dihasilkan akan menampilkan nilai dari masing-masing field static tersebut.
*/
