import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator extends JFrame{
    private JPanel frame;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txtRes;
    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnMul;
    private JButton btnDiv;
    private JLabel lblEntNum1;
    private JLabel lblEntNum2;
    private JLabel lblRes;
    private JButton btnClr;

    DecimalFormat df = new DecimalFormat("0.00");

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    //make a constructor
    public Calculator(){
        setContentPane(frame);
        setTitle("Calculator");
        setSize(400,250);
        setVisible(true);
        frame.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /**All action listeners must be declared in the constructor of the program*/

        /**This method runs when the button is clicked. It gets the number in the text fields and adds it.
         Displays the results in txtRes (textfields for results)*/
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txt1.getText());
                double num2 = Double.parseDouble(txt2.getText());

                double answer = num1 + num2;

                txtRes.setText(String.valueOf(df.format(answer)));
            }
        });

        /**This method runs when the button is clicked. It gets the number in the text fields and subtracts it.
         Displays the results in txtRes (textfields for results)*/
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txt1.getText());
                double num2 = Double.parseDouble(txt2.getText());

                double answer = num1 - num2;

                txtRes.setText(String.valueOf(df.format(answer)));
            }
        });

        /**This method runs when the button is clicked. It gets the number in the text fields and multiplies it.
         Displays the results in txtRes (textfields for results)*/
        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txt1.getText());
                double num2 = Double.parseDouble(txt2.getText());

                double answer = num1 * num2;

                txtRes.setText(String.valueOf(df.format(answer)));
            }
        });

        /**This method runs when the button is clicked. It gets the number in the text fields and divides it.
         Displays the results in txtRes (textfields for results)*/
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txt1.getText());
                double num2 = Double.parseDouble(txt2.getText());

                double quo = num1 / num2;
                double rem = num1 % num2;
                double answer = quo + rem;

                txtRes.setText(String.valueOf(df.format(answer)));
            }
        });

        /**This method erases the all textfields' contents when clicked*/
        btnClr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("");
                txt2.setText("");;
                txtRes.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
    }
}
