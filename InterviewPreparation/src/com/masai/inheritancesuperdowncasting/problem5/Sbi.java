package com.masai.inheritancesuperdowncasting.problem5;

public class Sbi extends Bank{
	
int getRateOfInterest() {
	return 8;
}

}

class ICIC extends Bank{
	
	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
}

class AXIS extends Bank{
	
	@Override
	int getRateOfInterest() {
		return 9;
	}
}
