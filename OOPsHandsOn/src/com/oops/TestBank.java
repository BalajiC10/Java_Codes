package com.oops;

public class TestBank {
public static void main(String[] args) {
	ICICIBank icciBank = new ICICIBank();
	KotakBank kotakBank = new KotakBank();
	
	System.out.println(icciBank.getFixedInterestrate());
    System.out.println(icciBank.getSavingInterestRate());
    System.out.println(kotakBank.getFixedInterestrate());
    System.out.println(kotakBank.getSavingInterestRate());
    System.out.println();
    
    
    GeneralBank gBank = new ICICIBank();
    GeneralBank gBank1 = new KotakBank();
    
    
    System.out.println(gBank.getFixedInterestrate());
    System.out.println(gBank.getSavingInterestRate());
    System.out.println(gBank1.getFixedInterestrate());
    System.out.println(gBank1.getSavingInterestRate());
    
	
}
}
