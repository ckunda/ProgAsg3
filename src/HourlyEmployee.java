
public class HourlyEmployee extends Employee {

	private float hours;
	private float rate;

	public HourlyEmployee() {
		super();
		hours = 0f;
		rate = 0f;
	}
	
	public HourlyEmployee(EmployeeRecord er, float hrs, float ratep) {
		super(er);
		hours = hrs;
		rate = ratep;
	}

	public HourlyEmployee(int eID, char eType, String lName,
			String fName, float hrs, float ratep) {
		super(eID, eType, lName, fName);
		hours = hrs;
		rate = ratep;
	}
	
	public HourlyEmployee(HourlyEmployee e) {
		super(e.e);
		hours = e.getHours();
		rate = e.getRate();
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public void calcGross() {
		// Calculate Regular + Overtime Pay
		if (hours > 40.00f) {
			e.grossPay = rate * 40.00f;
			e.grossPay += 1.50f * rate * (hours - 40.00f);
		}
		// Calculate Regular Pay
		else {
			e.grossPay = rate * hours;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HourlyEmployee [hours=");
		builder.append(hours);
		builder.append(", rate=");
		builder.append(rate);
		builder.append("]");
		return builder.toString();
	}
}
