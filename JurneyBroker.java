import java.sql.*;

public class JurneyBroker {
	private Connection con;
	private Statement s;
	private ResultSet rs;
	
	public JurneyBroker(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://jrbradley.co.uk:3306/BookingSystem","user","password");
			System.out.println("Connected to Booking");
			//String str = "insert into Journey_details(journey_id,date,time,end_time,price,places_left,distance) values(1,'10-04-2016',1750,2200,30,10,200);";
			//String q = "insert into Journey(start,destination) values('Coventry','Liverpool');";
			//s = con.createStatement();
			//s.execute(str);
		}catch(Exception ex){
			System.out.println("Error: "+ex);
		}
	}
	
	public JurneyList getJurneys(){
		JurneyList list = new JurneyList();
		try{
			
			String start, dest,date;
			//String query = "select * from Journey;";
			String query = "select Journey.id as 'ID',Journey.start as 'start', Journey.destination as 'destination',Journey_details.time as 'time', Journey_details.date as 'date' from Journey left join Journey_details on Journey.ID=Journey_details.journey_id;";
			//String str = "select * from Journey;";
			//String str = "select * from Journey_details";
			s = con.createStatement();
			rs = s.executeQuery(query);
			//System.out.println("Jurneys:");
			while(rs.next()){
				int id = rs.getInt("ID");
				int time = rs.getInt("time");
				start = rs.getString("start");
				dest = rs.getString("destination");
				date = rs.getString("date");
				//date = rs.get
				//System.out.println(id+" "+time+start+dest+date);
				list.addToList(new Jurney(id,time,start,dest, date));
			}
			return list;
		}catch(Exception ex){
			System.out.println(ex);
			return list;
		}
	}
	
}
