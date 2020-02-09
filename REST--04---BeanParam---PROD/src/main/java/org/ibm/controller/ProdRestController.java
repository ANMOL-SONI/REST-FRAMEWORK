package org.ibm.controller;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.ibm.model.Prod;

@Path("prod")
public class ProdRestController {

    @POST
    public String showData(
    												@BeanParam Prod prod
    												) {
    			Double cost=prod.getProdCost();
    			Double disc=cost*2/100.0;
    			Double gst=cost*18/100.0;
    			
    			prod.setProdDisc(disc);
    			prod.setProdGst(gst);
    			
    			System.out.println(" The COST is  :: "+cost);
    			System.out.println(" The 2 % DISCOUNT is  :: "+disc);
    			System.out.println(" The 18 % GST  is  :: "+gst);
    	
    	        return prod.toString();
    	        
    }
}
