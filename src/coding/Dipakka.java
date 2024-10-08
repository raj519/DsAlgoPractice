package coding;

import java.util.Arrays;
import java.util.Collections;

public class Dipakka {

	public static void printFreq(int []arr, int n) {
		int freq=1,i=1; // i is array index
		while(i<=n) {
			while(i<n && arr[i]==arr[i-1]) {
				freq++;
				i++;
			
			}
			System.out.println(arr[i-1]+" "+freq);
			i++;
			freq=1;
		}
	}
	public static void main(String[] args) {
	 int [] a= {1,21,34,34,4245,21,0,44,44,44};
	 int n= a.length;
	 Arrays.sort(a);
	 //printFreq(a, n);
	 
	 String str="I am eating";
	 char ab[]=str.toCharArray();
	 for(int i=0;i<ab.length;i++) {
		 System.out.print(ab[i]);
		 
	 }
	 
	 
	 	 

	}

}
