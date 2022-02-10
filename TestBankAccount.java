public class TestBankAccount {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(100,100);
        BankAccount account2 = new BankAccount(250,1000);

        System.out.println(account1.getCheckBal());
        System.out.println(account1.getSaveBal());


        account2.depositCheckBal(200);
        System.out.println(account2.getCheckBal());

        account2.withdrawCheckBal(900);

        System.out.println("Total Balance: " + BankAccount.getTotalBal());
        
        account2.withdrawCheckBal(450);

        System.out.println("Updated Total Balance: " + BankAccount.getTotalBal());
        System.out.println("Account count: " + BankAccount.getAccCount());


    }
}
