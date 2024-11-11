package Project1_CoreJava;


public class Aadhar {

	private String aadharnumber;
	private String name;
	private String gender;
	private String fathername;
	private String dateofbirth;
	private String address;
	
	
	public Aadhar(String aadharnumber, String name, String gender, String fathername, String dateofbirth,
			String address) {
		
		this.aadharnumber = aadharnumber;
		this.name = name;
	    this.gender = gender;
		this.fathername = fathername;
		this.dateofbirth = dateofbirth;
		this.address = address;
	}
	
	
	public String getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(String aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AadharNumber = " + aadharnumber + ", \nName = " + name + ", \nGender = " + gender + ", \nFathername = "
				+ fathername + ", \nDate_of_birth = " + dateofbirth + ", \nAddress = " + address +"\n";
	}
	
	
	
	

}
