package set1;
/*
  Check the String2 present in the String1. if String Present return 
  the first occurrence of string2 from String1. else return -1.
  	string 1:	test123
  	String 2:	123
  	return 7
  	
  	string 1:	test123
  	String 2:	1234
  	return -1  	
*/

public class String1String2 {
public static void main(String[] args) {
	String s1,s2;
	s1="test123numbers";
	s2="12";
	int i,j,n;
	n=0;
	char s3[]=new char[s2.length()];
	for(i=0;i<s2.length();i++) {
		for(j=0;j<s1.length();j++) {
			if(s2.charAt(i)==s1.charAt(j)) {
				s3[n]=s1.charAt(j);
				n=n+1;
			}
			
		}
	}
	for(i=0;i<s3.length;i++)
	{
		if(s3[i]==s2.charAt(i)) {
			for(j=0;j<s1.length();j++)
			{
				if(s2.charAt(0)==s1.charAt(j)) {
					System.out.println(j);
					
				}
				
			}
		}
		else
			System.out.println("-1");
	}
	
}

}
