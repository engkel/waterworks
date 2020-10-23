import java.util.Scanner;
public class Customers {


    /**
     *
     * @author Andrej David Ibraheem
     * Class customers is used to get information about the customer, mainly used in order to create a new client
     * The program asks the user to input name, address, email, phone number, and if the customer is active/inactive
     * The activity is used in order to determine if the customers account is still valid
     * If the customer is inactive it means that the customer has moved or has recieved 3 reminders about the bill 
     */

    public Customers (){
        Scanner input= new Scanner(System.in);
        
        //Getting inputs from the user
        
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
        
        //Inserting the given values into our database
        
        DB.insertSQL("Insert into tblCustomers Values('"+name+"','"+address+"','"+email+"','"+phoneNumber+"','"+activity+"')");



    }

    public static void main(String[] args) {
        Customers myObj= new Customers();
        System.out.println(myObj);
    }

}






