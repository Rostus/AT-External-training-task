package Aircompany.Hierarchy.Types;

public class CargoPlane extends Plane {

    private final Integer carriage;

    public CargoPlane(int rangeOfFlight, int carriage, String name) {

        super(rangeOfFlight, name);

        this.carriage = carriage;
    }

    @Override
    public int getCarriage() {
        return carriage;
    }

    @Override
    public int getMaxCapacity() {
        return 0;
    }

}
