package Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.test.DAO;

import Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.Application;
import Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.DAO.FlightDAO;
import Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.Model.Flight;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * This class tests using the dummy data inserted as part of the Application.databaseSetup() method.
 * It contains the following records:
 *      (9009, 'tampa', 'dallas'),
 *      (9010, 'tampa', 'reston'),
 *      (9011, 'reston', 'morgantown'),
 *      (9012, 'morgantown', 'dallas'),
 *      (9013, 'tampa', 'dallas'),
 *      (9014, 'dallas', 'tampa')
 */
public class FlightDAOTest {
    public FlightDAO flightDAO;

    /**
     * set up a flightDAO and recreate the database tables and mock data.
     */
    @Before
    public void setUp(){
        Application.databaseSetup();
        flightDAO = new FlightDAO();
    }

    /**
     * The flightDAO should retrieve all flights when getAllFlights is called.
     */
    @Test
    public void getAllFlightsTest1(){
        List<Flight> allFlights = flightDAO.getAllFlights();
        Flight f9009 = new Flight(9009, "tampa", "dallas");
        Flight f9010 = new Flight(9010, "tampa", "reston");
        Flight f9011 = new Flight(9011, "reston", "morgantown");
        Flight f9012 = new Flight(9012, "morgantown", "dallas");
        Flight f9013 = new Flight(9013, "tampa", "dallas");
        Flight f9014 = new Flight(9014, "dallas", "tampa");
        Assert.assertTrue(allFlights.contains(f9009));
        Assert.assertTrue(allFlights.contains(f9010));
        Assert.assertTrue(allFlights.contains(f9011));
        Assert.assertTrue(allFlights.contains(f9012));
        Assert.assertTrue(allFlights.contains(f9013));
        Assert.assertTrue(allFlights.contains(f9014));
    }

    /**
     * The flightDAO should retrieve a flight with a specific ID when getFlightById is called.
     */
    @Test
    public void getFlightByIDTest1(){
        Flight flight = flightDAO.getFlightById(9014);
        Flight f9014 = new Flight(9014, "dallas", "tampa");
        Assert.assertTrue(flight.equals(f9014));
    }
    /**
     * The flightDAO should retrieve a flight with a specific ID when getFlightById is called.
     */
    @Test
    public void getFlightByIDTest2(){
        Flight flight = flightDAO.getFlightById(9012);
        Flight f9012 = new Flight(9012, "morgantown", "dallas");
        Assert.assertTrue(flight.equals(f9012));
    }

    /**
     * When there is one flight between two cities, getAllFlightsFromCityToCity should return a list containing
     * that flight. It should not contain other flights.
     */
    @Test
    public void getFlightsFromCityToCityTest1(){
        List<Flight> flights = flightDAO.getAllFlightsFromCityToCity("reston", "morgantown");
        Flight f9009 = new Flight(9009, "tampa", "dallas");
        Flight f9011 = new Flight(9011, "reston", "morgantown");
        Flight f9013 = new Flight(9013, "tampa", "dallas");
        Assert.assertFalse(flights.contains(f9009));
        Assert.assertTrue(flights.contains(f9011));
        Assert.assertFalse(flights.contains(f9013));
    }

    /**
     * When there are multiple flights between two cities, getAllFlightsFromCityToCity should return a list containing
     * both flights. It should not contain other flights.
     */
    @Test
    public void getFlightsFromCityToCityTest2(){
        List<Flight> flights = flightDAO.getAllFlightsFromCityToCity("tampa", "dallas");
        Flight f9009 = new Flight(9009, "tampa", "dallas");
        Flight f9011 = new Flight(9011, "reston", "morgantown");
        Flight f9013 = new Flight(9013, "tampa", "dallas");
        Assert.assertTrue(flights.contains(f9009));
        Assert.assertFalse(flights.contains(f9011));
        Assert.assertTrue(flights.contains(f9013));
    }

    /**
     * When a flight is added via the flightDAO, it should be retrievable by retrieving the flight by ID.
     */
    @Test
    public void addFlightCheckByIdTest1(){
        Flight f9800 = new Flight(9800, "tampa", "morgantown");
        flightDAO.insertFlight(f9800);
        Flight shouldBef9800;
        shouldBef9800 = flightDAO.getFlightById(9800);
        Assert.assertEquals(f9800, shouldBef9800);
    }

    /**
     * When a flight is added via the flightDAO, it should be retrievable by retrieving all flights.
     */
    @Test
    public void addFlightCheckAllFlightsTest1(){
        Flight f9800 = new Flight(9800, "tampa", "morgantown");
        flightDAO.insertFlight(f9800);
        List<Flight> allFlights = flightDAO.getAllFlights();
        Assert.assertTrue(allFlights.contains(f9800));
    }

    /**
     * When a flight is updated via the flightDAO, the updated values should be retrieved when the flight is next
     * accessed.
     */
    @Test
    public void updateFlightTest1(){
        Flight f9011updated = new Flight(9011, "reston", "dallas");
        flightDAO.updateFlight(9011, f9011updated);
        Flight f9011shouldBeUpdated = flightDAO.getFlightById(9011);
        Assert.assertEquals(f9011updated, f9011shouldBeUpdated);
    }
}
