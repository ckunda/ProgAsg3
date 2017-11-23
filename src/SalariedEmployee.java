/**
 * Salaried Employee Class 
 * @author ckunda
 *
 */
public class SalariedEmployee extends Employee {

	private float salary;
/**
 * Default Constructor
 */
	public SalariedEmployee() {
		super();
		salary = 0f;
	}
/**
 * Parameterized Constructor
 * @param er Employee Record
 * @param sal Salary
 */
	public SalariedEmployee(EmployeeRecord er, float sal) {
		super(er);
		salary = sal;
	}
/**
 * Parameterized Constructor
 * @param eID Employee ID
 * @param eType Employee Type
 * @param lName Last Name
 * @param fName First Name
 * @param sal Salary
 */
	public SalariedEmployee(int eID, char eType, String lName,
			String fName, float sal) {
		super(eID, eType, lName, fName);
		salary = sal;
	}
/**
 * Copy Constructor
 * @param e Employee object
 */
	public SalariedEmployee(SalariedEmployee e) {
		super(e.e);
		salary = e.getSalary();
	}
/**
 * Get Salary
 * @return
 */
	public float getSalary() {
		return salary;
	}
/** 
 * Set Salary
 * @param salary
 */
	public void setHours(float salary) {
		this.salary = salary;
	}
/**
 * Calculate Gross Pay
 */
	@Override
	public void calcGross() {
		e.grossPay = salary;
	}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("SalariedEmployee [salary=");
	builder.append(salary);
	builder.append(", e=");
	builder.append(e);
	builder.append("]");
	return builder.toString();
}
}
