package Coach;

public class Coach {
	
	private String coachName;
	private String coachType;
	private int coachCapacity;
	private int coachSeatStartingNo;
	private int coachSeatEndingNo;
	private int seatReservationCount;
	private boolean isAC;
	
	public void setCoach(String coachName, int coachCapacity,int coachSeatStartingNo,int coachSeatEndingNo, int seatReservationCount,
			boolean isAC) {
		setClassCoachName(coachName);
		setClassCoachCapacity(coachCapacity);
		setClassSeatReservationCount(seatReservationCount);
		setClassCoachSeatStartingNo(coachSeatStartingNo);
		setClassCoachSeatEndingNo(coachSeatEndingNo);
		
		setIsClassAC(isAC);
	}
		
		
	public int getClassCoachSeatStartingNo() {
		return coachSeatStartingNo;
	}
	public void setClassCoachSeatStartingNo(int coachSeatStartingNo) {
		this.coachSeatStartingNo = coachSeatStartingNo;
	}
	public int getClassCoachSeatEndingNo() {
		return coachSeatEndingNo;
	}
	public void setClassCoachSeatEndingNo(int coachSeatEndingNo) {
		this.coachSeatEndingNo = coachSeatEndingNo;
	}
	
	public String getClassCoachName() {
		return coachName;
	}
	public void setClassCoachName(String coachName) {
		this.coachName = coachName;
	}
	public String getClassCoachType() {
		return coachType;
	}
	public void setClassCoachType(String coachType) {
		this.coachType = coachType;
	}
	public int getClassCoachCapacity() {
		return coachCapacity;
	}
	public void setClassCoachCapacity(int coachCapacity) {
		this.coachCapacity = coachCapacity;
	}
	public int getClassSeatReservationCount() {
		return seatReservationCount;
	}
	public void setClassSeatReservationCount(int seatReservationCount) {
		this.seatReservationCount = seatReservationCount;
	}
	public boolean isClassAC() {
		return isAC;
	}
	public void setIsClassAC(boolean isAC) {
		this.isAC = isAC;
	}
	
	
}
