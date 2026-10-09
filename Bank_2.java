import java.util.ArrayList;

public class Bank_2 {
    private int balance;
    private ArrayList<String> history;  // menyimpan riwayat transaksi

    // constructor
    public Bank_2(int balance) {
        this.balance = balance;
        history = new ArrayList<String>();
        history.add("Saldo awal: Rp " + balance);
    }

    public void deposit(int amount) {
        balance = balance + amount;
        history.add("Deposit: Rp " + amount + " | Saldo: Rp " + balance);
        System.out.println("Deposit: Rp " + amount);
        System.out.println("Current balance: Rp " + balance);
    }

    public void withdraw(int amount) {
        // cek dulu apakah saldo cukup
        if (amount > balance) {
            System.out.println("Withdraw gagal, saldo tidak cukup!");
            history.add("Withdraw GAGAL: Rp " + amount);
        } else {
            balance = balance - amount;
            history.add("Withdraw: Rp " + amount + " | Saldo: Rp " + balance);
            System.out.println("Withdraw: Rp " + amount);
            System.out.println("Current balance: Rp " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }

    // menampilkan semua riwayat dari ArrayList
    public void showHistory() {
        System.out.println("=== Riwayat Transaksi ===");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
    }
}