package org.ibm;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.ibm.filter.SecureFilter;
@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{
	
	public AppConfig() {
		packages("org.ibm.controller");
		register(SecureFilter.class);
	}

}
