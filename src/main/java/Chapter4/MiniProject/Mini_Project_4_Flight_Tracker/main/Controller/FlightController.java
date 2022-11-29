package Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.Controller;

import Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.Model.Flight;
import Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.Service.FlightService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import io.javalin.http.Context;

/**
 * There is no need to modify anything in this class. This class will create a Javalin API with four endpoints when the
 * startAPI method is called.
 *
 *  You can interact with the Javalin controller by
 *  a) for GET requests, navigating to the endpoint in your web browser (eg localhost:8080/flights)
 *  b) for GET requests, using the CURL command in your terminal (eg curl localhost:8080/flights). you can use post,
 *     but it's difficult to format within CURL.
 *  c) using the desktop version of Postman for any type of request. Be sure to set the request type to the intended
 *     one (GET/POST/PUT/DELETE), and to properly format the body (setting the body content type to raw JSON).
 *
 *  The four included endpoints:
 *
 *  GET localhost:8080/flights : retrieve all flights
 *
 *  GET localhost:8080/flights/departing/{departure_city}/arriving/{arrival_city} : retrieve all flights departing
 *      from some city and arriving at some other city. For instance, writing Tampa as the departure city and Dallas
 *      as the arrival city will retrieve flights from Tampa to Dallas. This URL would be written as
 *      localhost/8080/flights/departing/tampa/arriving/dallas.
 *
 *  POST localhost:8080/flights : post a new flight. a new flight should be contained in the body of the request as a
 *      JSON representation. example:
 *          {
 *              "flight_id":1234,
 *              "departure_city":"Reston",
 *              "arrival_city":"Tampa"
 *          }
 *
 *  PUT localhost:8080/flights/{flight_id} : Replace the data identified by flight_id with a new representation which
 *      is in the request body. For instance, sending a request to
 *      localhost:8080/flights/1234 with the body
 *          {
 *              "departure_city":"Reston",
 *              "arrival_city":"Morgantown"
 *          }
 *      Will replace the values for departure_city and arrival_city for the resource identified by
 *      flight_id 1234.
 *
 */
public class FlightController {
    FlightService flightService;
    public FlightController(){
        flightService = new FlightService();
    }
    /**
     * Method defines the structure of the Javalin Flights API. Javalin methods will use handler methods
     * to manipulate the Context object, which is a special object provided by Javalin which contains information about
     * HTTP requests and can generate responses.
     */
    public void startAPI(){
        Javalin app = Javalin.create();
        app.post("/flights", this::postFlightHandler);
        app.put("/flights/{flight_id}", this::updateFlightHandler);
        app.get("/flights", this::getAllFlightsHandler);
        app.get("/flights/departing/{departure_city}/arriving/{arrival_city}",
                this::getAllFlightsDepartingFromCityArrivingToCityHandler);
        app.start(8080);
    }
    /**
     * handler to post a new flight.
     * The Jackson ObjectMapper will automatically convert the JSON of the POST request into a Flight object.
     * If flightService returns a null flight (meaning posting a flight was unsuccessful, the API will return a 400
     * message (client error).
     * @param ctx the context object handles information HTTP requests and generates responses within Javalin. It will
     *            be available to this method automatically thanks to the app.post method.
     * @throws JsonProcessingException will be thrown if there is an issue converting JSON into an object.
     */
    private void postFlightHandler(Context ctx) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Flight flight = mapper.readValue(ctx.body(), Flight.class);
        if(flightService.addFlight(flight)==null){
            ctx.status(400);
        }else{
            ctx.json(flight);
        }
    }

    /**
     * handler to update a flight.
     * The Jackson ObjectMapper will automatically convert the JSON of the POST request into a Flight object.
     * to conform to RESTful standards, the flight that is being updated is identified from the path parameter,
     * but the information required to update a flight is retrieved from the request body.
     * If flightService returns a null flight (meaning updating a flight was unsuccessful), the API will return a 400
     * message (client error).
     * @param ctx the context object handles information HTTP requests and generates responses within Javalin. It will
     *            be available to this method automatically thanks to the app.put method.
     * @throws JsonProcessingException will be thrown if there is an issue converting JSON into an object.
     */
    private void updateFlightHandler(Context ctx) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Flight flight = mapper.readValue(ctx.body(), Flight.class);
        int flight_id = Integer.parseInt(ctx.pathParam("flight_id"));
        if(flightService.updateFlight(flight_id, flight) == null){
            ctx.status(400);
        }else{
            ctx.json(flight);
        }

    }

    /**
     * handler to retrieve all flights.
     * @param ctx the context object handles information HTTP requests and generates responses within Javalin. It will
     *            be available to this method automatically thanks to the app.put method.
     */
    private void getAllFlightsHandler(Context ctx){
        ctx.json(flightService.getAllFlights());
    }
    /**
     * handler to retrieve all flights departing from a particular city and arriving at another city.
     * both cities are retrieved from the path.
     * @param ctx the context object handles information HTTP requests and generates responses within Javalin. It will
     *            be available to this method automatically thanks to the app.put method.
     */
    private void getAllFlightsDepartingFromCityArrivingToCityHandler(Context ctx) {
        ctx.json(flightService.getAllFlightsFromCityToCity(ctx.pathParam("departure_city"),
                ctx.pathParam("arrival_city")));
    }
}
