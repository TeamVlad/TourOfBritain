import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MakeBookingController {

	
	public void makeBooking(){
		try{
			int actualTime;
			Scanner scan = new Scanner(System.in);//for scanning user input
			String time,start,dest,date;//user input for departure time, start and destination cities
			Matcher matcher;//for checking if the time entered is a valid time
			Pattern pattern= Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]");//the pattern that I am going to check the time against
			Pattern datePattern = Pattern.compile("[0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]");//To check if the date entered matches the required format
			JurneyList l;
			JurneyList listStartDest = new JurneyList();
			JurneyList listDate = new JurneyList();
			JurneyList listAfterTime  = new JurneyList();//l will be the list with every jurney, l1 wil be the list with the jurneys with specific start and destination
			JurneyBroker broker = new JurneyBroker();//for getting the list of jurneys from the database
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");//for checking if the date entered is a valid date
			
			l = broker.getJurneys();//getting jurneys
			listDate = new JurneyList();
			
			//user input: start city
			System.out.print("Enter start city: ");
			start = scan.nextLine();
			
			//user input destination
			System.out.print("Enter destination city: ");
			dest = scan.nextLine();
			//getting the jurneys from the list of all jurneys that match the start and end city with input
			listStartDest = l.getJurneysByStartDest(start, dest);
			while(listStartDest.getNumberOfJurneys() == 0){//if there is nothing in the list, meaning no jurney between the two cities
				System.out.println("Error: Jurney not found. Please try again.");
				System.out.print("Enter start city: ");
				start = scan.nextLine();
				System.out.print("Enter destination city: ");
				dest = scan.nextLine();
				listStartDest = l.getJurneysByStartDest(start, dest);
			}
			while(listDate.getNumberOfJurneys()==0){
				//user input departure date
				//checking the date in two phases because the days in the mondths are not the same so can't just match them against the pattern
				System.out.print("Please enter date in format: dd-mm-yyyy : ");
				date = scan.nextLine();
				//checking if date is valid by comparing to a date pattern
				matcher = datePattern.matcher(date);
				while(!matcher.matches()){//while the date entered is not in the right format, ask for input again
					//user input departure date
					System.out.print("Error: Wrong format!\nPlease enter date in format: dd-mm-yyyy : ");
					date = scan.nextLine();
					//checking if date is valid by comparing to a date pattern
					matcher = datePattern.matcher(date);
				}
				//while the date entered is not a valid date
				while(!sdf.format(sdf.parse(date)).equals(date)){
					System.out.print("Error: Not a correct date.\nPlease enter date in format: dd-mm-yyyy : ");
					date = scan.nextLine();
					matcher = datePattern.matcher(date);
					while(!matcher.matches()){//checking if date is the right format again
						//user input departure date
						System.out.print("Error: Wrong format!\nPlease enter date in format: dd-mm-yyyy : ");
						date = scan.nextLine();
						//checking if date is valid by comparing to a date pattern
						matcher = datePattern.matcher(date);
					}
					
				}
		        	listDate = listStartDest.getJurneysByDate(date);
		        	//listDate.printList();
			}
		       
	        
	        while(listAfterTime.getNumberOfJurneys()==0){
	        
	        
				//user input departure after time
				System.out.print("Departure after: ");
				time = scan.nextLine();
				matcher = pattern.matcher(time);
				while(!matcher.matches()){
					System.out.println("Error: Time invalid. Enter time again:");
					time = scan.nextLine();
					matcher = pattern.matcher(time);
				}
				
				//System.out.println(matcher.matches());
				time = time.replace(":", "");
				//System.out.println(time);
				actualTime = Integer.parseInt(time);
				//System.out.println(actualTime);
				listAfterTime = listDate.getJurneysAfterTime(actualTime);
				//listAfterTime.printList();
				if (listAfterTime.getNumberOfJurneys()==0){
					System.out.println("No jurney found that departs after " +time);
				}	
	        }
	        System.out.println();
	        listAfterTime.printList();
	        System.out.println("Select jurney by entering number: ");
	        int b = scan.nextInt();
	        Jurney j = listAfterTime.getJurneyByIndex(b);
	        j.displayJurney();
	        
	        Booking book = BookingFactory.getBooking("NonMember");
	        
	        
		}catch(Exception ex){
			System.out.println(ex);
		}
		
	}
}
