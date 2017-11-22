/**
 * Salaried Employee Class 
 * @author ckunda
 *
 */
public class SalariedEmployee extends Employee {

	private float hours;
	private float rate;
/**
 * Default Constructor
 */
	public SalariedEmployee() {
		super();
		hours = 0f;
		rate = 0f;
	}
/**
 * Parameterized Constructor
 * @param er Employee Record
 * @param hrs Hours
 * @param ratep Pay Rate
 */
	public SalariedEmployee(EmployeeRecord er, float hrs, float ratep) {
		super(er);
		hours = hrs;
		rate = ratep;
	}
/**
 * Parameterized Constructor
 * @param eID Employee ID
 * @param eType Employee Type
 * @param lName Last Name
 * @param fName First Name
 * @param hrs Hours 
 * @param ratep Pay Rate
 */
	public SalariedEmployee(int eID, char eType, String lName,
			String fName, float hrs, float ratep) {
		super(eID, eType, lName, fName);
		hours = hrs;
		rate = ratep;
	}
/**
 * Copy Constructor
 * @param e Employee object
 */
	public SalariedEmployee(SalariedEmployee e) {
		super(e.e);
		hours = e.getHours();
		rate = e.getRate();
	}
/**
 * Get Hours
 * @return
 */
	public float getHours() {
		return hours;
	}
/** 
 * Set Hours
 * @param hours
 */
	public void setHours(float hours) {
		this.hours = hours;
	}
/**
 * Get Pay Rate
 * @return
 */
	public float getRate() {
		return rate;
	}
/**
 * Set Pay Rate
 * @param rate
 */
	public void setRate(float rate) {
		this.rate = rate;
	}
/**
 * Calculate Gross Pay
 */
	@Override
	public void calcGross() {
		e.grossPay = hours * rate;
	}
/**
 * Return fields in printable format
 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalariedEmployee [hours=");
		builder.append(hours);
		builder.append(", rate=");
		builder.append(rate);
		builder.append("]");
		return builder.toString();
	}
}
