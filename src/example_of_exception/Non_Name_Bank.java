
package example_of_exception;


public class Non_Name_Bank {
    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void depoist(double amount) throws InValidAmountException{
        if( amount <=0){
            throw new InValidAmountException(amount + " is not valid");
        } 
          balance = this.getBalance() + amount;
    }
    
    public double Withdrwa(double amount) throws InsufficientFundsException{
        if( amount > balance){
            throw new InsufficientFundsException("Insufficient funds");
        }
        return  (balance = this.getBalance() - amount) ;
    }
    public void balanceEnquiry(){
        System.out.println("current balance = " + balance);
    }
    
    
}
