public class Worker extends Person
{
    //declarations
    private double hourlyPayRate;

    //constructor
    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    //getters and setters
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    //to string displays internals
    @Override
    public String toString()
    {
        return "Worker{" + "ID='" + this.getID() + '\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", title='" + this.getTitle() + '\'' +
                ", YOB=" + this.getYOB() +  '\'' + ", hourlyPayRate=" + hourlyPayRate +
                '}';
    }

    public double calculateWeeklyPay(double hoursWorked)
        {

            double weeklyTotal = 0;

            //if employee works over 40 hours, they get time and a half (1.5
            if (hoursWorked > 40)
            {
                double overtime = hoursWorked - 40;
                double beforeOvertime = 40 * hourlyPayRate;
                double afterOvertime = overtime * (hourlyPayRate*1.5);
                weeklyTotal = afterOvertime + beforeOvertime;
                return weeklyTotal;

            }

            else
            {
                weeklyTotal = hoursWorked * hourlyPayRate;
                return weeklyTotal;
            }

        }

        public String displayWeeklyPay(double hoursWorked)
        {
            //declarations
            double weeklyTotal;

                //gets total pay from calculateWeeklyPay method
                weeklyTotal = calculateWeeklyPay(hoursWorked);



                if (hoursWorked >40)
                {
                    double regTime = 40.0;

                    double regPayRate = hourlyPayRate;

                    //gets overtime
                    double overTime = hoursWorked- 40.0;


                    //gets total of regular rate at 40 hours
                    double regRateTotal = 40 * hourlyPayRate;

                    //overTimePayRate
                    double overTimePayRate = hourlyPayRate * 1.5;

                    //get total of overtime using over time pay rate
                    double overPayTotal = overTimePayRate * overTime;



                    //gets overTimePay rate
                    double overTimePay = overTime * overTimePayRate;

                    return "Regular hours = " + regTime + " , Regular Pay Rate = " + regPayRate + ", Regular Pay Total = " + regRateTotal +
                            " , Overtime = " + overTime + " , Overtime Pay Rate = " + overTimePay + ", Overtime Total = " +
                            overPayTotal +
                            " , Total = " + weeklyTotal;

                }

            //not over time, less than or equal to 40
            else
            {
                double totalPay = weeklyTotal;
                double regPayRate = hourlyPayRate;
                double regTime = hoursWorked;
                double overTime = 0.0;
                double overTimePay = 0.0;

                return "Regular hours = " + regTime + " , Regular Pay Rate = " + regPayRate + " , Overtime = " + overTime + " , Overtime Pay Rate = " + overTimePay +
                " , Total = " + weeklyTotal;
            }




        }


}
