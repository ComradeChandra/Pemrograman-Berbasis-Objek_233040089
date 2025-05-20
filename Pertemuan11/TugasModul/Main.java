package Pertemuan11.TugasModul;
public class Main {
    public static void main(String[] args) {
        Pengguna admin = new Admin("admin123", "passadmin");
        Pengguna user = new UserBiasa("user321", "passuser");

        System.out.println("== Admin ==");
        System.out.println("Autentikasi: " + admin.autentikasi("admin123", "passadmin"));
        System.out.println("Enkripsi: " + ((Enkripsi)admin).encode("RahasiaAdmin"));

        System.out.println("\n== User Biasa ==");
        System.out.println("Autentikasi: " + user.autentikasi("user321", "passuser"));
        System.out.println("Enkripsi: " + ((Enkripsi)user).encode("PrivasiUser"));
    }
}
