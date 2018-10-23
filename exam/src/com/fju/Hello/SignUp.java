package com.fju.Hello;
import java.util.Scanner;
public class SignUp {

	public static void main(String[] args) {
	System.out.println("Are you 18?(y/N)");
	Scanner scanner= new Scanner(System.in);
	String tf = scanner.nextLine();
	System.out.println("*"+tf+"*");
	boolean adult = tf.toUpperCase().equals("Y");
	if (adult){
		System.out.println("What's your age?:");
        int age =scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's your name?:");
        String name=scanner.nextLine();
        System.out.println("What's your nickname?:");
        String nn =scanner.nextLine();
    System.out.println(age+"\t"+name+"\t"+nn);

}
	else{
		System.out.println("BYE =)");
	}
	}
}
