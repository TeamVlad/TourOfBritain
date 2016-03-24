public class JourneyFactory {

    public Journey inputType(String theType){ //Method to define journey type
      //Uses inputType method to get object of type
      if(theType == null){ //If null
         return null; //Return null
      }		
      if(theType.equalsIgnoreCase("Bus")){ //If type is bus
         BusJourney j = new BusJourney(); //Create bus journey object
         j.setBus("60 Seater"); //Set bus to 60 seater
         j.setDriver("Bill"); //Set driver to Bill
         return j; //Return bus journey object
      }
      return null; //Return null
    }
}