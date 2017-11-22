import java.util.ArrayList;
import java.util.Comparator;
/**
 * Employees Class
 * @author Chakra Kunda
 *
 */
public class Employees {

	ArrayList<Employee> emps;
	final int START = 0;
	int empIter = 0;
	/**
	 * Parameterized constructor
	 * @param eID Employee ID
	 * @param lName Last Name
	 * @param fName First Name
	 * @param h Hours
	 * @param pr Pay Rate
	 */
	/**
	 * Default constructor
	 */
	public Employees() {
		emps = new ArrayList<Employee>();
	}
	public Employees(int eID, char eType, String lName, String fName,
			float h, float pr) {
		emps = new ArrayList<Employee>();
		Employee e = null;
		switch (eType) {
		case 'H':
			e = new HourlyEmployee(eID, eType, lName, fName, h, pr);
			break;
		case 'P':
			e = new SalariedEmployee(eID, eType, lName, fName, h, pr);
			break;
		case 'S':
			e = new PieceEmployee(eID, eType, lName, fName, h, pr);
			break;
		}
		emps.add(e);
	}
	/**
	 * Parameterized constructor
	 * @param er Employee Record
	 */
	public Employees(EmployeeRecord er, float h, float pr) {
		emps = new ArrayList<Employee>();
		Employee e = null;
		switch (er.empType) {
		case 'H':
			e = new HourlyEmployee(er, h, pr);
			break;
		case 'S':
			e = new SalariedEmployee(er, h, pr);
			break;
		case 'P':
			e = new PieceEmployee(er, h, pr);
			break;
		}
		emps.add(e);	
	}
	/**
	 * Parameterized constructor
	 * @param e Employee
	 */
	public Employees(Employee e) {
		emps = new ArrayList<Employee>();
		emps.add(e);
	}
	/**
	 * Overloaded add method adds an employee
	 * @param eID Employee ID
	 * @param lName Last Name
	 * @param fName First Name
	 * @param h Hours
	 * @param pr Pay Rate 
	 * @param defr ???
	 */
	public void add(int eID, char eType, String lName, String fName,
			float h, float pr) {
		Employee e = null;
		switch (eType) {
		case 'H':
			e = new HourlyEmployee(eID, eType, lName, fName, h, pr);
			break;
		case 'S':
			e = new SalariedEmployee(eID, eType, lName, fName, h, pr);
			break;
		case 'P':
			e = new PieceEmployee(eID, eType, lName, fName, h, pr);
			break;
		}
		emps.add(e);
	}
	/**
	 * Overloaded add method adds an employee
	 * @param er Employee Record
	 */
	public void add(EmployeeRecord er, float h, float pr) {
		Employee e = null;
		switch (er.empType) {
		case 'H':
			e = new HourlyEmployee(er, h, pr);
			break;
		case 'P':
			e = new SalariedEmployee(er, h, pr);
			break;
		case 'S':
			e = new PieceEmployee(er, h, pr);
			break;
		}
		emps.add(e);	
	}
	/**
	 * Overloaded add method adds an employee
	 * @param e Employee
	 */
	public void add(Employee e) {
		emps.add(e);
	}
	/**
	 * Overloaded delete method removes an employee
	 * @param lName Last Name
	 */
	public void delete(String lName) {
		
		// Return if list is empty
		if (emps.isEmpty()) return;

		// Loop thru the list to find the employee and remove it
		int i = 0;
		while (i < emps.size()) {
			if (emps.get(i).e.lastName.toUpperCase().equals(lName.toUpperCase())) {
				emps.remove(i);
			}
			i++;
		}
	}
	/**
	 * Overloaded delete method removes an employee
	 * @param eID Employee ID
	 */
	public void delete(int eID) {
		
		// Return if list is empty
		if (emps.isEmpty()) return;
		
		// Loop thru the list to find the employee and remove it
		int i = 0;
		while (i < emps.size()) {
			if (emps.get(i).e.empID == eID) {
				emps.remove(i);
			}
			i++;
		}		
	}
	/** 
	 * Overloaded search method
	 * @param lName Last Name
	 * @return Index
	 */
	public int search(String lName) {
		
		// Return null if list is empty
		if (emps.isEmpty()) return -1;

		// Loop thru the list to find the employee and return it
		int i = 0;
		while (i < emps.size()) {
			if (emps.get(i).e.lastName.compareToIgnoreCase(lName) == 0) {
				return i;
			}
			i++;
		}
		return -1;
	}
	/**
	 * Overloaded search method
	 * @param eID Employee ID
	 * @return Index
	 */
	public int search(int eID) {
		
		// Return null if list is empty
		if (emps.isEmpty()) return -1;

		// Loop thru the list to find the employee and return it
		int i = 0;
		while (i < emps.size()) {
			if (emps.get(i).e.empID == eID) {
				return i;
			}
			i++;
		}		
		return -1;
	}
	/**
	 * Sorts employees on employee type and last name
	 */
	public void sort() {
		emps.sort(Comparator.comparing(Employee::getKey));
	}
	/**
	 * Start iteration by resetting the cursor to starting position
	 */
	public void start() {
		// Set the cursor to the first employee record
		empIter = START;
	}
	/**
	 * Are there more Employees?
	 * @return boolean Yes/No 
	 */
	public boolean hasNext() {
		if (empIter < emps.size()) return true;
		return false;
	}
	/**
	 * Get next employee record from the cursor position
	 * @return Employee Record
	 */
	public int getNext() {
		// Return employee if not at end of list
		if (empIter < emps.size())
			return empIter++;		
		else
			return -1;
	}
	public Employee getEmployee(int i) {
		return emps.get(i);
	}
	/**
	 * Returns a printable state of the Employees
	 */

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employees [emps=");
		builder.append(emps);
		builder.append("]");
		return builder.toString();
	}
}
