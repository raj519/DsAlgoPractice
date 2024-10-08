package interviewQues;

public class LongestRepeatingSequence {
	
	public static String largestSeq(String s1,String s2) {
		int ab=s1.length();
		int cd= s2.length();
		int n= Math.min(ab, cd);
		for(int i=0;i<n;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.substring(0, i);
			}
		}
		return s1.substring(0, n);
	}

	public static void main(String[] args) {
		 String str = "acbdfzghybdf";
		 String lowestRepSeq="";
		 int le= str.length();
		 for(int i=0;i<le;i++) {
			 for(int j=i+1;j<le;j++) {
				 String s=largestSeq(str.substring(i,le),str.substring(j, le));
				 if(s.length()>lowestRepSeq.length()) {
					 lowestRepSeq=s;
				 }
			 }
		 }
		 System.out.println(lowestRepSeq);
	}

}
