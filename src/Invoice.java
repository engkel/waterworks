import java.util.Scanner;
import java.util.Date;

/**
* @author David Andrej Ibraheem 
* Invoice class is used to create an invoice, it asks user to input the amount due and the due date of the invoice
*
*/

public class Invoice {
    public Invoice () {
        Scanner input= new Scanner(System.in);
        
        //Getting the input from user
        
        System.out.println("Please insert the amount due: ");
        String AmountDue= input.nextLine();
        //Converting from String to double, because if we use nextDouble, the database skips the next input
        System.out.println("Please insert the due date: ");
        String date= input.nextLine();

        //Inserting the given values into our database
        
        DB.insertSQL("Insert into tblInvoices Values('"+date+"',"+AmountDue+")");
    }

    public static void main(String[] args) {
        Invoice myObj = new Invoice();
        System.out.println(myObj);
    }
}
