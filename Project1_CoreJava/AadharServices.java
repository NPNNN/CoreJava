package Project1_CoreJava;

import java.util.HashMap;
import java.util.Map;

public class AadharServices {
	
	private static Map<String,Aadhar> aadharMap =new HashMap();
	static {
		aadharMap.put("503843620477", new Aadhar("503843620477","Narendar Kumar Nishad","Male",
				"Ram Saware Nishad","18/07/2002","Dadar Mumbai"));
		
		aadharMap.put("593893620787", new Aadhar("593893620787","Suhesh Rajendra Pawar","Male",
				"Rajendra","20/12/2001","Thane Mumbai"));
		
		aadharMap.put("663843025477", new Aadhar("663843025477","Shreyash Arvind Warang","Male",
				"Arvind","06/078/20021","Kankawli Rantnagiri"));
		
		aadharMap.put("403549627477", new Aadhar("403549627477","Kajal","Male",
				"Sanjay","28/08/2003","Noida Uttrapradesh"));
		
	}
	public Aadhar getAadharByNumber(String aadharNumber) {
		return aadharMap.get(aadharNumber);
	}

}
