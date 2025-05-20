package Pertemuan11.TugasModul;

public class UserBiasa extends Pengguna implements Enkripsi {

    public UserBiasa(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean autentikasi(String userInput, String passInput) {
        return username.equals(userInput) && password.equals(passInput);
    }

    @Override
    public String encode(String data) {
        return "USER-" + data.replaceAll(".", "*");
    }
}
