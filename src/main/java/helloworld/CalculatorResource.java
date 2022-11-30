package helloworld;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;




@Path("/calculator")
public class CalculatorResource {
    @GET

    @Path("add/{base}/{addition}")

    public String add(@PathParam("base") String base,@PathParam("addition") String addition) {

        var result = Integer.parseInt(base) + Integer.parseInt(addition);

        return String.valueOf(result);

    }
}
