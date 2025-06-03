package TugasFinalStatic;

// Kelas untuk menguji Counter
public class TestCounter {
    public static void main(String[] args) {
        // Membuat 3 objek Counter
        new Counter(); // instance pertama, instanceCount jadi 1
        new Counter(); // instance kedua, instanceCount jadi 2
        new Counter(); // instance ketiga, instanceCount jadi 3

        // Menampilkan total objek Counter yang sudah dibuat
        // getInstanceCount() adalah method static, jadi bisa dipanggil langsung lewat nama kelas
        System.out.println("Total instance Counter: " + Counter.getInstanceCount());
    }
}

/*
Penjelasan:
- Setiap kali baris 'new Counter();' dijalankan, konstruktor Counter akan menambah nilai instanceCount.
- instanceCount adalah variabel static, sehingga nilainya sama dan dibagi untuk semua objek Counter.
- Setelah membuat 3 objek, instanceCount bernilai 3.
- Method static getInstanceCount() digunakan untuk mengambil nilai instanceCount tanpa perlu membuat objek Counter lagi.
- Output yang dihasilkan:
  Total instance Counter: 3
*/
