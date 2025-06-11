package Pertemuan15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Membuat window dengan label dan tombol, serta aksi saat tombol diklik
public class HelloWorldForm3 extends JFrame implements ActionListener //1
{
    private JLabel label; // Label untuk menampilkan teks
    private JButton button; // Tombol yang bisa diklik

    // Konstruktor: mengatur isi dan tampilan window
    public HelloWorldForm3()
    {
        label = new JLabel();
        label.setText("Hello world!"); // Teks awal pada label

        button = new JButton("Klik Me!"); // Membuat tombol
        button.addActionListener(this); // Menghubungkan tombol dengan aksi klik

        setLayout(new GridLayout(2,1)); // Mengatur layout window menjadi 2 baris
        add(label); // Menambahkan label ke window
        add(button); // Menambahkan tombol ke window

        setTitle("My First Program"); // Judul window
        setVisible(true); // Menampilkan window
        setSize(300, 200); // Ukuran window
    }

    // Method yang dijalankan saat tombol diklik
    @Override
    public void actionPerformed(ActionEvent e)
    {
        label.setText("Hallo Dunia!"); // Mengubah teks label saat tombol diklik
    }
}
