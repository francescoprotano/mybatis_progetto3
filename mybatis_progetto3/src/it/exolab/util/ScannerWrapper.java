package it.exolab.util;

import java.util.Scanner;

public class ScannerWrapper {
	private static ScannerWrapper instance;
	private Scanner input = new Scanner(System.in);
	
	private ScannerWrapper() {
		
	}
	
	public static ScannerWrapper getInstance() {
		if(instance == null)
			instance = new ScannerWrapper();
		return instance;
	}
	
	public Scanner getInput() {
		return input;
	}
	
	
}
