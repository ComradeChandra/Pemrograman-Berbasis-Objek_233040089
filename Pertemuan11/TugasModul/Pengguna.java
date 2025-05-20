package Pertemuan11.TugasModul;

public abstract class Pengguna {
    protected String username;
    protected String password;

    public Pengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract boolean autentikasi(String userInput, String passInput);
}
