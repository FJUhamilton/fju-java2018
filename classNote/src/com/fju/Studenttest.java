package com.fju;

public class Studenttest {

		String name ;
		int english;
		int math;
		
		public Studenttest(String name , int english,int math){
			
	    this.name = name;
		this.english = english;
		this.math = math;
		}
		public void print(){
			System.out.print(name + "\t" + english + "\t"+ math +"\t"
					+getAverage()+"\t");
			if(getAverage() < 60){
				System.out.println("FAILED");
			}else{
				System.out.println("PASS");
			}
		}
		
		public int getAverage(){
			return ((english+math)/2);
		}
	}
	
	


{char grading ='F';
	switch(gatAverage){
       case 10:
       case 9:
    	   gathering ='A' ;
    	   break ;
       case 8:
    	   gathering ='B' ;
    	   break ;
       case 7:
    	   gathering ='C' ;
    	   break ;
       case 6:
    	   gathering ='D' ;
    	   break ;
    	   defeat:
    		   grading='F';
	}
}}