package sn.edu.sid.bambey.jee;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("hello")
public class BambeyResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public String hello(@QueryParam("name") String name) {
		if ((name == null) || name.trim().isEmpty())  {
			name = "world";
		}

		return new String(name);
	}
}
