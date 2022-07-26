package Passenger;
import java.util.Date;

import Station.Train;

public class Ticket {
	
	private String pnrNumber;
	private Train train;
	private String ticketStatus;
	private String dateOfJourney;
	private String timeOfBooking;
	
	
	
	public Ticket(String pnrNumber, Train train, String ticketStatus, String dateOfJourney, String timeOfBooking) {
		super();
		this.pnrNumber = pnrNumber;
		this.train = train;
		this.ticketStatus = ticketStatus;
		this.dateOfJourney = dateOfJourney;
		this.timeOfBooking = timeOfBooking;
	}
	
	
	public Train getTrain() {
		return train;
	}


	public void setTrain(Train train) {
		this.train = train;
	}


	public String getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public String getTimeOfBooking() {
		return timeOfBooking;
	}
	public void setTimeOfBooking(String timeOfBooking) {
		this.timeOfBooking = timeOfBooking;
	}

	
	
}
