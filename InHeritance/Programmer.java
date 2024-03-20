package InHeritance;

public class Programmer extends Employee  {
	int bonus=10000;
	public static void main(String[]args) {
		Programmer r=new Programmer();
		System.out.println("Programmer salary is "+ r.salary);
		System.out.println("Bonus of programmer is "+r.bonus);
		
	}
	

}
