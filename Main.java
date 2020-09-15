import java.util.Scanner;

/**
 * a program to deteremine the discount and cost of items during a special sale
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // enter amount of money user spends
    System.out.println("Please enter amount of money you spent:");
    double amountSpent = input.nextDouble();

    // store the  max discount for 10%
    double FORTY_DOLL = 40.00;

    // store the max discount for 20%
    double EIGHTY_DOLL = 80.00;

    // store the max discount for 30%
    double ONE_TWENTY_DOLL = 120.00;

    // store the least amount of money for discount of 40%
    double ONE_TWENTY_POINT_1 = 120.01;

    // declare a variable for 10% off
    double tenPercent = 0.10;

    // declare a variable for 20% off
    double twentyPercent = 0.20;

    // declare a variable for 30% off
    double thirtyPercent = 0.30;

    //declare a variable for 40% off
    double fortyPercent = 0.40;

    // store the amount of money the user saves with 10%
    double moneySaved10 = amountSpent*tenPercent;

    // store the amount of money the user saves with 20%
    double moneySaved20 = amountSpent*twentyPercent;

    // store the amount of money saved with 30%
    double moneySaved30 = amountSpent*thirtyPercent;

    // store the amount of money saved with 40%
    double moneySaved40 = amountSpent*fortyPercent;

    // store new total of 10% saved
    double newTotal10 = amountSpent - moneySaved10;

    // store new total of 20% saved
    double newTotal20 = amountSpent - moneySaved20;

    // store new total of 30% saved
    double newTotal30 = amountSpent - moneySaved30;

    // store new total of 40% saved
    double newTotal40 = amountSpent - moneySaved40;

    // find out the discount the user gets
    if (amountSpent < FORTY_DOLL) {
      System.out.println("You received 10% off, You saved " + moneySaved10 + " Your new total is " + newTotal10);
    } else if (amountSpent > FORTY_DOLL && amountSpent < EIGHTY_DOLL){
      System.out.println("You received 20% off, You saved " + moneySaved20 + " Your new total is " + newTotal20);
    } else if (amountSpent > EIGHTY_DOLL && amountSpent < ONE_TWENTY_DOLL) {
      System.out.println("You received 30% off, You saved " + moneySaved30 + " Your new total is " + newTotal30);
    } else if (amountSpent > ONE_TWENTY_DOLL) {
      System.out.println("You received 40% off, You saved " + moneySaved40 + " Your new total is " + newTotal40);
    }

    
    
  }
}
