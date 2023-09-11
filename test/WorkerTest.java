import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest
{
    //declarations
    Worker example;

    @BeforeEach
    void setUp() {example = new Worker("000001", "Bilbo", "Baggins", "Esq.", 1060, 42);}

    @Test
    void setHourlyPayRate()
    {
        example.setHourlyPayRate(15.0);
        assertEquals(15.0,example.getHourlyPayRate());

    }

    @Test
    void testToString()
    {
        assertEquals("Worker{" + "ID='" + "000001" + '\'' +
                ", firstName='" + "Bilbo" + '\'' +
                ", lastName='" + "Baggins" + '\'' +
                ", title='" + "Esq." + '\'' +
                ", YOB=" + 1060 +  '\'' + ", hourlyPayRate=" + 42.0 +
                '}', example.toString());
    }

    @Test
    void calculateWeeklyPay()
    {
        example.setHourlyPayRate(15.0);
        assertEquals(645, example.calculateWeeklyPay(42.0));

    }

    @Test
    void displayWeeklyTotal()
    {
        example.setHourlyPayRate(15.0);

        assertEquals("Regular hours = " + 38.0 + " , Regular Pay Rate = " + 15.0 + " , Overtime = " + 0.0 + " , Overtime Pay Rate = " + 0.0 +
                " , Total = " + 570.0, example.displayWeeklyPay(38.0));

    }


}