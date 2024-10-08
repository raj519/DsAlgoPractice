package coding;

public class TpointPractice {

	int Id;
	String Name;
	TpointPractice(int id,String name){
		Id=id;
		Name= name;
	}
	void display() {
		System.out.println(Id+" "+Name);
	}
	
	public static void main(String[] args) {
		// Ternary Operator
//		int a=10;
//		int b=20;
//		int c=35;
//		
//		int min=0;
//		int check=(a>b)?a:b; // 20
//		min=(check>c)?check:c; // 35
//		System.out.println(min);

		// Assignment Operator
//		short a=10;
//		short b=20;
//		a+=b; // a=a+b;
//		
//		//a=(short)(a+b);
//		System.out.println(a);
		//parameterize constructor
TpointPractice tp= new TpointPractice(111,"raj");
TpointPractice tp2= new TpointPractice(112,"avi");
tp.display();
tp2.display();
		
	}

}
