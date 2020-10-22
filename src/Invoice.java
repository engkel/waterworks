import java.util.Scanner;
import java.util.Date;

public class Invoice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please insert the amount due: ");
        double AmountDue= Double.parseDouble(input.nextLine());
        System.out.println("Please insert the due date: ");
        String date= input.nextLine();


        DB.insertSQL("Insert into tblInvoices Values('"+date+"',"+AmountDue+")");
    }
}
