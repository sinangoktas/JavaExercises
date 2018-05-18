import java.util.*;

public class ParkingService {

    Map<Integer, Integer> parkingReport;

    public ParkingService() {

        this.parkingReport = new HashMap<>();

    }

    public int calculateBill(int numHours) {

        Calendar c1 = Calendar.getInstance();
        int parkingCost = 0;

        if ((c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
                || (Calendar.DAY_OF_WEEK == Calendar.SUNDAY)) {


            if (numHours <= 2)
                parkingCost = 5;

            else if (numHours > 2 && numHours <= 5)
                parkingCost = 8;

            else if (numHours > 5 && numHours <= 10)
                parkingCost = 12;

            else if (numHours > 10 && numHours <= 15)
                parkingCost = 18;

            else if (numHours > 15 && numHours <= 24)
                parkingCost = 25;


        } else {

            if (numHours <= 2)
                parkingCost = 7;

            else if (numHours > 2 && numHours <= 5)
                parkingCost = 10;

            else if (numHours > 5 && numHours <= 10)
                parkingCost = 15;

            else if (numHours > 10 && numHours <= 15)
                parkingCost = 22;

            else if (numHours > 15 && numHours <= 24)
                parkingCost = 30;

        }

        parkingReport.put(numHours, parkingCost);
        return parkingCost;

    }

}
