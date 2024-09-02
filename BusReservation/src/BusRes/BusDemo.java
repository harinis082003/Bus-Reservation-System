package BusRes;
import java.util.*;
public class BusDemo {
	public static void main(String[] args) {
	ArrayList<Bus> buses=new ArrayList<Bus>();
	ArrayList<Booking>bookings=new ArrayList<Booking>();
	buses.add(new Bus(1,true,2));
	buses.add(new Bus(2,false,130));
	buses.add(new Bus(3,true,140));
	for(Bus b:buses) {
		b.display();
	}
	
	int userOpt=1;
	Scanner sc=new Scanner(System.in);
	while(userOpt==1) {
		System.out.println("Enter 1 to book and 2 to exit");
		userOpt=sc.nextInt();
		if(userOpt==1) {
			Booking booking =new Booking();
			if(booking.isAvailable(buses,bookings)) {
				bookings.add(booking);
				System.out.println("Your booking is confirmed");
			}
			else {
				System.out.println("Sorry Bus is full.Try another date or bus");
			}
		}
	}

}
}