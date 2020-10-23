import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *@author David
 *Reminder Generator - run this program when you need to get a list of customers who we need to send reminders to.
 * It creates a list with contact info of all who have not paid the invoices from database the current day.
 * Furthermore it adds the correct reminderFee dependant on segment type and adds 1 to reminderCounter in the database.
 * When reminderCounter reaches 3, last warning is send and status in the database changes to inactive. If new payment
 * from id -> reset counter.
 */

public class Reminder {
    public static void main(String[] args) throws ParseException {

        Scanner input= new Scanner(System.in);

        //hardcoded reminderFees
        double feePrivate = 500;
        double feeBusiness = 1000;
        double feeAgriculture = 1500;

        String dueDate;
        int invoiceID;
        String reminderCounter;

        DB.selectSQL("SELECT fldInvoiceId FROM tbl AND fld"); //grab the relevant reminderCounter
        reminderCounter = DB.getData();

        //Select all invoices that have not been paid on time. (compare fldDate from tblInvoices > fldDueDate from tblPayments && tblPayments.fldAmount >= tblPayments.fldAmountDue
        DB.selectSQL("SELECT fldDueDate, fldInvoiceId FROM tblInvoices");

        do{
        dueDate = DB.getData();                      //first piece of data fldDueDate assigned to dueDate
        invoiceID = Integer.parseInt(DB.getData());  //second piece of data fldInvoiceId assigned to invoiceID

        Date dateToValidate = new SimpleDateFormat("YYYY-MM-DD").parse(dueDate);

        Date today = Calendar.getInstance().getTime();



        if(dateToValidate.before(today));
        {

            if(reminderCounter.equals("0") OR , "1", "2"); //hvordan var det nu med equals OR ???
        //print list of customers to send reminders to (System.out.print("Please, send reminder of due payment via email to:\n" +name+ \n +address+ \n +fldEmail+);  //kommando til at få fra sql?

            DB.selectSQL("Select fldAmount from tblInvoices where");   //grab fldAmount and add correct reminderfee and update fldAmountDue
            //DB.insertSQL("Insert into tblPayments Values('"+customerId+"','"+date+"','"+PaymentType+"','"+Amount+"','"+reminderCount+"')");
            //If not -> send reminder to registered email + add fee (to invoice - amount) (which fee dependant on type(3) + reminderCounter++ (i databasen - hvor?)

            else() reminderCounter.equals(3);
                then


        }
    }
        while(!DB.getData().equals(DB.NOMOREDATA));

        /*
        If reminderCounter = 3 -> send warning of closure to registered email (kopier indhold ovenfor) + add fee to (invoice amount) (which fee dependant on type(3)
        If reminderCounter = 4 -> change to inactive
         */

        //select from tblCustomers
        //System.out.println("Send out reminders to the following customers:\n "+DB.getData()+"" + );

        //add reminderFee

        //+reminderCounter+ // getvalue ->  parse til int -> increment -> sql insert  (hvordan identificeres den rigtige - id)

        //check if the bill is paid on dueDate - if true - insert 0 into reminderCounter - hører den til i payments?
    }
}
//db.select(SELECT fldDate from tblInvoices);- is this just garbage?



