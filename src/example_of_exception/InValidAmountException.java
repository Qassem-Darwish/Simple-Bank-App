
package example_of_exception;


public class InValidAmountException extends Exception{

    public InValidAmountException() {
        super();
    }

    public InValidAmountException(String string) {
        super(string);
    }
    
}
