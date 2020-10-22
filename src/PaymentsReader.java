import java.util.Scanner;

public class PaymentsReader {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);


        System.out.println("Please insert the date");
        String inputDate= input.nextLine();


        DB.selectSQL("Select Sum (fldAmount) from tblPayments where fldDate='"+inputDate+"'");
        do{
            String data = DB.getDisplayData();
            if (data.equals(DB.NOMOREDATA)){
                break;
            }else{
                System.out.print("The total Payments on " +inputDate +  " is " +data);
            }
        } while(true);



        DB.selectSQL("Select Sum (fldAmount) from tblPayments where fldPaymentType='cash' and fldDate='"+inputDate+"'");
        do{
            String data = DB.getDisplayData();
            if (data.equals(DB.NOMOREDATA)){
                break;
            }else{
                System.out.print("The cash payments on " +inputDate +  " is " +data);
            }
        } while(true);

        DB.selectSQL("Select Sum (fldAmount) from tblPayments where fldPaymentType='bank' and fldDate='"+inputDate+"'");
        do{
            String data = DB.getDisplayData();
            if (data.equals(DB.NOMOREDATA)){
                break;
            }else{
                System.out.print("The bank payments on " +inputDate +  " is " +data);
            }
        } while(true);

        DB.selectSQL("Select Sum (fldAmount) from tblPayments where fldPaymentType='giro' and fldDate='"+inputDate+"'");

        do{
            String data = DB.getDisplayData();
            if (data.equals(DB.NOMOREDATA)){
                break;
            }else{
                System.out.print("The giro payments on " +inputDate +  " is " +data);
            }
        } while(true);

    }

}
