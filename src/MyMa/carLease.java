package MyMa;

public abstract class carLease {

    /*
        Create 2 string   (name , whichModel)

        7 int (age ,salary , totalCost , downPayment , termofLease , leaseFee , depractionAmount )

        3  double (taxRate , moneyFactor , interestAmount)

     */

    String name;

    String whichModel;

    int age;

    int salary;

    int totalCost;

    int downPayment;

    int termofLease;

    int leaseFee;

    int depractionAmount;

    double taxRate;

    double moneyFactor;

    double interestAmount;

    /*

        Create a constructor

        All the variables are should be as a parameter except (depractionAmount and interestAmount)

        depractionAmount = calculateDepreciation method (you will create this in this class)

        interestAmount = calculateInterest method (you will create this in this class)

     */


    public carLease(String name,String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, double TaxRate, double moneyFactor){

        this.name = name;

        this.whichModel = whichModel;

        this.age = age;

        this.salary =salary;

        this.totalCost=totalCost;

        this.downPayment=downPayment;

        this.termofLease=termofLease;

        this.leaseFee=leaseFee;

        this.taxRate=taxRate;

        this.moneyFactor = moneyFactor;


        depractionAmount = calculateDepreciation();

        interestAmount = calculateInterest();
    }
/*
 Create a method

        calculateDepreciation

        return type should be int

        calculation is :

        total cost minus down payment divide by term of lease

 */
    public int calculateDepreciation(){

         int result = (totalCost - downPayment) /termofLease;

         return result;
    }

    /*
       calculateInterest

                return type should  be double

                calculation is : total cost plus down payment multiply by money factor

     */

    public double calculateInterest(){

        double result = (totalCost + downPayment) * moneyFactor;

         return result;
    }

    /*

        taxes
           return type should be double

            calculation is :
            depractionAmount + interestAmount * taxRate

     */
    public double taxes(){

        double result = depractionAmount + interestAmount * taxRate;

        return result;
    }

    /*
     getter for the (getSalary)
     */
    public int getSalary() {
        return salary;
    }

}
