class BankAccount
{
	private String name;
    private int balance;
    private int frame;
    
    public BankAccount(String name,int balance,int frame)  {
        this.name=name;
        this.balance=balance;
        this.frame=frame;
    }
    
    public String getName() { 
        return this.name;
    }
    public int getBalance() { 
        return this.balance;
    }
    public int getFrame() { 
        return this.frame;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (balance-amount<-1000) {
            System.out.println("Sorry, you can't withdraw!");
            
        }
        else {
            balance = balance - amount;
        }
    }

    public void transfer(BankAccount a, BankAccount b, int amount) {
        int money = a.getBalance();
        a.withdraw(amount);
        if (money!=a.getBalance()) {
            b.deposit(amount);
        }
    }

}
