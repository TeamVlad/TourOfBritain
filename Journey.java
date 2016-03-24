public class Journey{

    private int id = -1; //Initilise id with -1 value
    private String name; //Create name variable as string
    private String start; //Create start variable as string
    private String destination; //Create destination variable as string
    private String startTime; //Create startTime variable as string
    private String endTime; //Create endTime variable as string
    private Integer distance; //Create distance variable as integer
    private Integer seat; //Create seat variable as integer

    public int getID() { //Method used to return ID
        return id; //Returns ID
    }

    public String getName() { //Method used to return Name
        return name; //Returns name
    }

    public String getStart() { //Method used to return Start
        return start; //Returns start
    }

    public String getDestination() { //Method used to return Destination
        return destination; //Returns destination
    }

    public String getStartTime() { //Method used to return StartTime
        return startTime; //Returns startTime
    }

    public String getEndTime() { //Method used to return EndTime
        return endTime; //Returns endTime
    }

    public Integer getDistance() { //Method used to return Distance
        return distance; //Returns distance
    }

    public Integer getSeat() { //Method used to return Seat
        return seat; //Returns seat
    }

    public void setID(int aID) { //Method used to set ID
        id = aID; //Sets ID to input
    }

    public void setName(String aName) { //Method used to set Name
        name = aName; //Sets Name to input
    }

    public void setStart(String aStart) { //Method used to set Start
        start = aStart; //Sets Start to input
    }

    public void setDestination(String aDest) { //Method used to set Destination
        destination = aDest; //Sets Destination to input
    }

    public void setStartTime(String aStartT) { //Method used to set StartTime
        startTime = aStartT; //Sets Start time to input
    }

    public void setEndTime(String aEndT) { //Method used to set EndTime
        endTime = aEndT; //Sets End time to input
    }

    public void setDistance(Integer aDist) { //Method used to set Distance
        distance = aDist; //Sets distance to input
    }

    public void setSeat(Integer aSeat) { //Method used to set Seat
        seat = aSeat; //Sets seat to input
    }
}
