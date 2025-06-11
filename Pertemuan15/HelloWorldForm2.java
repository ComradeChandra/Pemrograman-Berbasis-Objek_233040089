package Pertemuan15;

import javax.swing.*; // Mengimpor semua komponen Swing, termasuk JLabel dan JFrame

// Membuat kelas turunan dari JFrame untuk window aplikasi GUI
public class HelloWorldForm2 extends JFrame //1
{
    private JLabel label; //2 // Mendeklarasikan variabel label bertipe JLabel

    // Konstruktor: dijalankan saat objek dibuat
    public HelloWorldForm2()
    {
        label = new JLabel(); // Membuat objek JLabel baru
        label.setText("Hallo Dunia!"); // Mengatur teks pada label

        add(label); // Menambahkan label ke window (JFrame)
        setTitle("Program pertama"); // Mengatur judul window

        setSize(600, 300); // Mengatur ukuran window (lebar: 600, tinggi: 300)
        // (Catatan: window akan muncul jika setVisible(true) dipanggil dari luar, misal dari main)
    }
}