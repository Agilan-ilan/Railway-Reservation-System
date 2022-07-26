package Interfaces;

public interface ICoach {
	

	String getCoachName();
	

	String getCoachType();
	

	int getCoachCapacity();
	
	int getseatReservationCount();
	
	int getCoachSeatStartingNo();
	
	int getCoachSeatEndingNo();
	
	void setCoachCapacity(int coachCapacity);
	
	void setseatReservationCount(int seatReservationCount);
	
	void setCoachSeatStartingNo(int coachSeatStartingNo);
	
	void setCoachSeatEndingNo(int coachSeatEndingNo);
	
	boolean isAC();
	
}
