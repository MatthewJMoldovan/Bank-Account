public class BankAccountTest{
  public static void main(String[] args){
    
    BankAccount account1 = new BankAccount();

    System.out.println("$" + account1.getCheckingBalance());
    System.out.println("$" + account1.getSavingsBalance());
    System.out.println("Total amount stored: $" + account1.getTotalAmountStored());
    System.out.println(account1.makeDeposit("checking", 100));
    System.out.println(account1.makeDeposit("savings", 100));
    System.out.println("$" + account1.getCheckingBalance());
    System.out.println("$" + account1.getSavingsBalance());
    System.out.println("Total amount stored: $" + account1.getTotalAmountStored());
    System.out.println(account1.makeWithdraw("checking", 300));
    System.out.println(account1.makeWithdraw("savings", 200));
    System.out.println("$" + account1.getCheckingBalance());
    System.out.println("$" + account1.getSavingsBalance());
    System.out.println("Total amount stored: $" + account1.getTotalAmountStored());
    System.out.println("Total balance: $" + account1.getTotalBalance());
  }
}