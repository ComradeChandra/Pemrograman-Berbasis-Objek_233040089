package Pertemuan15;

import javax.swing.JFrame;

// Kelas utama yang menjalankan seluruh aplikasi GUI
public class ProgramUtama {
    public static void main(String[] args) {
        // Tugas 1: Membuka window HelloWorldForm1
        new HelloWorldForm1();

        // Tugas 2: Membuka window HelloWorldForm2
        JFrame form = new HelloWorldForm2();
        form.setVisible(true);

        // Tugas 3: Membuka window HelloWorldForm3
        new HelloWorldForm3();

        // Tugas 4: Membuka window SistemKalkulator
        new SistemKalkulator();
    }
}