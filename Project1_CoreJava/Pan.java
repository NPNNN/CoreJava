package Project1_CoreJava;

public class Pan {
	private String pannumber;
	private String aadharnumber;
	private String bankdetails;
	private String investment;
	
	
	
	public Pan(String pannumber, String aadharnumber, String bankdetails, String investment) {
		this.pannumber = pannumber;
		this.aadharnumber = aadharnumber;
		this.bankdetails = bankdetails;
		this.investment = investment;
	}
	
	
	public String getPannumber() {
		return pannumber;
	}
	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}
	public String getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(String aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public String getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(String bankdetails) {
		this.bankdetails = bankdetails;
	}
	public String getInvestment() {
		return investment;
	}
	public void setInvestment(String investment) {
		this.investment = investment;
	}
	@Override
	public String toString() {
		return "PanNumber = " + pannumber + ", \nAadharNumber = " + aadharnumber + ", \nBankDetails = " + bankdetails
				+ ", \nInvestment = " + investment + "";
	}
	
	

}
