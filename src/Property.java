import java.util.Scanner;

public class Property {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        //Getting the inputs from the user
        
        System.out.println("Please insert the property address: ");
        String address= input.nextLine();
        System.out.println("Please insert property type: ");
        String propertyType= input.nextLine();
        System.out.println("Please insert number of meters: ");
        String NumberOfMeters= input.nextLine();
        System.out.println("Please insert costumer id: ");
        String CustomerId= input.nextLine();
        System.out.println("Please insert meter id: ");
        String MeterId= input.nextLine();
        
        //Inserting the given values into our database

        DB.insertSQL("Insert into tblProperty Values('"+address+"','"+propertyType+"','"+NumberOfMeters+"','"+CustomerId+"','"+MeterId+"')");
    }
}
