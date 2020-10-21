import java.util.Scanner;
public class Customers {


    /**
     *
     * @author Andrej :0
     */

    public static void main (String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Please insert the customers name: ");
        String name = input.nextLine();
        System.out.println("Please insert the customers address: ");
        String address = input.nextLine();
        System.out.println("Please insert customers email: ");
        String email = input.nextLine();
        System.out.println("Please input customers phone number: ");
        String phoneNumber= input.nextLine();
        System.out.println("Please input customers status(Active or inactive): ");
        String activity = input.nextLine();

        DB.insertSQL("Insert into tblCustomers Values('"+name+"','"+address+"','"+email+"','"+phoneNumber+"','"+activity+"')");





    }

}






