package Example_programs_lectures;

public class SimpleStringSearch {
	public static void main(String[] args) {
		int a, b, c, d;
		
		String myText = "This is very easy";
		
		a = myText.indexOf('i');
		b = myText.lastIndexOf('s');
		c = myText.indexOf("easy");
		d = myText.indexOf('i', a + 1);
		
		System.out.println("First output: " + a + b + c + d);
		System.out.println("Second output: " + (a+b) + (c+d));		
	}
}
