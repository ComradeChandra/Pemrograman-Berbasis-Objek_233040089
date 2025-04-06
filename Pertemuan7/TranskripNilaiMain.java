package Pertemuan7;
public class TranskripNilaiMain {
    public static void main(String[] args) {

     // Create objek MataKuliah 
     MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3, "Dr. A");
     MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3, "Dr. B");
     MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3, "Dr. C");

KartuHasilStudi khs = new KartuHasilStudi("20222");
   khs.addMataKuliah(mk1);
   khs.addMataKuliah(mk2);
   khs.addMataKuliah(mk3);
   Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");
   TranskripNilai transkrip = new TranskripNilai(mhs);
   transkrip.addKHS(khs);
transkrip.hitungIPK();
  	transkrip.display();
   }
}
