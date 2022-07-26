package Station;
import java.util.ArrayList;

import Interfaces.ICoach;

public class Train {

	private String trainID;
	private String trainName;
	private String startLocation;
	private String endLocation;
	private ArrayList<ICoach> coaches=new ArrayList<>();

	
	public Train(String trainID, String trainName, String startLocation, String endLocation, ArrayList<ICoach> coaches) {
		super();
		this.trainID = trainID;
		this.trainName = trainName;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.coaches = coaches;
	}
	
	


	public ArrayList<ICoach> getCoaches() {
		return coaches;
	}
	public void setCoaches(ArrayList<ICoach> coaches) {
		this.coaches = coaches;
	}
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
	

	
}
