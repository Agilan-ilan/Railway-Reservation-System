
public class Address {
	private int plotNo;
	private String streetName;
	private String area;
	private String pinCode;
	private String state;
	private String city;
	
	
	
	public Address(int plotNo, String streetName, String area, String pinCode, String state, String nationality) {
		super();
		this.plotNo = plotNo;
		this.streetName = streetName;
		this.area = area;
		this.pinCode = pinCode;
		this.state = state;
		this.city = nationality;
	}
	
	
	public int getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNationality() {
		return city;
	}
	public void setNationality(String nationality) {
		this.city = nationality;
	}
	
	
}
