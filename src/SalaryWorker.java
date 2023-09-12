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
        return "salaryWorker{" + "ID='" + this.getID() + '\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", title='" + this.getTitle() + '\'' +
                ", YOB=" + this.getYOB() +  '\'' + ", hourlyPayRate=" + this.getHourlyPayRate() + '\''  +"}" + '\'' + ", annualSalary = " +
                this.getAnnualSalary() + '}';
    }

    //overrides calculateWeeklyPay in the Parent class Worker
    public double calculateWeeklyPay(double hoursWorked)
    {
        double weeklyPay = (annualSalary/52.0);
        return weeklyPay;
    }

    //override displayWeeklyPay in the Parent class Worker
    public String displayWeeklyPay()
    {
        //goes to calculateWeeklyPay on SalaryWorker
        double weeklyPay = calculateWeeklyPay(0);
        return weeklyPay + " is 1/52 pay of the annual pay";
    }



}
