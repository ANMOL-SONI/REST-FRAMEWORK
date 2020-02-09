package org.ibm.controller;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.ibm.model.Emp;


@Path("emp")
public class EmpRestController {
//	http://localhost:2020/REST--06---PathParam---Demo/rest/emp/input/123/ANMOL/33.33
	
	@Path("/input/{eid}/{ename}/{esal}")
    @POST
    public String showData(
    												@BeanParam Emp emp
    												) {
		System.out.println("------8 Commit------");
		
//    	        return emp.toString();
    	        return new StringBuffer()
    	        		.append("  ID is ::  ")
    	        		.append(emp.getEmpId())
    	        		.append("  NAME is ::  ")
    	        		.append(emp.getEmpName())
    	        		.append("  SAL is ::  ")
    	        		.append(emp.getEmpSal())
    	        		.toString();
    	        
    	        
    }
}
