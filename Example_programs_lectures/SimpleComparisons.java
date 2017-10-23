package Example_programs_lectures;

public class SimpleComparisons {
	public static void main(String[] args) {
		int a=120, b=20, c=-34, d=5;
		if (b>a)
		{
			System.out.println("A");
		}
		
		if (b%d > 0)
		{
			System.out.println("B");			
		}
		
		if ((c > 0) || (c <= 0))
		{
			System.out.print("C");			
		}
		else
		{
			System.out.println("D");			
		}
		
		if ((b/d > d) && (c < 0))
		{
			System.out.println("E");			
		}
		else
		{
			System.out.print("F");			
		}
		
		if (!((a/b/3)*(++d)<(d*=5)))
		{
			System.out.print("G");			
		}
	}
}

