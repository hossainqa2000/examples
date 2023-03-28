package coreJava;

public class String1 {
	//=========1. How to reverse a String in java ================
	public static void main(String[] args) {
        String str = "AMERICA";
        String rev = "";	        int len = str.length(); // here 4
        for(int i =len-1; i >= 0; i-- ){  //int i =len-1; index is less than 1 of total number, because is start from 0
            rev=rev +str.charAt(i);
        }
        System.out.println(rev);

	}

}
