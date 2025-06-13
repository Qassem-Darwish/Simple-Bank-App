package example_of_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_Of_Exception {


    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            Non_Name_Bank ac1 = new Non_Name_Bank();
            String option = "";

            do {
                System.out.println("1. DEPOSIT");
                System.out.println("2. WITHDRAW");
                System.out.println("3. BALANCE ENQUIRY");
                System.out.print("ENTER OPTION : ");
                option = in.next();

                switch (option) {
                    case "1": {
                        System.out.print("ENTER YOUR DEPOSIT AMOUNT : ");
                        double amt = in.nextDouble();
                        ac1.depoist(amt);
                        ac1.balanceEnquiry();
                        break;
                    }
                    case "2": {
                        System.out.print("ENTER WITHDRAW AMOUNT : ");
                        double amt = in.nextDouble();
                        double wd = ac1.Withdrwa(amt);
                        System.out.println("WITHDRAW AMOUNT IS : " + wd);
                        ac1.balanceEnquiry();
                        break;
                    }
                    case "3": {
                        ac1.balanceEnquiry();
                        break;
                    }
                    default: {
                        System.out.println("BAD ENTRY");
                    }
                }

                System.out.println("DO YOU WANT TO CONTINUE (YES/NO)");
                option = in.next();

            } while (option.equalsIgnoreCase("YES"));
        } catch (InValidAmountException iae) {
            System.out.println(iae.getMessage());
        } catch (InsufficientFundsException ife) {
            // InsufficientFundsException is a custom exception
            System.out.println(ife.getMessage());
        } catch (InputMismatchException ime) {
            // InputMismatchException is a custom exception
            System.out.println(ime.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }

    }

}
