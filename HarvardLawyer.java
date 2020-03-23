package assignment11;

public class HarvardLawyer extends Lawyer {
	public double showSalary() {
		return super.salary + (super.salary * 0.2);
	}

	public int showVacationDays() {
		Lawyer lawyerVacation = new Lawyer();
		int harvardLawyerVacation = lawyerVacation.showVacationDays() + 3;
		return harvardLawyerVacation;

	}
	
	public String getVacationForm() {
		return "pinkpinkpinkpink";
	}
	
}
