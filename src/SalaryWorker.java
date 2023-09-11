public class SalaryWorker extends Worker
{
    //declarations
    private double annualSalary;

    //constructor
    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    //getters and setters
    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    //to string

    @Override
    public String toString()
    {
        return "SalaryWorker{" +
                "annualSalary=" + annualSalary +
                '}';
    }



}
