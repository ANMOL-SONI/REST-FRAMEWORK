package org.ibm.controller;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/paytm")
public class PaytmRestController {
	@GET
	@PermitAll
	@Path("/all")
	public String showAll() {
		return "Weclome to All";
	}

	@GET
	@DenyAll
	@Path("/none")
	public String showNone() {
		return "Not a Full impl";
	}

	@GET
	@RolesAllowed("ADMIN")
	@Path("/admin")
	public String showAdm() {
		return "Weclome to Admin";
	}

	@GET
	@RolesAllowed({ "ADMIN", "CUST" })
	@Path("/ven")
	public String showVendor() {
		return "Weclome to VENDOR";
	}
}
