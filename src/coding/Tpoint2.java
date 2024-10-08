package coding;
//copy constructor value
public class Tpoint2 {

	int Id;
	String Name;
	
	Tpoint2(int i, String n){
		Id = i;
		Name= n;
	}
	Tpoint2(Tpoint2 tp){
		Id=tp.Id;
		Name= tp.Name;
	}
	void display() {
		System.out.println(Id+" "+Name);
	}	
	public static void main(String[] args) {
		 Tpoint2 tp= new Tpoint2(121,"Raj");
		 Tpoint2 tp1= new Tpoint2(tp);
			

		 tp.display(); // 121 Raj
		 tp1.display(); // 131 Raj
		
	}

}
