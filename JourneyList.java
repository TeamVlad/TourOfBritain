public class JourneyList {

    private Journey[] jList; //Creating journey list
    private int count = 0; //Creating count variable as integer

    public JourneyList(){ //Creating journey list
        jList= new Journey[100]; //Creat list with 100 size
        for (int i=0; i<jList.length;i++){ //Loop through every item in list
            jList[i]=new Journey(); //Create new empty journey at position in list
        }            
    }      

    public void newJourney(String name, String start, String destination, String startTime, String endTime, Integer distance, Integer seat) {
        //Method to create new journey
        Journey j = new Journey(); //Create new journey object j
        j.setID(count); //Set ID as count
        j.setName(name); //Set name as input name
        j.setStart(start); //Set start as input start
        j.setDestination(destination); //Set destination as input destination
        j.setStartTime(startTime); //Set start time as input start time
        j.setEndTime(endTime); //Set end time as input end time
        j.setDistance(distance); //Set distance as input distance
        j.setSeat(seat); //Set seat as input seat
        jList[count] = j; //Input object at position count in journey list
        count++; //Increment count
    }

    public void viewJourney(String I){ //Method to view specific journey
        Integer ID = Integer.parseInt(I); //Convert input string to integer
        if ((findJourney(ID)== true) && (ID != -1)){ //If journey in list and ID is not -1
            System.out.println("Journey ID: "+ jList[ID].getID()); //Display journey ID
            System.out.println("Journey Name: "+ jList[ID].getName()); //Display journey name
            System.out.println("Journey Start: "+ jList[ID].getStart()); //Display journey start
            System.out.println("Journey Destination: "+ jList[ID].getDestination()); //Display journey destination
            System.out.println("Journey Start Time: "+ jList[ID].getStartTime()); // Display journey start time
            System.out.println("Journey End Time: "+ jList[ID].getEndTime()); //Display journey end time
            System.out.println("Journey Distance: "+ jList[ID].getDistance()); //Display journey distance
            System.out.println("Journey Seats: "+ jList[ID].getSeat()); //Display journey seats
        }
        else { //If journey not in list or ID = -1
            System.out.println("Not found "); //Display error
        }
    }
    
    public boolean findJourney(int ID){ //Method to find journey in journey list
        boolean found = false; //Boolean default to false
        int i = 0; //counter for loop
          do { //Do loop
               if (jList[i].getID()== ID){ //If current list object ID matches search
                    found = true; //Change boolean to true
                }     
               i++; //Increment counter
          } while ((i < jList.length) && (!found)); //While not at end of list and not found
        return found; //Return boolean
    }
    
    public void viewJourneys(){ //Method to display all journeys
        for(int i=0 ; i < jList.length ; i++){ //For loop through all object in list
            if (jList[i].getID()!= -1){ //If current objects ID isnt -1
                System.out.print(jList[i].getID() + "\t"); //Display ID
                System.out.print(jList[i].getName() + "\t"); //Display Name
                System.out.print(jList[i].getStart() + "\t"); //Display Start
                System.out.print(jList[i].getDestination() + "\t"); //Display Destination
                System.out.print(jList[i].getStartTime() + "\t"); //Display Start Time
                System.out.print(jList[i].getEndTime() + "\t"); //Display End Time
                System.out.print(jList[i].getDistance() + "\t"); //Display Distance
                System.out.print(jList[i].getSeat() + "\t"); //Display Seat
            System.out.println(""); //Print empty line
            }
        }  
    }  


}

