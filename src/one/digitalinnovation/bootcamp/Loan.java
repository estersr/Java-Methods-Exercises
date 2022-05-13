package one.digitalinnovation.bootcamp;

public class Loan {
   public static int getTwoInstallments(){
       return 2;
   }
   public static int getThreeInstallments(){
       return 3;
   }
   public static double getTwoInstallmentsFee(){
       return 0.3;
   }
   public static double getThreeInstallmentsFee(){
       return 0.45;
   }

   public static void calculate (double value, int installments) {
       if(installments == 2) {
           double finalValue = value + (value + getTwoInstallmentsFee());
                   System.out.println("The final value of the Loan with 2 installments is: $ " + finalValue);
       } else if (installments == 3) {
           double finalValue = value + (value * getThreeInstallmentsFee());
           System.out.println("The final value of the Loan with 2 installments is: $ " + finalValue);
       } else {
           System.out.println("Installment number denied.");
       }
   }
}
