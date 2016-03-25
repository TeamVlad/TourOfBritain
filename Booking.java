
public abstract class Booking {
	String type, start,destination;
	int userId, serviceId, jurneyId, price;

	abstract void display();
	
	public void setType(String s){
		type = s;
	}
	
	public void setStart(String s){
		start = s;
	}
	public void setDestination(String s){
		destination = s;
	}
	public void setUserId(int id){
		userId = id;
	}
	public void setServiceId(int id){
		serviceId = id;
	}
	public void setJurneyId(int id){
		jurneyId = id;
	}
	public void setPrice(int p){
		price = p;
	}
}
