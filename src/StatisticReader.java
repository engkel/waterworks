import java.util.Scanner;

public class StatisticReader {
    
    /**
    * @author David Ibraheem Andrej
    * class StatisticReader is used to generate a single day total consumption
    * the program asks the user to input a date, and all of the consumption data on that day is collected is added up 
    * and the total is printed to the user
    */
    
    public StatisticReader() {
        
        //Getting user inputs

        Scanner input= new Scanner(System.in);
        System.out.println("Please insert a date for consumption");
        String inputDate= input.nextLine();
        
        //Collecting data from our database
        
        DB.selectSQL("Select Sum (fldConsumption) from tblMeters where fldDate='"+inputDate+"'");
    
        //Displaying the data to user
        
        do{
            String data = DB.getDisplayData();
            if (data.equals(DB.NOMOREDATA)){
                break;
            }else{
               
                System.out.print("The total water consumption on " +inputDate +  " is " +data);
            }
        } while(true);


    }

    public static void main(String[] args) {
        StatisticReader myObj = new StatisticReader();
        System.out.println(myObj);
    }
}
