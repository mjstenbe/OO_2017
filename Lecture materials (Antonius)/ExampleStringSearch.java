
/*
 * This is a simple example to demonstrate the use of the String Class methods indexOf and lastIndexOf.
 * Output formating method printf is also used, so students can get familiar with its usage
 */
public class ExampleStringSearch {

	public static void main(String[] args) {
		
		int first_a;
		
		String myText = "Laurea - Together we are stronger";
		
		System.out.printf("The example text is: \"" + myText + "\"\n");
		
		first_a = myText.indexOf('a'); //first_a contains the index where the first 'a' appears in myText 
		System.out.printf("The first 'a' appears at index %d\n", first_a);
		System.out.printf("The second 'a' appears at index %d\n", myText.indexOf('a', first_a + 1));
		
		System.out.printf("The last 'e' appears at index %d\n", myText.lastIndexOf('e'));
		
		System.out.printf("The first appearance of substring 'are' appears at index %d\n", myText.indexOf("are"));
		
		System.out.printf("'@' is not in the exmaple text, therefore the indexOf methods returns index %d", myText.indexOf('@'));
						
	}

}
