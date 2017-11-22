/**
 * Employee Record Class
 * @author Chakra Kunda
 *
 */
public class EmployeeRecord {
	
	public int empID;
	public char empType;
	public String lastName;
	public String firstName;
	public float grossPay;
	public float fedTax;
	public float netPay;
	/**
	 * Default constructor
	 */
	public EmployeeRecord() {
		empID = 0;
		empType = ' ';
		lastName = "";
		firstName = "";
		grossPay = 0;
		fedTax = 0;
		netPay = 0;
	}
	/**
	 * Parameterized constructor
	 * @param eID Employee ID
	 * @param lName Last Name
	 * @param fName First Name
	 */
	public EmployeeRecord(int eID, char eType, String lName, String fName) {
		empID = eID;
		empType = eType;
		lastName = lName;
		firstName = fName;
		grossPay = 0;
		fedTax = 0;
		netPay = 0;
	}
	/**
	 * Clone constructor
	 * @param er Employee Record to clone
	 */
	public EmployeeRecord(EmployeeRecord er) {
		empID = er.empID;
		empType = er.empType;
		lastName = er.lastName;
		firstName = er.firstName;
		grossPay = er.grossPay;
		fedTax = er.fedTax;
		netPay = er.netPay;		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeRecord [empID=");
		builder.append(empID);
		builder.append(", empType=");
		builder.append(empType);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", grossPay=");
		builder.append(grossPay);
		builder.append(", fedTax=");
		builder.append(fedTax);
		builder.append(", netPay=");
		builder.append(netPay);
		builder.append("]");
		return builder.toString();
	}
}
