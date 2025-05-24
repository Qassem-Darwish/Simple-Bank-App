
package example_of_exception;


public class InsufficientFundsException extends Exception{

    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String string) {
        super(string);
    }
    
}
