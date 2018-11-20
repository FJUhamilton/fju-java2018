package com.fju;
import java.util.Scanner;
import java.util.Random;
public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random =new Random();
		int real =(random.nextInt(10)+1);
		System.out.println(real);
        System.out.println("Your guess:");
		int a=1 ;
		while(true){
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
		     if (real>number) {
			System.out.println("Higher");
			a++;
			System.out.println("Your guess:");
			}
			else if (real<number) {
			System.out.println("lower");
			a++;
			System.out.println("Your guess:");
			}
			else if(real==number && a<=2){
				System.out.println("Excellent!The secret number is "+real);
				break;
			}
			else if(real==number && a>2){
				System.out.println("Great!The secret number is "+real);
				break;
			}
			else{
				break;
			}
        
	}
	}
}
