package This;
//Default constructor of its Own Class
public class A {
	//Default constructor
	A(){
		System.out.println("Hello");
		}
	//Parameterized Constructor
	A(int a){
		this();
		System.out.println(a);
	}
	public static void main(String[]args) {
		//object 
		A r=new A(10);
		A r1=new A();//if i did not pass any value if wont go to a
	}

}
