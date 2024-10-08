package interviewQues;

class Abc{
	 public static void sum() {
		
		System.out.println("parent one");		
	}
	public void minus() {
		System.out.println("parent one");		
	}	
}
class Cdf extends Abc{
	int i=30;
	public static void sum() { 
		System.out.println("child one");		
	}
	public void multiple() {
		System.out.println("child one");		
	}
	}
public class TestCode{
public static void main(String[] args) {
//	Abc ab1 = new Abc();// creating object of parent
//	//ab1.sum();// parent one 
//	Abc ab2 = new Cdf();// creating object of parent with ref to child
//	ab2.sum(); // child one 
//	ab2.sum();
//	ab2.minus();
//	Cdf cd= new Cdf();
////	cd.minus();// parent one
////	cd.hashCode();
//	//cd.sum();// child one 
	Abc parent= new Abc();
	System.out.println("");// print parent value
	Cdf child= new Cdf();
	System.out.println(child.i);// print both value
	child.sum();// print child one value
	
	Abc parentToChild= new Cdf();
	System.out.println("abc");// print parent value
	parentToChild.sum();// child value if method is non static
	parentToChild.sum();// parent value if method is static
	

	}

}
