package org.ibm.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("convert")
public class GetTableRestController {


    @POST
    public String showData(
    												@FormParam ("box")int box
    												) {
    	
    	System.out.println("---------Now I just Update the File And Saved it-------");
    	
    	String msg=null;
    	
    	int a=Math.round(box/4);
    	int b=Math.round((box/4)+1);
    	
    	if(box%4==0)
    		msg="TOTAL  TABLE  REQUIRED  IS ::   "+a;
    	else
    		msg="TOTAL  TABLE  REQUIRED  IS ::  "+b;
        return msg;
    }
}
												