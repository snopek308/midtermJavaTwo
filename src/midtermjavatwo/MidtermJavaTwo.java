
package midtermjavatwo;

import java.util.Scanner;

/**
 *
 * @author Abby Snopek and Sam Tom
 */
public class MidtermJavaTwo {

    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    Boolean endProgram = true;
    String usersChoice;
    
    //setting up new garage to park cars in
    Garage carPort = new Garage();
    
    
    do{
        getMenuOne();
        usersChoice = keyboard.nextLine();
        
        switch(usersChoice) {
            case "1": getMenuTwo();
            String choice2 = keyboard.nextLine();
                switch(choice2) {
                    
                    case "1": 
                    {
                        Car c = new Car();
                        carPort.addCar(c);
                        //Give User Car ID Number
                    break;
                    }
                    case "2": getMenuOne();
                    break;
                }
            break;
                
            case "2": getMenuThree();
            String choice3 = keyboard.nextLine();
                switch(choice3) {
                    
                    //Check out car
                    case "1": checkOutCar();
                    String cTicketNumber = keyboard.nextLine();
                    carPort.leaveCar(Integer.parseInt(cTicketNumber));
                    
                    break;
                        
                    case "2": carPort.lostTicket();
                    break;
                        
                        
                    case "3": getMenuOne();
                    break;
                }
            break;
                //Close Garage Program
            
            case "3": carPort.displayAll();
            
            //close garage
            case "4": exitProgram();
            break;
                
            
            case "5": exitProgram();
            break;
                
            default: getMenuOne();
            break;
        }
        
    }while (endProgram);
        
    
    
    }
    
    
    public static void getMenuOne()
    {
        System.out.println();
        System.out.println();
        System.out.println("Best Value Parking Garage");
        System.out.println("========================");
        System.out.println();
        System.out.println("Choose your option below: ");
        System.out.println("1 - Checking into the garage");
        System.out.println("2 - Checking out of the garage");
        System.out.println("3 - Check cars in the garage");
        System.out.println("4 - Close Garage");
        System.out.println("5 - Exit Program");
    }
    
    public static void exitProgram()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Are you sure you would like to exit the program? Y/N: ");
        String exitChoice = keyboard.nextLine();
        
        switch(exitChoice.toUpperCase())
        {
            case "Y": System.out.println("Thank you for using Best Value Parking Garage");
            
            break;
                
            case "N": getMenuOne();
        }
    }
    
    public static void getMenuTwo()
    {
        System.out.println();
        System.out.println();
        System.out.println("Best Value Parking Garage");
        System.out.println("========================");
        System.out.println();
        System.out.println("Choose your option below: ");
        System.out.println("1 - Check in Car");
        System.out.println("2 - Return to Main Menu");
    }
    
    public static void getMenuThree()
    {
        System.out.println();
        System.out.println();
        System.out.println("Best Value Parking Garage");
        System.out.println("========================");
        System.out.println();
        System.out.println("Choose your option below: ");
        System.out.println("1 - Check out Car");
        System.out.println("2 - Lost Ticket");
        System.out.println("3 - Return to Main Menu");
    }
    
    public static void checkOutCar()
    {
        System.out.println();
        System.out.println("What was your Car's ticket number? ");
        
    }
    
}
//