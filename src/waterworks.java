import java.util.Scanner;
public class waterworks {
  
 
/**
 *
 * @author Andrej :0
 */    
  
    public static void main (String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Please insert the customers name: ");
       String name = input.next();
        System.out.println("Please insert the customers address: ");
        String address = input.next();
        System.out.println("Please insert customers email: ");
        String email = input.next();
        System.out.println("Please input customers phone number: ");
        String phoneNumber= input.next();
        System.out.println("Please input customers status(Active or inactive): ");
        String activity = input.next();

        DB.insertSQL("Insert into tblCustomers VALUES('"+name+"', '"+address+"', '"+email+"', '"+phoneNumber+"', '"+activity+"')");

       



    }

}

  
  
  
  
  
