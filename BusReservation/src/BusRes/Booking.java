package BusRes;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the passenger name:");
		passengerName=sc.next();
		System.out.println("Enter the bus no");
		busNo=sc.nextInt();
		System.out.println("Enter the date");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking> bookings) {
	int capacity=0;
	for(Bus bus:buses) {
		if(bus.getbusNo()==busNo) {
			capacity=bus.getCapacity();
		}
	}
int booked=0;
for(Booking b:bookings) {
	if(b.busNo==busNo && b.date.equals(date)) {
		booked++;
	}
}
return booked<capacity?true:false;

	}

}
