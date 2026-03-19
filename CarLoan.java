// Monthly car loan payment calculator.
public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3; // This will represent a loan length of 3 years.
    int interestRate = 5; // This will represent an interest rate of 5% on the loan.
    int downPayment = 2000; // This will represent the down payment provided by a user for this car purchase.

    if (interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    }
    else if (downPayment >= carLoan) {
        System.out.println("The car can be paid in full");
    }
    else {
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months; // This represents the monthly payment without interest included.
        int interest = monthlyBalance * interestRate / 100;
        int monthlyPayment = monthlyBalance + interest;

        System.out.println(monthlyPayment);
        }
    }
}