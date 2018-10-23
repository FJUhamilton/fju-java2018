package com.tom;
import java.util.Scanner;

public class RangeTester {
	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt() ;
		System.out.println(num>=-3&&num<=5);
        
}
}