package InHeritance;

class Ankit extends Student{
	//method
	void display() {
		roll=1;
		name="ankit";
		marks=89;
		System.out.println(roll+" "+name+" "+marks);
	}
	public static void main(String[]args) {
		Ankit r=new Ankit();
		r.input();// it first checks in the current class Ankit then it goes to Student
		r.display();
	}
	
}


