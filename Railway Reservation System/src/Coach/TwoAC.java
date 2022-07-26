package Coach;
import Interfaces.ICoach;

public class TwoAC extends Coach implements ICoach{


	
	public TwoAC(String coachName, int coachCapacity,int coachSeatStartingNo,int coachSeatEndingNo, int seatReservationCount,
			boolean isAC) {
		setClassCoachName(coachName);
		setClassCoachType("Two-AC");
		setClassCoachCapacity(coachCapacity);
		setClassSeatReservationCount(seatReservationCount);
		setIsClassAC(isAC);
		setClassCoachSeatStartingNo(coachSeatStartingNo);
		setClassCoachSeatEndingNo(coachSeatEndingNo);
		
		
	}
	@Override
	public int getCoachSeatStartingNo() {
		return getClassCoachSeatStartingNo();
	}


	@Override
	public int getCoachSeatEndingNo() {

		return getClassCoachSeatEndingNo();
	}
	@Override
	public String getCoachName() {
		return getClassCoachName();
	}


	@Override
	public String getCoachType() {
		return getClassCoachType() ;
	}


	@Override
	public int getCoachCapacity() {
		return getClassCoachCapacity();
	}


	@Override
	public int getseatReservationCount() {
		return getClassSeatReservationCount();
	}


	@Override
	public boolean isAC() {
		return isClassAC();
	}


	@Override
	public void setCoachCapacity(int coachCapacity) {
		setClassCoachCapacity( coachCapacity);
		
	}


	@Override
	public void setseatReservationCount(int seatReservationCount) {
		setClassSeatReservationCount( seatReservationCount);
		
	}


	@Override
	public void setCoachSeatStartingNo(int coachSeatStartingNo) {
		setClassCoachSeatStartingNo( coachSeatStartingNo);
		
	}


	@Override
	public void setCoachSeatEndingNo(int coachSeatEndingNo) {
		setClassCoachSeatEndingNo( coachSeatEndingNo);
		
	}
}
