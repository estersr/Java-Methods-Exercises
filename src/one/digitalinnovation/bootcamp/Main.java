package one.digitalinnovation.bootcamp;

public class Main {
    public static void main(String[] args) {

        // Calculator
        System.out.println("Calculator Exercize:");
        Calculator.addition(3, 6);
        Calculator.subtraction(9, 1.8);
        Calculator.multiplication(7, 8);
        Calculator.division(5, 2.5);

        //Message
        System.out.println("Message Exercize: ");
        Message.receiveMessage(9);
        Message.receiveMessage(14);
        Message.receiveMessage(1);

        //Loan
        System.out.println("Loan Exercize");
        Loan.calculate(1000, Loan.getTwoInstallments());
        Loan.calculate(1000, Loan.getThreeInstallments());
        Loan.calculate(1000, 5);


    }
}
