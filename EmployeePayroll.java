import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayroll{
	public static ArrayList<String> employeeRoll = new ArrayList<>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of employees: ");
		int employees = input.nextInt();
			
		boolean payroll = true;

		while(payroll == true) {
		System.out.println("""

		Welcome to Semicolon Employees Payroll

		1. Add Employee Payroll
		2. View Employees Payroll
		3. Update Employee Payroll
		4. Exit

		""");
		System.out.print("Enter input(1-4): ");
		int choice = input.nextInt();
		switch(choice) {
			case 1:
				System.out.print("Enter Employee Name: ");
				String name = input.next().toLowerCase();
				System.out.print("Enter number of hours worked in a week: ");
				double hour = input.nextDouble();
				while(hour <= 0 || hour > 40 ) {
					System.out.print("invalid number of work hours");
					System.out.print("Do you wish to continue or go to menu (yes/no): ");
					String prompt = input.next();
					if(prompt == "no" ) {
						break;
					}else{
						System.out.print("Enter number of hours worked in a week: ");
						hour = input.nextDouble();
					}
				}
				System.out.print("Enter hourly pay rate: ");
				double rate = input.nextDouble();
				System.out.print("Enter federal tax withholding rate: ");
				double federal = input.nextDouble();
				System.out.print("Enter state tax withholding rate: ");
				double state = input.nextDouble();
				double grossPay = hour * rate;
				double deduction = federal + state; 
				double totalDeduction = deduction * 100 / grossPay;
				double netPay = grossPay - deduction;
				employeeRoll.add(String.format("Employee name: %s,\nHours Worked: %.2f,\nPay rate: %.2f,\nGross Pay: %.2f,\nDeductions: %n,\tFederal withholding(20.0%): %.2f,\n\tState withholding(9.0%): %.2f,\n\tTotal Deduction: %.2f,\nNet Pay: %.2f,\n", name, hour, rate, grossPay, deduction, federal, state, totalDeduction, netPay));
				System.out.println("\n	Employee payroll added ========>");
				break;
			case 2:
				System.out.print(employeeRoll);
				break;
			case 3:
				System.out.print("Enter employee name: ");
				name = input.next().toLowerCase();
				System.out.print("Enter number of hours worked in a week: ");
				hour = input.nextDouble();			
				System.out.print("Enter hourly pay rate: ");
				rate = input.nextDouble();	
				System.out.print("Enter federal tax withholding rate: ");
				federal = input.nextDouble();	
				System.out.print("Enter state tax withholding rate: ");
				state = input.nextDouble();
				grossPay = hour * rate;
				deduction = federal + state; 
				totalDeduction = deduction * 100 / grossPay;
				netPay = grossPay - deduction;
				employeeRoll.add(String.format("Employee name: %s%n,Hours Worked: %.2f%n", name, hour));

				System.out.println("\n	Employee payroll updated ========>");

			break;	
			case 4: payroll = false;
				break;
			default: System.out.print("Invalid input. Try again");
		}	

		}
	}
}