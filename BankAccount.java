public class BankAccount{
  private double checkingBalance;
  private double savingsBalance;
  private static int totalAccounts = 0;
  private static double totalAmountStored = 0;

  public BankAccount(){
    this.checkingBalance = 100.00;
    this.savingsBalance = 250.00;
    totalAccounts += 2;
    totalAmountStored += (this.checkingBalance + this.savingsBalance);
  }


  public double getCheckingBalance(){
    return this.checkingBalance;
  }

  public double getSavingsBalance(){
    return this.savingsBalance;
  }

  public double getTotalAmountStored(){
    return this.totalAmountStored;
  }

  public double getTotalBalance(){
    return this.checkingBalance + this.savingsBalance;
  }

  public String makeDeposit(String account, double amount){
    if (account == "checking"){
      this.checkingBalance += amount;
      totalAmountStored += amount;
      return "You've deposited $" + amount + " into your checking account";
    } else if (account == "savings"){
      this.savingsBalance += amount;
      totalAmountStored += amount;
      return "You've deposited $" + amount + " into your savings account";
    } 
      return "Please choose either checking or savings";
  }

  public String makeWithdraw(String account, double amount){
    if (account == "checking"){
      if (this.checkingBalance >= amount){
        this.checkingBalance -= amount;
        totalAmountStored -= amount;
        return "You've withdrew $" + amount + " from your checking account";
      }
      return "insufficient funds!";
    } else if (account == "savings") {
      if (this.savingsBalance >= amount){
        this.savingsBalance -= amount;
        totalAmountStored -= amount;
        return "You've withdrew $" + amount + " from your savings account";
      }
    }
    return "Please choose either checking or savings";
  }
}