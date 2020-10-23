import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class Payments {
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
