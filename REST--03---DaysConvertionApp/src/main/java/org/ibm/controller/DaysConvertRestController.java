package org.ibm.controller;

import java.util.concurrent.TimeUnit;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("convert")
public class DaysConvertRestController {

    @POST
    public String showData(
    												@FormParam ("days")int days,
    												@FormParam ("optns")String optns
    												) {
    	String msg=null;
    	long count=0L;
    	
    	switch (optns) {
		case "HRS":
			count=TimeUnit.DAYS.toHours(days);
			break;
		case "MIN":
			count=TimeUnit.DAYS.toMinutes(days);
			break;
		case "SEC":
			count=TimeUnit.DAYS.toSeconds(days);
			break;
		case "MIL":
			count=TimeUnit.DAYS.toMillis(days);
			break;

		default: count=-1L;
			break;
		}
    	if(count>0)
    		msg="RESULT DATA IS ::   "+count;
    	else
    		msg="CALCULATION GONE WRONG";
        return msg;
    }
}
