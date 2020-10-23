import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Reminder {
    public static void main(String[] args) throws ParseException {
        /**
         *@author David
         *
         */
        Scanner input= new Scanner(System.in);
        // "Who needs to have sent reminders?"-function.
        // finds contact info on all who have not paid from database og prints name, address, email. And adds the correct reminderfee and adds 1 to reminderCounter

        double feePrivate = 500;
        double feeBusiness = 1000;
        double feeAgriculture = 1500;

        //Select all invoices that have not been paid on time. (compare tblInvoices.fldDate > tblPayments.fldDueDate && tblPayments.fldAmount >= tblPayments.fldAmountDue
        DB.selectSQL("Select * from tblInvoices where fldDate > * tblPayments where fldDueDate");

        //
        DB.selectSQL("Select fldDueDate from tblInvoices, fldInvoiceID from tblInvoices");
        String dueDate;
        int invoiceID;

        do{
        dueDate = DB.getData();
        invoiceID = Integer.parseInt(DB.getData());

        Date dateToValidate = new SimpleDateFormat("YYYY-MM-DD").parse(dueDate);

        Date today = Calendar.getInstance().getTime();

        if(dateToValidate.before(today));
        {
//issue reminder payment -> printe the ones they have to send to?
        }
    }
        while(!DB.getData().equals(DB.NOMOREDATA));



            //grab fldAmount and add correct reminderfee and update fldAmountDue
        DB.selectSQL("Select * from tblInvoices where  > fldDate");
        DB.insertSQL("Insert into tblPayments Values('"+CostumerId+"','"+date+"','"+PaymentType+"','"+Amount+"','"+reminderCount+"')");

        /*

        sql - list of all der ikke optræder både i invoice og payments (skal payments have et system, der godkender en payment når den er korrekt størrelse?)
        current date past dueDate - findes der en automatisk ting til det?
        check if the bill is paid on dueDate - if true - reset reminderCounter (i databasen - hvor?) // skal det her inkluderes i Payments.java eller Invoices.java.

        From database - import all invoices which are not "not paid"
        If not -> send reminder to registered email + add fee (to invoice - amount) (which fee dependant on type(3) + reminderCounter++ (i databasen - hvor?)
        System.out.print("Please, send reminder of due payment via email to:\n" +name+ \n +address+ \n +fldEmail+);  //kommando til at få fra sql?
        If reminderCounter = 3 -> send warning of closure to registered email (kopier indhold ovenfor) + add fee to (invoice amount) (which fee dependant on type(3)
        If reminderCounter = 4 -> change to inactive
         */
        select from tblCustomers
        System.out.println("Send out reminders to the following customers:\n "+DB.getData()+"" + );

        +reminderCount+ //how to increment?


    }

}db.select(SELECT fldDate from tblInvoices);

        }

