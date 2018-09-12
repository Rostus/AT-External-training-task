package Aircompany.Hierarchy.Types;

public class Airliner extends Plane {

    private final Integer maxCapacity;

    public Airliner(int rangeOfFlight, int maxCapacity, String name) {
        super(rangeOfFlight, name);

        this.maxCapacity = maxCapacity;
    }

    @Override
    public int getMaxCapacity() {
        return maxCapacity;
    }
    @Override
    public int getCarriage(){
        return 0;
    }
}
