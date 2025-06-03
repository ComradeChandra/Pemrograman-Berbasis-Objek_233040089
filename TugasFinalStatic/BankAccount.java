package TugasFinalStatic;

public class BankAccount {
    // Variabel accountNumber bersifat final, artinya nilainya tidak bisa diubah setelah diinisialisasi
    private final String accountNumber; // tidak bisa diubah

    // Variabel balance dapat diakses oleh subclass karena menggunakan protected
    protected double balance;

    // Konstruktor untuk menginisialisasi accountNumber dan balance saat objek dibuat
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method untuk menambah saldo (deposit)
    // Hanya menambah saldo jika amount bernilai positif
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // saldo bertambah
        } else {
            // Jika amount <= 0, tampilkan pesan error
            System.out.println("Jumlah deposit harus lebih dari 0.");
        }
    }

    // Method final untuk menampilkan informasi rekening
    // Tidak bisa di-override oleh subclass
    public final void displayAccountInfo() {
        System.out.println("Rekening: " + accountNumber);
        System.out.println("Saldo   : " + balance);
    }
}
