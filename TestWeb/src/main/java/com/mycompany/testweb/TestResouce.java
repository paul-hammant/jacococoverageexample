package com.mycompany.testweb;

import com.mycompany.testapi.TestService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Gert
 */
@Path("/payment")
@Component
public class TestResouce {

    @Autowired
    private TestService service;

    @GET

    public Response savePayment() {

        return Response.status(200).entity(service.getString()).build();

    }

}
