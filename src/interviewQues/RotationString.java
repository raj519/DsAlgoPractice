package interviewQues;

public class RotationString {

	public static boolean arerotations(String s1,String s2) {
	   if(s1.length()!=s2.length()) {
		   return false;
	   }
	  String s3=s1+s1;
	  if(s3.contains(s2)) {
		  return true;
	  }else {
		  return false;
	  }
		
	}	
	public static void main(String[] args) {
		String ab= "avajava"; // avajavaavajava
		String cd= "javaava";
		if(arerotations(ab,cd)) {
			System.out.println("rotation");
		}else {
			System.out.println("not rotation");
		}	    	// output- rotation
	}
}





    
    
