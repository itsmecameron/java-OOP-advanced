package com.javaoop.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	String ringer = "IPhone " + this.getVersionNumber() + " says " + this.getRingTone();
    	return ringer;
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
        // your code here            
    	System.out.println("IPhone "+ this.getVersionNumber() + " from " + this.getCarrier());
    }
    
}
