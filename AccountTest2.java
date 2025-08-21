public class AccountTest2 {
    public static void main(String[] args) {
        SavingAccount2 sa1 = new SavingAccount2();

        System.out.println("---Transaksi eka---");
        sa1.name = "eka";
        sa1.deposit(5000);
        sa1.balance += sa1.calcInterest();
        sa1.withdraw(200);
        System.out.println("saldo setelah : " + sa1.balance);

        SavingAccount2 sa2 = new SavingAccount2();

        System.out.println("---Transaksi Juju---");
        sa2.name = "juju";
        sa2.deposit(10000);
        sa2.balance += sa2.calcInterest();
        sa2.withdraw(500);
        System.out.println("saldo setelah : " + sa2.balance);

    }// end class AccountTest
}