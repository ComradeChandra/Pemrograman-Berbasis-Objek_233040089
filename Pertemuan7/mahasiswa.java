package Pertemuan7;

public class Mahasiswa {
    private String NRP;
    private String Nama;

    // Constructor
    public Mahasiswa(String nrp, String nama) {
        this.NRP = nrp;
        this.Nama = nama;
    }

    // Method to display student details
    public String display() {
        return "NRP: " + NRP + ", Nama: " + Nama;
    }

    // Getters and Setters
    public String getNRP() {
        return NRP;
    }

    public void setNRP(String nrp) {
        this.NRP = nrp;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }
}