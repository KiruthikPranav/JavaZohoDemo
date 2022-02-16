package set1;
/*
 * Print the Following Output
 * i/p contains odd number as length of the String or values
 * S=12345
 * 1   5
 *  2 4
 *   5
 *  2 4
 * 1   5
 */

public class CrossPattern {
	public static void main(String[] args) {
		int i,j,k;
		String n= "Kiruthik1";
		/*
		 * FOR INTEGER BY USING ARRAY NUMBERS WILL INCLUDED
		 */
		k=n.length();
		for(i=0;i<n.length();i++) {
			for(j=0;j<n.length();j++) {
				if((i==j)||((i+j)==k-1))
				{
					System.out.print(n.charAt(j));
				}
				else
					System.out.print(" ");
			
			}
			System.out.println();
		}
	
	}
}
