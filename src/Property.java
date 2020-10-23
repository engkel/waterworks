import java.util.Scanner;

public class Property {
    /**
    * @author Ibraheem David Andrej
    * class Property is used to get the data about customers property.
    * The user is asked to input: address
    * property type which is stored in order to calculate the invoice since water tax depends on the type of property
    * number of meters,customer ID, and meter ID
    * All of the input data is then stored in the database
    */
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        //Getting the inputs from the user
        
        System.out.println("Please insert the property address: ");
        String address= input.nextLine();
        System.out.println("Please insert property type: ");
        String propertyType= input.nextLine();
        System.out.println("Please insert number of meters: ");
        String NumberOfMeters= input.nextLine();
        System.out.println("Please insert custumer id: ");
        String CustomerId= input.nextLine();
        System.out.println("Please insert meter id: ");
        String MeterId= input.nextLine();
        
        //Inserting the given values into our database

        DB.insertSQL("Insert into tblProperty Values('"+address+"','"+propertyType+"','"+NumberOfMeters+"','"+CustomerId+"','"+MeterId+"')");
    }
}
