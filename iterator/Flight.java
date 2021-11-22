<<<<<<< HEAD
package iterator;

public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumTransfers() {
        return transfers;
    }

    public String toString() {
        System.out.println("Flight Number: "+flightNum+("\n"));
        System.out.println("From: "+from+("\n"));
        System.out.println("To: "+to+("\n"));
        System.out.println("Duration: "+duration+("\n"));
        System.out.println("Transfer: "+transfers+("\n"));
        return super.toString();

    }

}
=======
package iterator;

public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumTransfers() {
        return transfers;
    }

    public String toString() {
        System.out.println("Flight Number: "+flightNum+("\n"));
        System.out.println("From: "+from+("\n"));
        System.out.println("To: "+to+("\n"));
        System.out.println("Duration: "+duration+("\n"));
        System.out.println("Transfer: "+transfers+("\n"));
        return super.toString();

    }

}
>>>>>>> 6b5804b4453b4b876fc4873e4c4c7016ac2333d4
