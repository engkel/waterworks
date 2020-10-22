import java.util.Scanner;
import java.sql.SQLException;
public class DailyTotals {
    public static void main(String[] args) {
        System.out.println("What type of payments do you want to generate totals for?");
        Scanner input = new Scanner(System.in);
        String typeOfPayment = input.nextLine().toLowerCase();
        System.out.println("For which date should the averages be? (date input yy-mm-dd) ");
        String date= input.nextLine();

        if(typeOfPayment.equals("bank")){
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
            System.out.println("input valid payment type or date");

        }
    }
}
