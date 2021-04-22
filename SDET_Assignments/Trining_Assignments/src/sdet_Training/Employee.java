package sdet_Training;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends EmployeeDetails implements EmployeeInterface {
	
	private static ArrayList<EmployeeModel> empList = new ArrayList<EmployeeModel>();
	private static int id;
	private static boolean empFound = false;

	public static void main(String[] args) {
		addEmployee();
		addEmployeeToIndex();
		try {
			retrieveEmployee();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void addEmployeeToIndex() {
		empList.add(2, new EmployeeModel(3000, "Madhu", 2000000));
        System.out.println("\nAfter addition");
		Employee emp = new Employee();
		emp.printEmployeesDetails(empList);
	}

	private static void retrieveEmployee() throws Exception {
		Scanner input = new Scanner(System.in);
        System.out.println("\nEnter employee id to find an employee");
        id = input.nextInt();
        
        Employee emp = new Employee();
        boolean found = emp.findEmployee(id);
        input.close();
        
        if(!found) {
        	throw new Exception("Given Employee Details Not Found");
        }
        
	}

	private static void addEmployee() {
		empList.add(new EmployeeModel(1001, "Jagan", 1000000));
		empList.add(new EmployeeModel(2002, "Ravi", 1500000));

		Employee emp = new Employee();
		emp.printEmployeesDetails(empList);
	}

	@Override
	void printEmployeesDetails(ArrayList<EmployeeModel> empModelList) {
		for(EmployeeModel model : empModelList) {
	        System.out.println("Employee : " + model.getEmpId() + " " + model.getName() + " " + model.getSalary());
		}
	}

	@Override
	public boolean findEmployee(int id) {
		
        for(EmployeeModel model : empList) {
        	if(model.getEmpId() == id) {
        		empFound = true;
	        System.out.println("Employee Found : " + model.getEmpId() + " " + model.getName() + " " + model.getSalary());
	        break;
        	}
		}     
       
		return empFound;    
	}
}