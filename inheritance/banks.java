/*
Inheritance and Polymorphism Exercise
- Consider a scenario where Bank is a class that provides functionality to get the rate of interest. 
However, the rate of interest varies according to banks.
For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest. 
*/ 

public class Bank {
    public float getRateOfInterest(){
        return .10f;
    }
    public static void main(String args[]){
    Bank bank1 = new Bank();
    Bank bank2 = new SBI();
    Bank bank3 = new ICIC();
    Bank bank4 = new AXIS();
    System.out.println("Default interest rate is: " + (bank1.getRateOfInterest() * 100) + "%");
    System.out.println("SBI interest rate is: " + (bank2.getRateOfInterest()*100) + "%");
    System.out.println("ICIC interest rate is: " + (bank3.getRateOfInterest()*100) + "%");
    System.out.println("AXIS interest rate is " + (bank4.getRateOfInterest()*100) + "%");
}

}
class SBI extends Bank {
    public float getRateOfInterest(){
        return .08f;
    }

}
class ICIC extends Bank {
    public float getRateOfInterest(){
        return .07f;
    }
}
class AXIS extends Bank {
    public float getRateOfInterest(){
        return .09f;
    }
}
