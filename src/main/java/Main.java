import java.util.*;
class Main
{ 
	  Scanner reader = new Scanner(System.in);
	  public static void main(String[] args) {
	   
		  BankAccount ba1 = new BankAccount("Bob", 1000, -1000);
		  BankAccount ba2 = new BankAccount("Lisa", 1000, -1000);
		  System.out.println(ba1.getName() + "'s balance is: " + ba1.getBalance());
		  System.out.println(ba2.getName() + "'s balance is: " + ba2.getBalance());
          ba1.transfer(ba1, ba2,500);
          System.out.println(ba1.getName() + "'s balance is: " + ba1.getBalance());
		  System.out.println(ba2.getName() + "'s balance is: " + ba2.getBalance());
          ba1.transfer(ba1, ba2,1600);
          System.out.println(ba1.getName() + "'s balance is: " + ba1.getBalance());
		  System.out.println(ba2.getName() + "'s balance is: " + ba2.getBalance());
		  ba1.toString();
	  }
}
