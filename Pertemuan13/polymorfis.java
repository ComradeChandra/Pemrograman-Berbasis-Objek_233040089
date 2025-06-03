package Pertemuan13;

// Kelas induk (superclass)
class Hewan {
    // Method yang akan di-override oleh subclass
    public void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

// Kelas turunan 1
class Kucing extends Hewan {
    // Override method suara()
    @Override
    public void suara() {
        System.out.println("Kucing: Meong!");
    }
}

// Kelas turunan 2
class Anjing extends Hewan {
    // Override method suara()
    @Override
    public void suara() {
        System.out.println("Anjing: Guk guk!");
    }
}

public class polymorfis {
    public static void main(String[] args) {
        // Membuat array Hewan, isinya bisa objek Kucing atau Anjing
        Hewan[] daftarHewan = new Hewan[2];
        daftarHewan[0] = new Kucing(); // Polimorfisme: variabel tipe Hewan, objek Kucing
        daftarHewan[1] = new Anjing(); // Polimorfisme: variabel tipe Hewan, objek Anjing

        // Memanggil method suara() untuk setiap hewan
        for (Hewan h : daftarHewan) {
            h.suara(); // Akan memanggil method sesuai objek aslinya (Kucing/Anjing)
        }
    }
}