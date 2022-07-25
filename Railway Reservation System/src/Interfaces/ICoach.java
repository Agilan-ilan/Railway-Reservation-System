package Interfaces;

public interface ICoach {
	
	void setCoachName(String coachName);
	String getCoachName();
	
	void setCoachType(String coachType);
	String getCoachType();
	
	void setCoachCapacity(int coachCapacity);
	int getCoachCapacity();
	
	void setseatReservationCount(int seatReservationCount);
	int getseatReservationCount();
	
	void setIsAC(boolean isAC);
	String getIsAC();
	
}
