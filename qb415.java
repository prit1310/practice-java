abstract class vehicle
{
	abstract void startEngine();
	abstract void stopEngine();
}
class car extends vehicle
{
	void startEngine()
	{
		System.out.println("Engine start for car");
	}
	void stopEngine()
	{
		System.out.println("Engine stop for car");
	}
}
class motorcycle extends vehicle
{
	void startEngine()
	{
		System.out.println("Engine start for motorcycle");
	}
	void stopEngine()
	{
		System.out.println("Engine stop for motorcycle");
	}
}
class qb415
{
	public static void main(String[] args)
	{
		car c1 = new car();
		c1.startEngine();
		c1.stopEngine();
		motorcycle m1 = new motorcycle();
		m1.startEngine();
		m1.stopEngine();
	}
}
