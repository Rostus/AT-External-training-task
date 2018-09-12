package Aircompany;

import Aircompany.Hierarchy.Instances.AN12;
import Aircompany.Hierarchy.Instances.AirbusA320;
import Aircompany.Hierarchy.Instances.BoeingC17;
import Aircompany.Hierarchy.Instances.Embraer190;
import Aircompany.Hierarchy.Types.Plane;

public class Main {
    public static void main(String[] args) {
        Plane planeAirbusA320 = new AirbusA320();
        Plane planeAN12 = new AN12();
        Plane planeBoeingC17 = new BoeingC17();
        Plane planeEmbraer190 = new Embraer190();

        AirCompany Belavia = new AirCompany();
        Belavia.addPlanes(planeAirbusA320);
        Belavia.addPlanes(planeAN12);
        Belavia.addPlanes(planeBoeingC17);
        Belavia.addPlanes(planeEmbraer190);

        Belavia.AirCompanyName = "Belavia";
        System.out.println();

        Belavia.listAirlinePlanes();

        Belavia.findPlaneByRangeOfFlight(500,2000);
        System.out.println();

        Belavia.countTotalPlanesCapacity();

        Belavia.countTotalPlanesCarriage();


    }
}
