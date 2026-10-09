public class DemoBank {
    public static void main(String[] args) {
        Bank_2 bank = new Bank_2(100000);

        System.out.println("Welcome to Bank ABC");
        System.out.println("Current balance: Rp " + bank.getBalance());
        System.out.println();

        bank.deposit(500000);
        System.out.println();

        bank.withdraw(150000);
        System.out.println();

        bank.withdraw(1000000);  // contoh gagal, saldo tidak cukup
        System.out.println();

        bank.showHistory();
    }
}