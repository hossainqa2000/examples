package firstPack;

public class Branch2Class {

	public static void main(String[] args) {
		  String str = "Ramadan is for cleaning our sin";
		  String rev = "";
		  int len = str.length(); // here 4
		  for(int i =len-1; i >= 0; i-- ){  //int i =len-1; index is less than 1 of total number, because is start from 0
		      rev=rev +str.charAt(i);
		  }
		  System.out.println(rev);

	}

}
