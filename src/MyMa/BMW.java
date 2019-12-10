package MyMa;

import java.text.DecimalFormat;

public class BMW extends carLease implements carInterface {

/*
    get the connection with CarLease and Car_Interface
        after the connection you should have constructor ,  lease_MonthlyCalculator method and is_aligable method

 */
    public BMW(String name, String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, double taxRate, double moneyFactor) {
        super(name, whichModel, age, salary, totalCost, downPayment, termofLease, leaseFee, taxRate, moneyFactor);
    }

    /*
             leaseMonthlyCalculator   --->> return type is String

            calculation is --->> calculateDepreciation + calculateInterest + taxes (these methods are coming from the carLease method)

            hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11

    */

    @Override
    public String leaseMonthlyCalculator() {

        double result =  calculateDepreciation() + calculateInterest() + taxes();

        DecimalFormat df = new DecimalFormat("0.00");

        String ss = df.format(result);

       return ss;

    }

    /*
     isAligable

        if the salary is more then bmwMinIncome then true else false

     */

    @Override
    public boolean isAligable() {

        boolean result = false;

        if(getSalary()>bmwMinIncome){

            result = true;

        }

        return result;

    }

    /*
        method name is totalCalculator

        return type is String

        calculation :  (leaseMonthlyCalculator * termofLease) + documentationFees

        you need to change leaseMonthCalculator to double

        hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11


     */
    public String totalCalculator(){

        double num = Double.parseDouble(leaseMonthlyCalculator());

        double result = (num * termofLease) + documentationFees;

        DecimalFormat df = new DecimalFormat("0.00");

        String ss =  df.format(result);

        return ss;

    }




}
