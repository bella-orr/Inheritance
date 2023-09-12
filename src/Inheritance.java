//imports
import java.io.*;
import java.util.ArrayList;


public class Inheritance
{
    public static void main(String[] args)
    {

    //declaration
    ArrayList <Worker> employees = new ArrayList();


    //3 Worker instances created
    Worker workerOne = new Worker("000001", "Bilbo", "Baggins", "Esq.", 1060, 16.0);
    Worker workerTwo = new Worker("000002", "Frodo", "Baggins", "Esq.", 1120, 18.0);
    Worker workerThree = new Worker("000003", "Samwise", "Gamgee", "Esq.", 1125, 20.0);

    //3 SalaryWorker instances created
    SalaryWorker salWorkerOne = new SalaryWorker("000004", "Peregrin", "Took", "Esq.", 1126, 25.0, 80000.0);
    SalaryWorker salWorkerTwo = new SalaryWorker("000005", "Meridoc", "Brandybuck", "Esq.", 1126, 30.0, 90000.0);
    SalaryWorker salWorkerThree = new SalaryWorker("000006", "Bella", "Orr", "Miss.", 2003, 22.0, 72000.0);

    //save all Worker and SalaryWork instances to an array list
        employees.add(workerOne);
        employees.add(workerTwo);
        employees.add(workerThree);
        employees.add(salWorkerOne);
        employees.add(salWorkerTwo);
        employees.add(salWorkerThree);

        //titles for data tables
        System.out.println(String.format("%-20s%-20s%-20s%-15s", "Worker Name", "First Pay", "Second Pay", "Third Pay" ));
        System.out.println("==============================================================================");

        //enhanced for loop that simulates three pay periods
        //note the pay for the last three people should be the same between all three weeks since they have an annual rate
        for(Worker e : employees)
        {
            double weekOne = e.calculateWeeklyPay(40);
            double weekTwo = e.calculateWeeklyPay(50);
            double weekThree = e.calculateWeeklyPay(40);

            String firstName = e.getFirstName();

            System.out.println(String.format("%-20s%-20.2f%-20.2f%-15.2f", firstName, weekOne, weekTwo, weekThree));


        }

        System.out.println();

        //Prints out the array list of Workers and Salary Workers
        for(Worker e:employees)
        {
            System.out.println(e);
        }




    }
}
