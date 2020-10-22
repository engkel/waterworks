import java.util.Scanner;

public class Meters {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        //Getting the inputs from the user
        
        System.out.println("Please insert meter Id: ");
        String MeterId= input.nextLine();
        System.out.println("Please insert consumption: ");
        String Consumption= input.nextLine();
        System.out.println("Please insert the date: ");
        String date= input.nextLine();
        
        //Inserting the given values into our database
        
        DB.insertSQL("Insert into tblMeters Values('"+MeterId+"','"+Consumption+"','"+date+"')");

    }
}
