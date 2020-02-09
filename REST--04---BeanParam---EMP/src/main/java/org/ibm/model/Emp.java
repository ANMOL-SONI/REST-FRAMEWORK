package org.ibm.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;

import lombok.Data;

@Data
public class Emp {
	
				@DefaultValue("77")
				@QueryParam("eid")
				private Integer empId;
				
				@DefaultValue("JOHN")
				@HeaderParam("ename")
				private String empName;
				
				@DefaultValue("77.77")
				@FormParam("esal")
				private Double empSal;

}
