package MyMa;

import java.text.DecimalFormat;

public class Toyota  extends carLease implements carInterface {


    /*
    get the connection with carLease and carInterface
        after the connection you should have constructor ,  leaseMonthlyCalculator method and isAligable method

    */
    public Toyota(String name, String Which_Model, int age, int salary, int Total_Cost, int downPayment, int termofLease, int leaseFee, double TaxRate, double MoneyFactor) {
        super(name, Which_Model, age, salary, Total_Cost, downPayment, termofLease, leaseFee, TaxRate, MoneyFactor);
    }

    /*
             lease_MonthlyCalculator   --->> return type is String

            calculation is --->> calculateDepreciation + calculateInterest + Taxes (these methods are coming from the carLease method)

            hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11

    */
    @Override
    public String leaseMonthlyCalculator() {

        double result =  calculateDepreciation() + calculateInterest() + taxes();

        DecimalFormat df = new DecimalFormat("0.00");

        String st = df.format(result);

        return st;

    }

     /*
         isAligable

            if the salary is more then Toyota_MinIncome then true else false

     */
     @Override
     public boolean isAligable() {

         boolean result = false;

         if(getSalary()>toyotaMinIncome){

             result = true;

         }

         return result;

     }

      /*
        method name is totalCalculator

        return type is String

        calculation :  (leaseMonthlyCalculator * termofLease) + documentationFees

        hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11

     */
      public String totalCalculator(){

          double num = Double.parseDouble(leaseMonthlyCalculator());
          double result = (num * termofLease) + documentationFees;

          DecimalFormat df = new DecimalFormat("0.00");

          String ss = df.format(result);

          return ss;

      }

}