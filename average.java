import javax.swing.JOptionPane;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number", "0"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number", "0"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number", "0"));
		
		int sum = num1 + num2 + num3;
		double aver = sum / 3;
		
		System.out.println("The average: " + aver);
	}

}
