import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest
{
    SalaryWorker example;

    @BeforeEach
    void setUp()
    {
        example = new SalaryWorker("000001", "Bilbo", "Baggins", "Esq.",
                1060, 15.0, 52000.0 );
    }

    @Test
    void setAnnualSalary()
    {
        example.setAnnualSalary(60000.0);
        assertEquals(60000.0, example.getAnnualSalary());
    }

    @Test
    void testToString()
    {
        assertEquals("salaryWorker{" + "ID='" + "000001" + '\'' +
                ", firstName='" + "Bilbo" + '\'' +
                ", lastName='" + "Baggins" + '\'' +
                ", title='" + "Esq." + '\'' +
                ", YOB=" + 1060 +  '\'' + ", hourlyPayRate=" + 15.0 + '\''  +"}" + '\'' + ", annualSalary = " + 52000.0 +
                '}', example.toString());

    }

    @Test
    void calculateWeeklyPay()
    {
        assertEquals(1000.0, example.calculateWeeklyPay(0));

    }

    @Test
    void displayWeeklyPay()
    {
        assertEquals(1000.0 + " is 1/52 pay of the annual pay", example.displayWeeklyPay());
    }
}