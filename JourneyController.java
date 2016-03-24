public class JourneyController {

    private JourneyList list = new JourneyList(); //Creating journeylist

    //Method to create Journey
    public void addJourney(String name, String start, String destination, String startTime, String endTime, Integer distance, Integer seat) {
        list.newJourney(name, start, destination, startTime, endTime, distance, seat);
        //Calls newJourney method with input variables
    }

    public void viewJourney(String ID) { //Method to view specific journey
        list.viewJourney(ID); //Calls viewJourney method with input variable
    }
    public void viewAllJourneys() { //Method to view all journeys
        list.viewJourneys(); //Calls viewJourneys method
    }

}