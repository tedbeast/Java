package Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.Service;

import Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.DAO.FlightDAO;
import Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.Model.Flight;

import java.util.List;

/**
 * The purpose of a Service class is to contain "business logic" that sits between the web layer (controller) and
 * persistence layer (DAO). That means that the Service class performs tasks that aren't done through the web or
 * SQL: programming tasks like checking that the input is valid, conducting additional security checks, or saving the
 * actions undertaken by the API to a logging file.
 *
 * It's perfectly normal to have Service methods that only contain a single line that calls a DAO method. An
 * application that follows best practices will often have unnecessary code, but this makes the code more
 * readable and maintainable in the long run!
 */
public class FlightService {
    FlightDAO flightDAO;

    /**
     * No-args constructor for a flightService instantiates a plain flightDAO.
     * There is no need to modify this constructor.
     */
    public FlightService(){
        flightDAO = new FlightDAO();
    }

    /**
     * Constructor for a flightService when a flightDAO is provided.
     * This is used for when a mock flightDAO that exhibits mock behavior is used in the test cases.
     * This would allow the testing of FlightService independently of FlightDAO.
     * There is no need to modify this constructor.
     * @param flightDAO
     */
    public FlightService(FlightDAO flightDAO){
        this.flightDAO = flightDAO;
    }

    /**
     * TODO: Use the FlightDAO to add a new flight to the database.
     * You should check that the flight ID is not already taken by another row, as this would violate the primary
     * key constraint. To do this, you could use an if statement that checks if flightDAO.getFlightById returns null
     * for the flight's ID, as this would indicate that the flight id is already in use.
     *
     * @param flight an object representing a Flight.
     * @return the newly added flight if the add operation was successful. Return null if the add operation is
     *         impossible (such as when the flight ID is already contained in the database. We do this to inform
     *         our application about successful/unsuccessful operations.
     */
    public Flight addFlight(Flight flight){
        return null;
    }

    /**
     * TODO: Use the FlightDAO to update an existing flight from the database.
     * You should first check that the flight ID already exists. To do this, you could use an if statement that checks
     * if flightDAO.getFlightById returns null for the flight's ID, as this would indicate that the flight id is
     * already in use.
     *
     * @param flight_id the ID of the flight to be modified.
     * @param flight an object containing all data that should replace the values contained by the existing flight_id.
     * @return the newly updated flight if the update operation was successful. Return null if the update operation was
     *         unsuccessful. We do this to inform our application about successful/unsuccessful operations. (eg, the
     *         user should have some insight if they attempted to edit a nonexistent flight.)
     */
    public Flight updateFlight(int flight_id, Flight flight){
        return null;
    }

    /**
     * TODO: Use the FlightDAO to retrieve a List containing all flights.
     * You could use the flightDAO.getAllFlights method.
     *
     * @return all flights in the database.
     */
    public List<Flight> getAllFlights() {
        return null;
    }

    /**
     * TODO: Use the FlightDAO to retrieve a List containing all flights departing from a certain city and arriving at
     * some other city. You could use the flightDAO.getAllFlightsFromCityToCity method.
     *
     * @param departure_city the departing city of the flight.
     * @param arrival_city the arriving city of the flight.
     * @return all flights departing from departure_city and arriving at arrival_city.
     */
    public List<Flight> getAllFlightsFromCityToCity(String departure_city, String arrival_city) {
        return null;
    }
}
