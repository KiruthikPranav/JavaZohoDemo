package set1;

import java.util.Scanner;

public class ReverseString {
	public static String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}
	
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    System.out.println(reverseWords(s));
	    sc.close();
	}
}

/*
public class ReverseString {  
	//recursive function to reverse a string      
	public String reverseString(String str){  
	//checks if the string is empty   
		if(str.isEmpty()){  
			//System.out.println("String is empty.")  ;
			//if the above condition is true returns the same string      
			return str;  
	}   
		else   
	{  
			return reverseString(str.substring(1))+str.charAt(0);  
	}  
	}
	public static void main(String[] args){ 
		
	ReverseString rs = new ReverseString();  
	String resultantSting1 = rs.reverseString("JAVA T POINT");  
	String resultantSting2 = rs.reverseString("COMPUTER");  
	String resultantSting3 = rs.reverseString("I Love INDIA");  
	System.out.println(resultantSting1);  
	System.out.println(resultantSting2);  
	System.out.println(resultantSting3);   
	}  
}
*/