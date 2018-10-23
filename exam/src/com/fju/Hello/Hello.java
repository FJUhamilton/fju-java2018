package com.fju.Hello;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name:");
		String name= scanner.nextLine();
		System.out.println(name);
		
		
		
		System.out.println("Hello.");
		System.out.println("My Name is Matt.");
        Student mg = new Student();
		mg.english =70;
		mg.math=90;
		mg.avg=(mg.english+mg.math)/2;
		mg.print();
		
		
		
		/*String name= "Matt";
		int english=70;
		int math =90;
	    int avg=(math+english)/2;
	    System.out.println(name+"\t"+english+"\t"+math+"\t"+avg);*/
		
		
		/*int myAge=19;
		int myHeight=172;
        float myWeight=83.5f;
        float myBMI= (10000*myWeight/(myHeight*myHeight));
        System.out.print("My age is ");
        System.out.println(myAge);
        System.out.print("My height is ");
        System.out.println(myHeight);
        System.out.print("My weight is ");
        System.out.println(myWeight);
        System.out.print("My BMI is ");
        System.out.println(myBMI);
        System.out.print("Nice to meet you.");*/
        



	}

}
