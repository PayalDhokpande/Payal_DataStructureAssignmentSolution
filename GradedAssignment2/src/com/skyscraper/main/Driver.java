package com.skyscraper.main;


import com.skyscraper.service.ChiefArchitect;

public class Driver {

	public static int totalFloors;
	public static int[] totalFloorSize;
	
	public static void main(String[] args) {
		ChiefArchitect objDriver = new ChiefArchitect();
		objDriver.userInputs();
		objDriver.orderOfConstruction(objDriver.totalFloorSize);

	}

}
