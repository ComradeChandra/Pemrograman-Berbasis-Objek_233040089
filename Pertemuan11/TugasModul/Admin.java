package Pertemuan11.TugasModul;

public class Admin extends Pengguna implements Enkripsi {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean autentikasi(String userInput, String passInput) {
        return username.equals(userInput) && password.equals(passInput);
    }

    @Override
    public String encode(String data) {
        return "ADMIN-" + new StringBuilder(data).reverse().toString();
    }
}
