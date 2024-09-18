class BankAccount
{
	private String name;
    private int balance;
    private int minBalance;
    
    public BankAccount(String name,int balance,int minBalance)  {
        this.name=name;
        this.balance=balance;
        this.minBalance=minBalance;
    } 
    
    public String getName() { 
        return this.name;
    }
    public int getBalance() { 
        return this.balance;
    }
    public int getminBalance() { 
        return this.minBalance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (balance-amount<minBalance) {
            System.out.println("Sorry, you can't withdraw!");
            
        }
        else {
            balance = balance - amount;
        }
    }

    public String toString(){ 
        return "Balance of "+this.name+": "+this.balance;
    }

    public void transfer(BankAccount a, BankAccount b, int amount) {
        int money = a.getBalance();
        a.withdraw(amount);
        if (money!=a.getBalance()) {
            b.deposit(amount);
        }
    }

}
