abstract class shape
{
	abstract void Area();
}
class triangle extends shape
{
	int base , altitude;
	triangle(int b, int a)
	{
		base = b;
	    altitude=a;
	}
	void Area()
	{
		double area =  0.5 * base * altitude;
		System.out.println("Area of triangle:"+ area);
	}
}
class rectangle extends shape
{
	int length ,width;
	rectangle(int l, int w)
	{
			 length = l;
			 width = w;
	}
	void Area()
	{
		int area = length * width;
		System.out.println("Area of rectangle:"+area);
	}
}
class circle extends shape
{
	float radius;
	circle(float r)
	{
		 radius = r;
	}
	void Area()
	{
		float area = (float)Math.PI * radius * radius;
		System.out.println("Area of circle:"+area);
	}
}
class test
{
	public static void main(String args[])
	{
		triangle t1 = new triangle(10,20);
		rectangle r1 = new rectangle(25,30);
		circle c1 = new circle(14);
		t1.Area();
		r1.Area();
		c1.Area();
	}
}