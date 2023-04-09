/*
- To create an abstract class called Bank.
- To create an abstract method called getRateOfInterest();
- To create two subclasses called SBI - 7% and PNB - 5% as two banks that extend the abstract class Bank.
- To implement different functionalities for the getRateOfInterest() method in the SBI and PNB classes through 
  the concept of method overriding and print out the interest rate inside the main() method created separately in a test class called TestBank
*/

abstract class Bank {
    abstract void getRateOfInterest();
}

class SBI extends Bank {
    void getRateOfInterest(){System.out.println("SBI rate of interest is 7%.");}
}

class PNB extends Bank {
    void getRateOfInterest(){System.out.println("PNB rate of interest is 5%.");}
}

public class TestBank {
    public static void main(String args[]){
        Bank bank0 = new Bank();
        Bank bank1 = new SBI();
        Bank bank2 = new PNB();
        bank0.getRateOfInterest();
        bank1.getRateOfInterest();
        bank2.getRateOfInterest();
    }
}
