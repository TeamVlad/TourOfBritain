
public class BookingFactory {

	public static Booking getBooking(String bookingType){
		if(bookingType == null){
	         return null;
	      }		
	      if(bookingType.equalsIgnoreCase("Member")){
	         Booking booking = new MemberBooking();
	         booking.setType("Member");
	         return booking;

	      } else if(bookingType.equalsIgnoreCase("NonMember")){
	         Booking booking = new NonMemberBooking();
	         booking.setType("Non Member");
	         return booking;
	      }
	      return null;
	}
}
