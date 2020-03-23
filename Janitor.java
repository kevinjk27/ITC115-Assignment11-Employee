package assignment11;

import java.text.NumberFormat;

public class Janitor extends Employee {

	@Override
	public int showHours() {
		return super.workingHours * 2;

	}

	@Override
	public double showSalary() {
		return super.salary - 10000.00;
	}

	@Override
	public int showVacationDays() {
		return super.vacationDays / 2;
	}

	public String clean() {
		return "Workin' for the man.";
	}
	
	
	public String showSalaryFormatted() {
		String salaryFormatted = NumberFormat.getCurrencyInstance().format(super.salary - 10000.00);
		return salaryFormatted;
	}


}
