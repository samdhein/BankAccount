public class BankAccount {
    // attributes
    private double checkBal;
    private double saveBal;

    // static
    private static int accCount;
    private static double totalBal;

    // static getters
    public static int getAccCount(){
        return accCount;
    }
    public static double getTotalBal(){
        return totalBal;
    }

    // constructor
    public BankAccount(double checkBal, double saveBal){
        this.checkBal = checkBal;
        this.saveBal= saveBal;
        accCount++;
        totalBal += (checkBal + saveBal);
    }

    // getters
    public double getCheckBal(){
        return this.checkBal;
    }
    public double getSaveBal(){
        return this.saveBal;
    }

    // setters
    public void depositCheckBal(double deposit){
        this.checkBal += deposit;
        totalBal += deposit;
    }
    public void depositSaveBal(double deposit){
        this.saveBal += deposit;
        totalBal += deposit;
    }
    public void withdrawCheckBal(double withdrawal){
        if (this.checkBal >= withdrawal){
            this.checkBal -= withdrawal;
            totalBal -= withdrawal;
        } else {
            System.out.printf("Available funds of $%.2f insufficient to withdraw $%.2f", this.checkBal, withdrawal);
        }
    }
    public void withdrawSaveBal(double withdrawal){
        if (this.saveBal >= withdrawal){
            this.saveBal -= withdrawal;
            totalBal -= withdrawal;
        } else {
            System.out.printf("Available funds of $%.2f insufficient to withdraw $%.2f", this.saveBal, withdrawal);
        }
    }
}