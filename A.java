class shape
{
	void getArea()
	{
		System.out.println("");
	}
}
class square extends shape
{
	int length;
	square(int l)
	{
		 length = l;
	}
	void getArea()
	{
			int area = length * length;
			System.out.println("Area of square is :  "+area);
	}
}
class rectangle  extends shape
{
	int height,width;
	rectangle(int l, int b)
	{
		 height= l;
		 width = b;
	}
	void getArea()
	{
		int area = height * width;
		System.out.println("Area of rectangle is :  "+area);
	}
}
class circle extends shape
{
	int radius;
	circle(int r)
	{
		 radius = r;
	}
	void getArea()
	{
		float area = (float)Math.PI * radius * radius;
		System.out.println("Area of circle is :  "+area);
	}
}
class A
{
	public static void main(String args[])
	{
		shape s1 = new shape();
		s1 = new square(8);
		s1.getArea();
		s1 = new rectangle(10,25);
		s1.getArea();
		s1 = new circle(12);
		s1.getArea();
	}
}