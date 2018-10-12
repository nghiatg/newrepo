package mp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mc {

    public static void main(String[] args) {
    	bai3();
    	
    }
    
    public static void bai1() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter user name: ");
    	String name  = sc.next();
    	System.out.println("Enter age: ");
    	int age = sc.nextInt();
    	System.out.println("Hello " + name + ".Next year you will be " + age);
    	sc.close();
    }
    
    public static void bai2() { 
    	double interest = 0.07;
    	double includeInterest = 1 + interest;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter target: ");
    	long target  = sc.nextLong();
    	System.out.println("Enter amount each year: ");
    	long eachYear = sc.nextLong();
    	System.out.println("Enter current money: ");
    	double currentAmount = sc.nextDouble();
    	int yearCount = 0;
    	
    	
    	while(currentAmount < target) {
    		yearCount++;
    		currentAmount = currentAmount * includeInterest + eachYear;
    		System.out.println("after " + yearCount + " years, amount is " + formatDouble(currentAmount));
    	}
    	System.out.println(yearCount);
    	sc.close();
    }
    
    public static void bai3() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhap so luong so duoc chon : ");
    	int amountToPick  = sc.nextInt();
    	System.out.println("Nhap tong so cac so: ");
    	int amountAllNumber = sc.nextInt();
    	long ms = 1;
    	long ts = 1;
    	for(int i = 1 ; i <= amountToPick ; ++i) {
    		ms *= i;
    	}
    	for(int i = 1 ; i <= amountToPick ; ++i) {
    		ts *= (amountAllNumber + 1 - i);
    	}
    	System.out.println("1/" + ts/ms);
    	sc.close();
    	System.out.println("Kha nang trung : " + formatDouble((double)ms/ts));
    }
    
    public static String formatDouble(double d) {
    	DecimalFormat df = new DecimalFormat("#");
    	df.setMaximumFractionDigits(13);
    	return df.format(d);
    }

    public static void bai4() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number of pick: ");
    	int numberPicked = sc.nextInt();
    	System.out.println("Enter all possibility: ");
    	int allPossibility = sc.nextInt();
    	int[] arr = new int[numberPicked];
    	for(int i = 0 ; i < numberPicked ; ++i) {
    		arr[i] = (int)Math.floor(Math.random() * allPossibility);
    		System.out.println(arr[i]);
    	}
    	StringBuilder sb = new StringBuilder();
    	for(int i = numberPicked - 1 ; i >= 0 ; --i) {
    		sb.append(arr[i]).append(" ");
    	}
    	System.out.println(sb.toString());
    	
    	sc.close();
    }
    
    public static void bai5() {
    	
    }


}
