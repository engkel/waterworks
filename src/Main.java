import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userinput= new Scanner(System.in);

        System.out.println("System 1: Insert Customer");
        System.out.println("System 2: Payments check");
        System.out.println("System 3: Meters register");
        System.out.println("System 4: Insert Property");
        System.out.println("System 5: Insert invoices");
        System.out.println("System 6: Daily Totals");
        System.out.println("System 7: Statistic Reader");
        System.out.println("");

        System.out.println("Please choose a system number:");
        int ChooseSystemNumber= userinput.nextInt();


        switch (ChooseSystemNumber){
            case 1:
                Customers myObj = new Customers();
                System.out.println(myObj);
                break;
            case 2:
                Payments myObj1 = new Payments();
                System.out.println(myObj1);
                break;
            case 3:
                Meters myObj2 = new Meters();
                System.out.println(myObj2);
                break;
            case 4:
                Property myObj3 = new Property();
                System.out.println(myObj3);
                break;
            case 5:
                Invoice myObj4 = new Invoice();
                System.out.println(myObj4);
                break;
            case 6:
                DailyTotals myObj5 = new DailyTotals();
                System.out.println(myObj5);
                break;
            case 7:
                StatisticReader myObj6 = new StatisticReader();
                System.out.println(myObj6);
                break;
        }
    }
}