import MyMa.BMW;
import MyMa.Hyundai;
import MyMa.Toyota;
import org.junit.Assert;
import org.junit.Test;


public class testClass {

    @Test
    public void BMW1(){
        BMW b1 = new BMW("Omer", "BMW", 45,90000,28000,10000 ,48 ,4000 ,0.09, 0.0032 );

        Assert.assertTrue("871.60".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("42836.80".equals(b1.totalCalculator()));

    }

    @Test
    public void BMW2(){
        BMW b1 = new BMW("Ali", "BMW", 35,80000,25000,5000 ,36 ,2000 ,0.09, 0.0031 );

        Assert.assertTrue("1203.00".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("44308.00".equals(b1.totalCalculator()));

    }

    @Test
    public void BMW3(){
        BMW b1 = new BMW("Ali", "BMW", 25,150000,30000,8000 ,48 ,1200 ,0.18, 0.0042 );

        Assert.assertTrue("1075.60".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(true==(b1.isAligable()));

        Assert.assertTrue("52628.80".equals(b1.totalCalculator()));

    }

    @Test
    public void Toyota1(){
        Toyota b1 = new Toyota("Ali", "Toyota", 35,25200,45000,7000 ,48 ,3000 ,0.11, 0.0045 );

        Assert.assertTrue("1816.00".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("88168.00".equals(b1.totalCalculator()));




    }

    @Test
    public void Toyota2(){
        Toyota b1 = new Toyota("Ali", "Toyota", 50,180000,40000,10000 ,24 ,1500 ,0.05, 0.0045 );

        Assert.assertTrue("2725.00".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(true==(b1.isAligable()));

        Assert.assertTrue("66400.00".equals(b1.totalCalculator()));


    }

    @Test
    public void Toyota3(){
        Toyota b1 = new Toyota("Ali", "Toyota", 35,80000,25000,5000 ,36 ,2000 ,0.09, 0.0031 );

        Assert.assertTrue("1203.00".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("44308.00".equals(b1.totalCalculator()));

    }

    @Test
    public void Hyundai1(){
        Hyundai b1 = new Hyundai("Ali", "Hyundai", 21,200000,32000,5000 ,48 ,3000 ,0.15, 0.0039 );

        Assert.assertTrue("1268.30".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(true==(b1.isAligable()));

        Assert.assertTrue("61878.40".equals(b1.totalCalculator()));

    }

    @Test
    public void Hyundai2(){
        Hyundai b1 = new Hyundai("Ali", "Hyundai", 35,10000,25000,5000 ,36 ,2000 ,0.09, 0.0031 );

        Assert.assertTrue("1203.00".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("44308.00".equals(b1.totalCalculator()));

    }

    @Test
    public void Hyundai3(){
        Hyundai b1 = new Hyundai("Someone", "Hyundai", 42,100000,25000,5000 ,48 ,3000 ,0.15, 0.0031 );


        Assert.assertTrue("925.00".equals(b1.leaseMonthlyCalculator()));

        Assert.assertTrue(false==(b1.isAligable()));

        Assert.assertTrue("45400.00".equals(b1.totalCalculator()));

    }

}



