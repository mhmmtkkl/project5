package MyMa;

public interface carInterface {

    /*
        Create 4 int variables variables

            hyundaiMinIncome

            toyotaMinIncome

            bmwMinIncome

            documentationFees


            Create two methods -->

             1) return type is String ,  no parameter  ,,, name is ---> leaseMonthlyCalculator

             2) return type is boolean ,  no parameter ,,, name is ---> isAligable


     */

    int hyundaiMinIncome = 100000;

    int toyotaMinIncome = 80000;

    int bmwMinIncome = 110000;

    int documentationFees = 1000;

    public String leaseMonthlyCalculator();

    public boolean isAligable();


}
