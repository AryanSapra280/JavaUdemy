package tasks;

public class Bank {
    static int count = 0;
    private Integer accountNo;
    private Integer balance;
    public Bank(Integer balance){
        this.balance = balance;
        this.accountNo = ++count;
        currentBalance();
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    private void currentBalance() {
        System.out.println("The account number is:" + accountNo);
        System.out.println("Current account balance is :" + balance);
    }
    public void deposit(Integer amount) {
        if(amount<0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        currentBalance();
    }
    public void withDraw(Integer amount) {
        if(amount>balance) {
            System.out.println("Not sufficient balance");
            return;
        }
        balance-=amount;
        currentBalance();
    }
    public static void main(String args[]) {
        Bank bank = new Bank(1000);
        bank.deposit(1000);
        bank.withDraw(3000);
        bank.withDraw(2000);
    }
}
