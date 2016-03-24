public class BusJourney extends Journey { //Extend from Journey Class for inheritance

    public String bus; //Create bus variable as string
    public String driver; //Create driver variable as string

    public String getBus() { //Method used to return Bus
        return bus; //Returns bus
    }

    public void setBus(String aBus) { //Method used to set Bus
        bus = aBus; //Sets bus to input
    }

    public String getDriver() { //Method used to return Driver
        return driver; //Returns driver
    }

    public void setDriver(String aDriver) { //Method used to set Driver
        driver = aDriver; //Sets driver to input
    }
}
