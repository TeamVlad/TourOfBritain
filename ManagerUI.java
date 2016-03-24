import java.io.*;
public class ManagerUI {

    //String of menu options
    String demoOptions[] = {"Create a new Journey", "View Journey", "View all Journeys", "Exit the System"};
    //Creating controller
    JourneyController control = new JourneyController();
    //Creating menu with options
    Menu demMenu = new Menu("Menu ", demoOptions, "Enter your option: ");
    //Char to store the users choice from menu
    char demoChoice;   

    public void displayMenu() { //Method to display menu
        boolean exit = true; //Boolean for exit
        while (exit){ //While exit = true
            System.out.println("----------------------------------------------"); //Print divider for formatting
            demoChoice = demMenu.offerMenu(); //Get choice from menu
            String ID; //String for ID input
            String name; //String for name input
            String start; //String for start input
            String dest; //String for destination input
            String d; //String for distance input
            String s; //String for seats input
            String startTime; //String for start time input
            String endTime; //String for end time input
            Integer distance; //Integer for distance conversion
            Integer seat; //Integer for seat conversion
            
            BufferedReader keyboard; //Read user input
            switch (demoChoice){ //Switch case based on user input
            case 'A': //If A
                try { //Try
                    System.out.println("Enter name: "); //Ask user for name
                    keyboard = new  BufferedReader(new InputStreamReader(System.in)); //Create buffer reader
                    name = keyboard.readLine(); //Set name as input
                    System.out.println("Enter Start: "); //Ask user for start
                    start = keyboard.readLine(); //Set start as input
                    System.out.println("Enter Destination: "); //Ask user for destination
                    dest = keyboard.readLine(); //Set dest as input
                    System.out.println("Enter Start Time: "); //Ask user for start time
                    startTime = keyboard.readLine(); //Set starttime as input
                    System.out.println("Enter End Time: "); //Ask user for end time
                    endTime = keyboard.readLine(); //Set endtime as input
                    System.out.println("Enter Distance: "); //Ask user for distance
                    d = keyboard.readLine(); //Set d as input
                    System.out.println("Enter number of seats: "); //Ask user for seats
                    s = keyboard.readLine(); //Set s as input
                    
                    distance = Integer.parseInt(d); //Convert d into integer
                    seat = Integer.parseInt(s); //Convert s into integer
                    control.addJourney(name, start, dest, startTime, endTime, distance, seat); //Call add jorney method with inputs
                    reportResult("Success"); //Tell user it was a success
                }
                catch (java.io.IOException exception){} //Catch if problem            
            break;
            case 'B': //If B
                try { //Try
                    System.out.println("Enter ID:"); //Ask user for ID
                    keyboard = new  BufferedReader(new InputStreamReader(System.in)); //Create buffer reader
                    ID = keyboard.readLine(); //Set ID as input
                    control.viewJourney(ID); //Call view journey method with input
                }
                catch (java.io.IOException exception){} //Catch if problem 
            break;
            case 'C': //If C
	         control.viewAllJourneys(); //Calls view all journeys method                               
            break; 
            case 'D': //If D
	          System.out.println("You have exited the system."); //Tell user they have exited system
                    exit = false; //Change exit to false
                    System.exit(1); //Exit system
            break;
            }
        }
      }
    
    public void reportResult(String result){ //Method to print result
             System.out.println("Result:" + result);; //Print Result: and input
    }
}     
