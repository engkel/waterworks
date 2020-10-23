import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;


public class Payments {
    
    /**
    * @author Ibraheem David Andrej
    * The class payments asks the user to input information about the recieved payment
    * Customer Id is used to assign a specific payment to specific customer 
    * The payment date is used  later on to check if the payment was made on time
    * PaymentType is used in order to generate the daily cash flow in DailyTotals class
    * Amount is used to check if the full amount is paid
    * Reminder count is used to keep track of how many reminders have been sent and how much late fee should be added to the invoice
    */
    
    
    
    
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Getting the inputs from the user

        System.out.println("Please insert customer Id: ");
        String CostumerId= input.nextLine();
        System.out.println("Please insert the date: ");
        String date= input.nextLine();
        System.out.println("Please insert payment type (cash,giro,bank): ");
        String PaymentType= input.nextLine();
        System.out.println("Please insert the amount:");
        String Amount= input.nextLine();
        System.out.println("Please input reminder count(if none please insert 0)");
        String reminderCount = input.nextLine();

        //Inserting the given values into our database

        DB.insertSQL("Insert into tblPayments Values('"+CostumerId+"','"+date+"','"+PaymentType+"','"+Amount+"','"+reminderCount+"')");
    }
}
