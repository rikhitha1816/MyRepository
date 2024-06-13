class Student
{
	int rollno;
	void getNumber(int n)
	{
		rollno=n;
	}
	void putNumber()
	{
		System.out.println("roll no="+rollno);
	}
}
class Test extends Student
{
	float sub1,sub2;
	void getMarks(float m1,float m2);
	{
		sub1=m1;
		sub2=m2;
	}
	void putMarks()
	{
		System.out.println("sub1"+sub1+"\n sub2="+sub2);
	}
}
interface Sports
{
	float sportsmarks=6.0f;
	void putWt();
}
class Results extends Test implements Sports
{
	float total;
	public void putWt()
	{
		System.out.println("sports marks"+sportsmarks);
		}
		void display()
			{
			total=sub1+sub2+sportsmarks;
			putNumber();
			putMatks();
			putWt();
			System.out.println("total marks"+total);
			}
	
class Hybrid
{
	public static void main (String[]args)
	{
		Results obj=new Results();
		obj.getNumber(101);
		obj.getMarks(5688f,78.55f);
		obj.display();
	}
}
