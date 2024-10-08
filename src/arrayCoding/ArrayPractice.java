package arrayCoding;

public class ArrayPractice {

	public static void min(int arr[]) {
		int mini= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(mini>arr[i]) {
				mini=arr[i];
			}
			
		}
		System.out.println(mini);
	}

	public static void main(String[] args) {
		
		int ab[]= new int[3];
		int b[]= {2,3,4,5,6};// declaration instantiation initialization
		for(int check: b) {
		//System.out.println(ab);// getting output as [I@515f550a (object identity as hascode in hexadecimal)
		
			
		}
		min(b);

	}

}
