package assignment11;

import java.text.NumberFormat;

public class EmployeeClient5 {

	public static void main(String[] args) {
		Janitor Jeffry = new Janitor();
		HarvardLawyer Derrick = new HarvardLawyer();
	

		System.out.println ("The janitor works for "+Jeffry.showHours()+" hours/wk. \n"
				+ "Has income of " + NumberFormat.getCurrencyInstance().format(Jeffry.showSalary()) + ". \n"
						+ "Has vacation days of "+Jeffry.showVacationDays()+" days per year. \n"
								+ "Janitor motto : \""+Jeffry.clean()+"\"");
		
		System.out.println("");
		
		System.out.println ("The Harvard lawyer works for "+Derrick.showHours()+" hours/wk. \n"
				+ "Has income of "+ NumberFormat.getCurrencyInstance().format(Derrick.showSalary()) +". \n"
						+ "Has vacation days of "+Derrick.showVacationDays()+" days per year. \n" 
								+ "Use " + Derrick.getVacationForm() + " form to go on vacation!"
								);

	}
}
