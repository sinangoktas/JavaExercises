import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ParkingLotTest {

    @Test
    public void testParkingCost() {

        ParkingService parkingService = new ParkingService();
        assertEquals(15, parkingService.calculateBill(10));

    }

    @Test
    public void testReport() {

        ParkingService parkingService = new ParkingService();

        parkingService.calculateBill(10);
        parkingService.calculateBill(1);
        parkingService.calculateBill(17);

        assertEquals(3, parkingService.parkingReport.size());

    }
}
