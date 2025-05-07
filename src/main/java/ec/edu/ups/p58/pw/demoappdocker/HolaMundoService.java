package ec.edu.ups.p58.pw.demoappdocker;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hola")
public class HolaMundoService {

	@GET
	@Produces("application/json")
	public Response getSaludo() {
		
		return Response.ok("{ \"mensaje\": \"Hola mundo\" }")
                .header("Access-Control-Allow-Origin", "*")  // Permitir cualquier origen
                .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
                .header("Access-Control-Allow-Headers", "Content-Type, Authorization")
                .build();
	}
}
