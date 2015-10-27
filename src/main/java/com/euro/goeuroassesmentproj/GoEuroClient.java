package com.euro.goeuroassesmentproj;

import com.euro.model.City;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Vaibhav Dwivedi
 */
public class GoEuroClient {

    public List<City> client(String URL) throws JsonGenerationException, JsonMappingException, IOException  {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(URL);
        Response response = webTarget.request(MediaType.APPLICATION_JSON).get();
        //String response = webTarget.request(MediaType.APPLICATION_JSON).get(String.class);
        if (response.getStatus()!= 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatusInfo());
		}

        String res = response.readEntity(String.class);
        ObjectMapper mapper = new ObjectMapper();
        List<City> cities;
        // Convert JSON string to Object
        cities = Arrays.asList(mapper.readValue(res, City[].class));
        return cities;
    }

}
