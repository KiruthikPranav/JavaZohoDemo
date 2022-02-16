package set1;

public class SortOddEven {
	public static void main(String[] args) {        
		int a[]= {7,6,5,4,3,2,0};
		int x;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]%2==0) {
					if(a[i]<a[j]) {
						x=a[i];
						a[i]=a[j];
						a[j]=x;
					}
				}
				if(a[j]%2==1){
					if(a[i]>a[j]) {
						x=a[i];
						a[i]=a[j];
						a[j]=x;
					}
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}  
}
