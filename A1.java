class Employee
{
	String name ;
	int salary ;
	String jobtitle ;
}
class Manager extends Employee
{
	 String name = "ABC";
	 int salary = 20000;
	 String jobtitle = "Manager";
	 void show()
	 {
		System.out.println("Name:"+name+"Salary:"+salary+"Jobtitle:"+jobtitle);
	 }
}
class Devloper extends Employee
{
	 String name = "PQR";
	 int salary = 15000;
	 String jobtitle = "Devloper";
	 void show()
	 {
		System.out.println("Name:"+name+"Salary:"+salary+"Jobtitle:"+jobtitle);
	 }
}
class Programmer extends Employee
{
	 String name = "XYZ";
	 int salary = 28000;
	 String jobtitle = "Programmer";
	 void show()
	 {
		System.out.println("Name:"+name+"Salary:"+salary+"Jobtitle:"+jobtitle);
	 }
}
class A1
{
	public  static void main(String args[])
	{
		Manager m1 = new Manager();
		Devloper d1 = new Devloper();
		Programmer p1 = new Programmer();
		m1.show();
		d1.show();
		p1.show();
	}
}