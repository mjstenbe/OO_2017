package Example_programs_lectures;

/*
 * Use the Eclipse debugger to identify what is the value of newAmount when year==4.
 * You should find the value: 1215.5062500000001
 */
public class Interest {
	public static void main(String[] args) {
		double newAmount;
		double initialAmount = 1000.00;
		double interestRate = 0.05;
		
		System.out.printf("%s%20s\n",  "Year", "Current amount"); //Set your Breakpoint at this line
		
		for (int year=1; year<=10; year++)
		{
			newAmount = initialAmount * Math.pow(1.0 + interestRate,  year);
			
			System.out.printf("%4d%20.2f\n", year, newAmount);
		}
	}
}
