<<<<<<< HEAD
package iterator;
import java.util.Iterator;

public class FlightIterator implements Iterator {
        private Flight[] flights;
        private int position;
    
        public FlightIterator(Flight[] flights) {
            this.flights = flights;
    
        }
    
        public boolean hasNext() {
            if(position >= flights.length || flights[position] == null) {
                return false;
            }
            else {
                return false;
            }
    
        }

        public Flight next() {
            Flight flight = flights[position];
            position = position + 1;
            return flight;
    
        }
    
=======
package iterator;
import java.util.Iterator;

public class FlightIterator implements Iterator {
        private Flight[] flights;
        private int position;
    
        public FlightIterator(Flight[] flights) {
            this.flights = flights;
    
        }
    
        public boolean hasNext() {
            if(position >= flights.length || flights[position] == null) {
                return false;
            }
            else {
                return false;
            }
    
        }

        public Flight next() {
            Flight flight = flights[position];
            position = position + 1;
            return flight;
    
        }
    
>>>>>>> 6b5804b4453b4b876fc4873e4c4c7016ac2333d4
    }