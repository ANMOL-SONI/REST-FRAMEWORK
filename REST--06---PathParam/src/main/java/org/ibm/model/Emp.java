package org.ibm.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.PathParam;

import lombok.Data;

@Data
public class Emp {
	
				@DefaultValue("77")
				@PathParam("eid")
				private Integer empId;
				
				@DefaultValue("JOHN")
				@PathParam("ename")
				private String empName;
				
				@DefaultValue("77.77")
				@PathParam("esal")
				private Double empSal;

}
