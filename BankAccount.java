public class BankAccount{
  private String password;
  private double balance;
  public static final double OVERDRAWN_PEN=20.00;

  public BankAccount(){
    password =" ";
    balance = 0.0;
    BankAccount b = new BankAccount();
  }

  public BankAccount(String acctPwd, double acctBal){
    password = acctPwd;
    balance = acctBal;
    
  }
  public void deposit(String acctPwd, double amount){
    if(!acctPwd.equals(password)){
      System.out.println("Nope");
    }
    else
      balance+= amount;
    
  }

  public void withdraw(String acctPwd, double amount){
    
  }

  public double getBalance(){
    BankAccount b1 = new BankAccount("M", 400.00);
    BankAccount b2 = new BankAccount("S", 500.00);

    
    return balance;
    
  }

  
}