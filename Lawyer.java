package assignment11;

public class Lawyer extends Employee {
	

	@Override
	public int showHours() {
		return super.workingHours;

	}

	@Override
	public double showSalary() {
		return super.salary;
	}

	@Override
	public int showVacationDays() {
		int lawyerVacationDays = super.vacationDays + 5;
		return lawyerVacationDays;
	}
	

	public String getVacationForm() {
		return "pink";
	}
}