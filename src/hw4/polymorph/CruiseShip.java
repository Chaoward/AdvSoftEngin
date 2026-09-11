package hw4.polymorph;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt) {
        super(name, yearBuilt);
        this.maxPassengers = 0;
    }

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    @Override 
    public void print() {
        System.out.println("Ship Name : " + this.getName() + "\n"
            + "Maximum Passengers : " + maxPassengers
        );
    }



    //===== Getters and Setters =====
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    
}
