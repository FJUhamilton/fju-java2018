package com.tom;
import java.util.Scanner;

public class RangeTester {
	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt() ;
        if(-3<=num && 5>=num){
        	System.out.println("true");
        }
        else{
        	System.out.println("false");
        }
        
}
}