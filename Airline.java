package iterator;

public class Airline {

    private String title;
    private Flight[] flights;
    private int size = 0;

    public Airline(String title) {
        this.title = title;
        this.flights = flights;
        this.size = size;

        flights = new Flight[size];

    }

    public void addFlight(String flightNum, String from, 
                            String to, int duration, int transfers) 
    {
            Flight flights = new Flight(flightNum, from, to, duration, transfers);
            if (size >= size) {
                System.err.println("Sorry, too many flights at once.");
            } 
            else {
                Flight[size] = flights;
			    size = size + 1;

        }

    }

    public String getTitle() {
        return title;
    }

    private Flight[] growArray(Flight[] flights) {
        return flights;
    }

    public FlightIterator createIterator() {
        return Flight.iterator();
    }

}


