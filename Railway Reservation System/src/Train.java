import java.util.ArrayList;

public class Train {

	private String trainID;
	private String trainName;
	private String startLocation;
	private String endLocation;
	private ArrayList<TimeSchedule> timeschedule=new ArrayList<>();

	
	public String getTrainID() {
		return trainID;
	}
	public void setTrainID(String trainID) {
		this.trainID = trainID;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	
	
	protected class TimeSchedule{
		
		private String stationName;
		private String arrivalTime;
		private String depatureTime;
		private String stoppingTime;
		private String distancetTravelled;
		
		
		public TimeSchedule(String stationName, String arrivalTime, String depatureTime, String stoppingTime,
				String distancetTravelled) {
			super();
			this.stationName = stationName;
			this.arrivalTime = arrivalTime;
			this.depatureTime = depatureTime;
			this.stoppingTime = stoppingTime;
			this.distancetTravelled = distancetTravelled;
		}
		
		
		
	}
	
}
