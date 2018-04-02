

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String a =JOptionPane.showInputDialog("First Number equals");
int a1 = Integer.parseInt(a);
String b =JOptionPane.showInputDialog("Second Number equals");
int b1 = Integer.parseInt(b);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if(operation==0) JOptionPane.showMessageDialog(null, a1 + "+" + b1 + "=" + add( a1, b1));
if(operation== 1) JOptionPane.showMessageDialog(null, a1 + "-" + b1 + "=" +subtract(a1, b1));
if(operation== 2) JOptionPane.showMessageDialog(null, a1 + "x" + b1 + "=" +multiply(a1, b1));
if(operation== 3) JOptionPane.showMessageDialog(null,a1 + "/" + b1 + "=" +div(a1, b1));
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static int add(int num1, int num2) {
	return num1+num2;
}
static int subtract(int num1, int num2) {
	return num1-num2;
}
static int multiply(int num1, int num2) {
	return num1*num2; 
}
static int div(int num1, int num2) {
	return num1/num2;
}
	// 4. Create similar methods for subtraction, multiplication and division.

}