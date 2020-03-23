package assignment11;

public abstract class Employee {

	int workingHours = 40;
	double salary = 40000.00;
	int vacationDays = 10;
	
	public abstract int showHours();
	public abstract double showSalary();
	public abstract int showVacationDays();
	
	public String getVacationForm() {
		return "yellow";
	}
}
