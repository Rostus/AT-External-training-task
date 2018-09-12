package Aircompany;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Aircompany.Hierarchy.Types.Plane;

public class AirCompany {

    public String AirCompanyName;
    private ArrayList<Plane> Planes = new ArrayList<Plane>();

    public void addPlanes(Plane plane) {
        Planes.add(plane);
    }

    public void listAirlinePlanes(){                                    //Вывод наименование компании + список самолетов
        System.out.println(AirCompanyName);
        System.out.println("Planes of Aircompany:");
        for(int i = 0;i <Planes.size(); i++){
            System.out.println(Planes.get(i));
        }

    }

    public void countTotalPlanesCapacity() {                            //расчет вместимости(люди)
        int airlinerCapacity = 0;
        for (int i = 0; i < Planes.size(); i++) {
            airlinerCapacity += Planes.get(i).getMaxCapacity();
        }
        System.out.println("Total passenger capacity " + airlinerCapacity);
    }

        public void countTotalPlanesCarriage () {                       //расчет вместимости(груз)
            int cargoPlaneCarriage = 0;
            for (int i = 0; i < Planes.size(); i++) {
                cargoPlaneCarriage += Planes.get(i).getCarriage();
            }
            System.out.println("Total cargo capacity " + cargoPlaneCarriage);
        }

    public ArrayList<Plane> findPlaneByRangeOfFlight (int min, int max) {               //поиск самолета по дальности полета
        ArrayList<Plane> resultPlane = new ArrayList<Plane>();
            for (int i = 0;i < this.Planes.size(); i++){
                int rangeOfFlight = Planes.get(i).getFlightRange();
                if(rangeOfFlight >= min && rangeOfFlight <= max){
                    resultPlane.add(Planes.get(i));
                    System.out.println("\nPlane with range of flight from " + min + " to " + max + ": \n" + resultPlane);
                }
        }
        return resultPlane;
    }
}

