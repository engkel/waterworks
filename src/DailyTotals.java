import java.util.Scanner;
import java.sql.SQLException;
public class DailyTotals {
    /** @author Andrej David Ibraheem
     *  DailyTotals class firstly asks a user to input the type of payment to generate the totals for (cash/bank transfer/giro)
     *  Once the input is recieved the program checks the database and collects all of the data with the specific type and date
     *  and it adds up all of the amounts, then the program displays the data to the user
     *
     *
     */
    
    
    
    
    public static void main(String[] args) {
        //Getting the inputs from the user
        System.out.println("What type of payments do you want to generate totals for?");
        Scanner input = new Scanner(System.in);
        String typeOfPayment = input.nextLine().toLowerCase();
        //Changed type of Payment input in order to negate spelling differences
        System.out.println("For which date should the averages be? (date input yy-mm-dd) ");
        String date= input.nextLine();

        if(typeOfPayment.equals("bank")){
            // Getting the total sum for any given day for desired type of payment from the database and printing it out
            DB.selectSQL("Select Sum(fldAmount) from tblPayments where fldPaymentType='bank' and fldDate='"+date+"'");
            System.out.println("The bank total for "+date+" is: "+DB.getData()+" DKK");

        }
        else if(typeOfPayment.equals("giro")){
            DB.selectSQL("Select Sum(fldAmount) from tblPayments where fldPaymentType='giro' and fldDate='"+date+"'");
            System.out.println("The giro total for"+date+" is: " +DB.getData()+" DKK");

        }
        else if(typeOfPayment.equals("cash")){
            DB.selectSQL("Select Sum(fldAmount) from tblPayments where fldPaymentType='cash' and fldDate='"+date+"'");
            System.out.println("The cash total for "+date+" is: "+DB.getData()+" DKK");

        }else{
            // Prompting the user if the input was invalid
            System.out.println("input valid payment type");

        }
    }
}
