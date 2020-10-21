import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please insert the amount due: ");
        String AmountDue= input.nextLine();
        System.out.println("Please insert the due date: ");
        String DueDate= input.nextLine();


        DB.insertSQL("Insert into tblInvoices Values('"+AmountDue+"','"+DueDate+"')");
    }
}
