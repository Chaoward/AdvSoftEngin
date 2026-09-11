package hw4.polymorph;

public class CargoShip extends Ship {
    private int maxWeightByTon;

    public CargoShip(String name, String yearBuilt) {
        super(name, yearBuilt);
        this.maxWeightByTon = 0;
    }

    public CargoShip(String name, String yearBuilt, int maxWeightByTon) {
        super(name, yearBuilt);
        this.maxWeightByTon = maxWeightByTon;
    } 

    @Override 
    public void print() {
        System.out.println("Ship Name : " + this.getName() + "\n"
            + "Max Weight(tons) : " + maxWeightByTon
        );
    }

    //===== Getters and Setters =====
    public int getMaxWeightByTon() {
        return maxWeightByTon;
    }

    public void setMaxWeightByTon(int maxWeightByTon) {
        this.maxWeightByTon = maxWeightByTon;
    }

    
}
