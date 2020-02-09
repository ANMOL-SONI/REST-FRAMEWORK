package org.ibm.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;

import lombok.Data;

@Data
public class Prod {
	
				@DefaultValue("88")
				@QueryParam("pid")
				private Integer prodId;
				
				@DefaultValue("JOHN")
				@HeaderParam("pname")
				private String prodName;
				
				@DefaultValue("77.77")
				@FormParam("pcost")
				private Double prodCost;
				
				private Double prodDisc;
				
				private Double prodGst;
				

}
