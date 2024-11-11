package Project1_CoreJava;

import java.util.HashMap;
import java.util.Map;

public class PanServices {
	private static  Map<String,Pan> panmap = new HashMap();
	
	static {
		panmap.put("CLRPN2493Q",new Pan("CLRPN2493Q", "503843620477","State Bank Of India","SBI Mutual Fund"));
		panmap.put("KLPNO6785P",new Pan("KLPNO6785P", "593893620787","Mahendra Bank","Stock Market"));
		panmap.put("HTOLG9867A",new Pan("HTOLG9867A", "663843025477","HDFC Bank","HDFC Mutual Fund"));
		panmap.put("YTREF3454R",new Pan("YTREF3454R", "403549627477","Canera Bank","Fixed Deposit in SIP"));
		
	}
	
	public Pan getPanByAadharNumber (String aadhaarNumber) {
		
		 for(Pan pan:panmap.values()) {
			 if(pan.getAadharnumber().equals(aadhaarNumber)) {
				 return pan;
			 }
			 
		 }
		 return null;
		
	}
	

}
