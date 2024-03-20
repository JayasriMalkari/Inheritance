package This;
//calling parameterized Constructor of its own Class
public class B {
	//Default Constructor
	B(){
		this(100);
		System.out.println("this has a value so it refers to the parameterized constructor");
		//this(100); constructor call must be the first statement
		}
	//parameterized Constructor 
	B(int a){
		System.out.println("The value of a is :"+ a);
	}
	public static void main(String[]args) {
		//object
		B r=new B();
		
	}

}
