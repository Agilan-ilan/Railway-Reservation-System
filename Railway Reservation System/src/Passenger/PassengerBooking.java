package Passenger;

import java.util.ArrayList;
import java.util.Date;

public class PassengerBooking {
	
	private String BookingId;
	ArrayList<TrainTicket> traintickets;
	String bookingDate;
	
	public PassengerBooking(String bookingId, ArrayList<TrainTicket> traintickets, String bookingDate) {
		super();
		BookingId = bookingId;
		this.traintickets = traintickets;
		this.bookingDate = bookingDate;
	}

	public String getBookingId() {
		return BookingId;
	}

	public void setBookingId(String bookingId) {
		BookingId = bookingId;
	}

	public ArrayList<TrainTicket> getTraintickets() {
		return traintickets;
	}

	public void setTraintickets(ArrayList<TrainTicket> traintickets) {
		this.traintickets = traintickets;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
	
	
}
