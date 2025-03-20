import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your second number"));

        String choice;
        while (true) {
            String op = "Select an Operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division";
            choice = JOptionPane.showInputDialog(op);

            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Your choice is Invalid. Please Try Again.");
            }
        }
        double result = 0;

        switch (choice) {
            case "1":
                result = num1 + num2;
                break;
            case "2":
                result = num1 - num2;
                break;
            case "3":
                result = num1 * num2;
                break;
            case "4":
                if (num2 !=0) {
                    result = (double) num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null,"INVALID.");
                    return;
                }
                break;
        }
        JOptionPane.showMessageDialog(null, "The Answer is "+ result);
    }
}

