import java.util.Date;

public class Jurney {
	private int id;
	private String start;
	private String destination;
	private String date;
	private int time;
	private int duration;
	private int placesLeft;
	private int price;

	public Jurney(int id2, int time2, String start2, String dest, String date2) {
		setId(id2);
		start = start2;
		destination = dest;
		date = date2;
		time = time2;
	}
	
	public void displayJurney(){
		System.out.println(getStart()+" --> "+getDestination()
	      +" "+getTime()/100+":"+getTime()%100/10+getTime()%100%10+" "+getDate());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getStart() {
		return start;
	}
	
	public String getDestination() {
		return destination;
	}

	public String getDate() {
		return date;

	}

	public int getTime() {
		return time;
	}
	
	
	
	
}
