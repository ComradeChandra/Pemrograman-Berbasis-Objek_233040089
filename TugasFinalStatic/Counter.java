package TugasFinalStatic;

public class Counter {
    // Variabel static: nilainya sama & dibagi untuk semua objek Counter
    private static int instanceCount = 0;

    // Konstruktor: setiap kali objek Counter dibuat, instanceCount bertambah 1
    public Counter() {
        instanceCount++;
    }

    // Method static: bisa dipanggil tanpa membuat objek Counter
    public static int getInstanceCount() {
        return instanceCount;
    }
}

// Penjelasan:
// - Variabel static instanceCount digunakan untuk menghitung berapa banyak objek Counter yang sudah dibuat.
// - Karena static, instanceCount nilainya sama untuk semua objek Counter (bukan per objek).
// - Setiap kali new Counter() dipanggil, konstruktor menambah instanceCount.
// - Method static getInstanceCount() bisa dipanggil langsung, misal: Counter.getInstanceCount(), tanpa harus membuat objek Counter dulu.