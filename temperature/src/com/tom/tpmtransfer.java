package com.tom;
import java.util.Scanner;

public class tpmtransfer {
	public static void main(String[] args) {
		System.out.println("·Å«×:");
		Scanner scanner= new Scanner(System.in);
		double tp = scanner.nextDouble();
		double cacu = tp*(9.0/5.0)+32;
		System.out.printf("%.1f C = %.1f F"+"\n",tp,cacu);
		
	}
}
