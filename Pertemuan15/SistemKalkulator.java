package Pertemuan15; // Nama folder atau paket tempat file ini disimpan

// Import semua alat yang dibutuhkan
import javax.swing.*; // Untuk komponen GUI seperti JFrame, JTextField, JButton, dll
import java.awt.*; // Untuk layout (pengaturan posisi komponen)
import java.awt.event.*; // Untuk menangani aksi tombol diklik (event listener)

// Membuat kelas SistemKalkulator, mewarisi (extends) JFrame dan bisa menangani aksi tombol (implements ActionListener)
public class SistemKalkulator extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L; // Untuk versi serialisasi objek GUI

    // Deklarasi input dan tombol
    private JTextField field1;       // Tempat input angka pertama
    private JTextField field2;       // Tempat input angka kedua
    private JButton buttonJumlah;    // Tombol untuk penjumlahan
    private JButton buttonKurang;    // Tombol untuk pengurangan
    private JButton buttonKali;      // Tombol untuk perkalian
    private JButton buttonBagi;      // Tombol untuk pembagian

    // Konstruktor: bagian yang akan dijalankan saat objek SistemKalkulator dibuat
    public SistemKalkulator() {
        // Inisialisasi semua komponen GUI
        field1 = new JTextField(); // Kotak input pertama
        field2 = new JTextField(); // Kotak input kedua
        buttonJumlah = new JButton("Jumlah"); // Tombol bertuliskan "Jumlah"
        buttonKurang = new JButton("Kurang"); // Tombol bertuliskan "Kurang"
        buttonKali = new JButton("Kali");     // Tombol bertuliskan "Kali"
        buttonBagi = new JButton("Bagi");     // Tombol bertuliskan "Bagi"

        // Menambahkan kemampuan tombol agar bisa mendeteksi klik
        buttonJumlah.addActionListener(this);
        buttonKurang.addActionListener(this);
        buttonKali.addActionListener(this);
        buttonBagi.addActionListener(this);

        // Mengatur layout menjadi 6 baris, 1 kolom
        setLayout(new GridLayout(6, 1));

        // Menambahkan semua komponen ke tampilan jendela (frame)
        add(field1);
        add(field2);
        add(buttonJumlah);
        add(buttonKurang);
        add(buttonKali);
        add(buttonBagi);

        // Mengatur properti jendela aplikasi
        setTitle("Kalkulator Sederhana"); // Judul jendela
        setSize(250, 250);                // Ukuran jendela (lebar x tinggi)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Jika ditutup, program berhenti
        setVisible(true);                 // Menampilkan jendela

        // Penjelasan tambahan:
        // - Semua komponen (input dan tombol) ditata secara vertikal.
        // - Setiap tombol akan menjalankan aksi sesuai operasi matematika saat diklik.
        // - Program ini menggunakan JOptionPane untuk menampilkan hasil atau pesan error.
    }

    // Method ini dijalankan setiap kali tombol diklik
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Mengambil angka dari kotak input dan mengubahnya dari teks ke angka (int)
            int angka1 = Integer.parseInt(field1.getText());
            int angka2 = Integer.parseInt(field2.getText());
            int hasil = 0; // Variabel untuk menyimpan hasil

            // Cek tombol mana yang diklik, lalu lakukan operasi yang sesuai
            if (e.getSource() == buttonJumlah) {
                hasil = angka1 + angka2; // Penjumlahan
            } else if (e.getSource() == buttonKurang) {
                hasil = angka1 - angka2; // Pengurangan
            } else if (e.getSource() == buttonKali) {
                hasil = angka1 * angka2; // Perkalian
            } else if (e.getSource() == buttonBagi) {
                // Cek apakah angka kedua = 0 (tidak boleh dibagi nol)
                if (angka2 == 0) {
                    JOptionPane.showMessageDialog(this, "Tidak bisa dibagi 0!", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Hentikan program di sini kalau pembagian nol
                } else {
                    hasil = angka1 / angka2; // Pembagian (bilangan bulat)
                }
            }

            // Menampilkan hasil ke layar dalam bentuk pop-up
            JOptionPane.showMessageDialog(this, "Hasil: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            // Kalau input bukan angka (misal huruf), munculkan peringatan error
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Penjelasan tambahan:
        // - Semua operasi matematika dilakukan setelah input dipastikan berupa angka.
        // - Jika input tidak valid (misal huruf), user akan diberi pesan error.
        // - Jika pembagian dengan nol, user juga akan diberi pesan error khusus.
    }

    // Fungsi utama yang menjalankan program
    public static void main(String[] args) {
        new SistemKalkulator(); // Membuat dan menampilkan objek SistemKalkulator

        // Penjelasan tambahan:
        // - Program akan langsung menampilkan window kalkulator saat dijalankan.
        // - Semua interaksi dilakukan lewat GUI, tidak lewat terminal.
    }
}
