/**
 * Piece Work Employee Class
 * @author ckunda
 *
 */
public class PieceEmployee extends Employee {

	private float pieces;
	private float rate;
/**
 * Default constructor
 */
	public PieceEmployee() {
		super();
		pieces = 0f;
		rate = 0f;
	}
/**
 * Parameterized constructor
 * @param er Employee Record
 * @param pcs Pieces 
 * @param ratep Rate per piece
 */
	public PieceEmployee(EmployeeRecord er, float pcs, float ratep) {
		super(er);
		pieces = pcs;
		rate = ratep;
	}
/**
 * Parameterized constructor
 * @param eID Employee ID
 * @param eType Employee Type
 * @param lName Last Name
 * @param fName First Name
 * @param pcs Pieces
 * @param ratep Rate per piece
 */
	public PieceEmployee(int eID, char eType, String lName,
			String fName, float pcs, float ratep) {
		super(eID, eType, lName, fName);
		pieces = pcs;
		rate = ratep;
	}
/**
 * Copy constructor
 * @param e Employee Object
 */
	public PieceEmployee(PieceEmployee e) {
		super(e.e);
		pieces = e.getPieces();
		rate = e.getRate();
	}

	public float getPieces() {
		return pieces;
	}

	public void setPieces(float pieces) {
		this.pieces = pieces;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public void calcGross() {
		e.grossPay = pieces * rate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PieceEmployee [pieces=");
		builder.append(pieces);
		builder.append(", rate=");
		builder.append(rate);
		builder.append("]");
		return builder.toString();
	}

}
