public class Calculator2 {
//	declare two operands, two operators, and a total; also declare booleans for if they contain something
	private double operand1;
	private double operand2;
	private String operator1;
	private String operator2;
	private double total;
	private final boolean operand1Set = false;
	private final boolean operand2Set = false;
	private final boolean operator1Set = false;
	private final boolean operator2Set = false;
	private final boolean totalSet;

   public Calculator2() {
	}
   
If a double is entered:
	public void performOperation(double operand) {
//		if operand1 is not set - set it to the entered operand and mark that operand1 has been set
		if (!this.operand1Set) {
			this.operand1 = operand;
			this.operand1Set = true;
