package Workshop_B_Variables;

public class PotilaitaJaLaakareita {
	public static void main(String[] args) {
		// Exercise 4
		int potilaidenLkm=21,  laakareidenLkm=5;
		System.out.println("Amount of people in the hospital: " + (potilaidenLkm + laakareidenLkm));
		
		// Exercise 5
		++potilaidenLkm;
		System.out.println("Amount of patients: " + potilaidenLkm);
		
		// Exercise 6
		laakareidenLkm -= 3;
		System.out.println("Amount of doctors: " + laakareidenLkm);
		System.out.println("Amount of patients per doctors: " + (potilaidenLkm/laakareidenLkm));
		
		// Exercise 7
		int forms = 8, formsPerPatient=3;
		int qtyNewPatients = forms/formsPerPatient;
		System.out.println("The hospital can still take " + qtyNewPatients + " patients");
		System.out.println("Remaining forms: " + forms%formsPerPatient);  //Using the modulo operator to calculate this one
	}
}
