/**
 * Employee Class
 * @author Chakra Kunda
 *
 */
public abstract class Employee {

	protected EmployeeRecord e;
	
	/**
	 * Default constructor
	 */
	public Employee() {
		e = new EmployeeRecord();
	}
	/**
	 * Parameterized constructor
	 * @param eID Employee ID
	 * @param lName Last Name
	 * @param fName First Name
	 * @param h Hours
	 * @param pr Pay Rate
	 */
	public Employee(int eID, char eType, String lName, String fName) {
		e = new EmployeeRecord(eID, eType, lName, fName);
	}
	/**
	 * Copy constructor
	 * @param er Employee Record
	 */
	public Employee(EmployeeRecord er) {
		e = new EmployeeRecord(er);
	}
	/**
	 * Calculate Gross Pay with overtime
	 */
	public abstract void calcGross();
	
	/**
	 * Calculate Taxes
	 */
	public void calcTax() {
		e.fedTax = e.grossPay * .15f;
	}
	/**
	 * Calculate Net Pay = Gross Pay - all Taxes
	 */
	public void calcNet() {
		e.netPay = e.grossPay - e.fedTax;
	}
	/**
	 * Returns Last Name
	 * @return Last Name
	 */
	public String getLastName() {
		return e.lastName;
	}
	
	public String getKey() {
		return e.empType + e.lastName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [e=");
		builder.append(e);
		builder.append("]");
		return builder.toString();
	}
}
