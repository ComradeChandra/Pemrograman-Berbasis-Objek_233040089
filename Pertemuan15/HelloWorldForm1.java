package Pertemuan15; // Mendeklarasikan package tempat file ini berada

import javax.swing.JLabel; // Mengimpor komponen label dari Swing
import javax.swing.JFrame; // (PERLU DITAMBAHKAN) Mengimpor JFrame dari Swing

// Mendefinisikan kelas turunan dari JFrame untuk membuat window aplikasi
public class HelloWorldForm1 extends JFrame //1
{
    private JLabel label; //2 // Mendeklarasikan variabel label bertipe JLabel

    // Konstruktor kelas, akan dijalankan saat objek dibuat
    public HelloWorldForm1() //3
    {
        label = new JLabel(); // Membuat objek JLabel baru
        label.setText("Helloworld!"); // Mengatur teks pada label

        add(label); // Menambahkan label ke JFrame (window)
        setTitle("My First Program"); // Mengatur judul window

        setVisible(true); // Menampilkan window ke layar
        setSize(300, 200); // Mengatur ukuran window (lebar: 300, tinggi: 200)
    }
}
