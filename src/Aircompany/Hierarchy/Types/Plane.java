package Aircompany.Hierarchy.Types;

public abstract class Plane {

    protected String name;            //Название самолета
    protected int rangeOfFlight;     //Дальность полета

    public Plane(int rangeOfFlight, String name) { //конструктор
        this.rangeOfFlight = rangeOfFlight;
        this.name = name;
    }
    public abstract int getCarriage();

    public abstract int getMaxCapacity();

    public String getName() {
        return name;
    }

    public int getFlightRange() {
        return rangeOfFlight;
    }

    @Override
    public String toString() {
        return "Plane name = " + name + ",Carriage =" + getCarriage() + ",Seating Capacity =" + getMaxCapacity() + ", Flight range =" + rangeOfFlight + "";
    }
}
