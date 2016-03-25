import java.sql.*;


public class BookingBroker {
	private JurneyList list;
	
	private Connection con;
	private Statement s;
	private ResultSet rs;
	
	public BookingBroker() {
		// TODO Auto-generated constructor stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Booking","user","password");
			//System.out.println("Connected to Booking");
		}catch(Exception ex){
			System.out.println("Error"+ex);
		}
		
		
	}
	
	public void getData(){
		
	}
	
}
