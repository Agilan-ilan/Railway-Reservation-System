import Interfaces.ICoach;

public class SleeperCoach extends Coach implements ICoach{

	@Override
	public void setCoachName(String coachName) {
		setCoachName(coachName);
		
	}

	@Override
	public String getCoachName() {
		return getCoachName();
	}

	@Override
	public void setCoachType(String coachType) {
		setCoachType(coachType);
		
	}

	@Override
	public String getCoachType() {
		return getCoachType() ;
	}

	@Override
	public void setCoachCapacity(int coachCapacity) {
		setCoachCapacity(coachCapacity);
		
	}

	@Override
	public int getCoachCapacity() {
		return getCoachCapacity();
	}

	@Override
	public void setseatReservationCount(int seatReservationCount) {
		setseatReservationCount(seatReservationCount);
		
	}

	@Override
	public int getseatReservationCount() {
		return getseatReservationCount();
	}

	@Override
	public void setIsAC(boolean isAC) {
		setIsAC(isAC);
		
	}

	@Override
	public String getIsAC() {

		return getIsAC();
	}

}
