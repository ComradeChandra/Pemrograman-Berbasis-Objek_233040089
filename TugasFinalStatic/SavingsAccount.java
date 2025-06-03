package TugasFinalStatic;

// SavingsAccount adalah subclass dari BankAccount
public class SavingsAccount extends BankAccount {
    // Konstruktor SavingsAccount memanggil konstruktor superclass (BankAccount)
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // memanggil konstruktor BankAccount
    }

    // Contoh berikut akan error jika di-uncomment,
    // karena displayAccountInfo() di BankAccount sudah final,
    // sehingga tidak bisa di-override di subclass manapun.
    
    
    /*
    @Override
    public void displayAccountInfo() {
        // mencoba override - akan error
    }
    */
}
