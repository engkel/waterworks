import java.util.Scanner;

public class StatisticReader {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please insert a date for consumption");
        String inputDate= input.nextLine();

        DB.selectSQL("Select Sum (fldConsumption) from tblMeters where fldDate='"+inputDate+"'");

        do{
            String data = DB.getDisplayData();
            if (data.equals(DB.NOMOREDATA)){
                break;
            }else{
                System.out.print("The total water consumption on " +inputDate +  " is " +data);
            }
        } while(true);


    }
}
