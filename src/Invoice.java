import java.util.Scanner;
import java.util.Date;

/**
*
* @author David Andrej Ibraheem 
*/

public class Invoice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        //Getting the input from user
        
        System.out.println("Please insert the amount due: ");
        //Converting from String to double, because if we use nextDouble, the database skips the next input
        System.out.println("Please insert the due date: ");
        String date= input.nextLine();

        //Inserting the given values into our database
        
        DB.insertSQL("Insert into tblInvoices Values('"+date+"',"+AmountDue+")");
    }
}
