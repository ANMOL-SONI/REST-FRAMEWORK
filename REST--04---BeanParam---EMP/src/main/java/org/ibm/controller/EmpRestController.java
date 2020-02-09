package org.ibm.controller;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.ibm.model.Emp;

@Path("emp")
public class EmpRestController {

    @POST
    public String showData(
    												@BeanParam Emp emp
    												) {
    	
    	        return emp.toString();
    	        
    }
}
