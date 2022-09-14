import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    double n1 = 0, n2 = 0, ans = 0;
    int calculation;

    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");

    Calculator() {
        prepareGui();
        addComponents();
        addActionEvent();
    }

    public void prepareGui() {
        frame.setSize(305, 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.blue);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.blue);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.blue);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFocusable(false);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFocusable(false);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFocusable(false);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFocusable(false);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFocusable(false);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFocusable(false);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFocusable(false);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFocusable(false);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFocusable(false);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFocusable(false);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFocusable(false);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFocusable(false);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(0, 180, 0));
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFocusable(false);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFocusable(false);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFocusable(false);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFocusable(false);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFocusable(false);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFocusable(false);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFocusable(false);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFocusable(false);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFocusable(false);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);
    }

    public void addActionEvent() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }

    public static void main(String[] args) {
        Calculator calcu = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if (object == onRadioButton) {
            enable();
        } else if (object == offRadioButton) {
            disable();
        } else if (object == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (object == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith(""))
                ;
            label.setText("");
        } else if (object == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + ("0"));
            }
        } else if (object == buttonOne) {
            textField.setText(textField.getText() + ("1"));
        } else if (object == buttonThree) {
            textField.setText(textField.getText() + ("3"));
        } else if (object == buttonTwo) {
            textField.setText(textField.getText() + ("2"));
        } else if (object == buttonFour) {
            textField.setText(textField.getText() + ("4"));
        } else if (object == buttonFive) {
            textField.setText(textField.getText() + ("5"));
        } else if (object == buttonSix) {
            textField.setText(textField.getText() + ("6"));
        } else if (object == buttonSeven) {
            textField.setText(textField.getText() + ("7"));
        } else if (object == buttonEight) {
            textField.setText(textField.getText() + ("8"));
        } else if (object == buttonNine) {
            textField.setText(textField.getText() + ("9"));
        } else if (object == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (object == buttonPlus) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        } else if (object == buttonMinus) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        } else if (object == buttonMul) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "X");
        } else if (object == buttonDiv) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        } else if (object == buttonSquare) {
            n1 = Double.parseDouble(textField.getText());
            double square = Math.pow(n1, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText((string.replace(".0", "")));
            } else {
                textField.setText(string);
            }
        } else if (object == buttonSqrt) {
            n1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(n1);
            textField.setText(Double.toString(sqrt));
        } else if (object == buttonReciprocal) {
            n1 = Double.parseDouble(textField.getText());
            double resiprocal = 1 / n1;
            String string = Double.toString(resiprocal);
            if (string.endsWith(".0")) {
                textField.setText((string.replace(".0", "")));
            } else {
                textField.setText(string);
            }
        } else if (object == buttonEqual) {
            n2 = Double.parseDouble(textField.getText());
            switch (calculation) {
                case 1:
                    ans = n1 + n2;
                    break;
                case 2:
                    ans = n1 - n2;
                    break;
                case 3:
                    ans = n1 * n2;
                    break;
                case 4:
                    ans = n1 / n2;
                    break;

            }
            if (Double.toString(ans).endsWith(".0")) {
                textField.setText(Double.toString(ans).replace(".0", ""));
            } else {
                textField.setText(Double.toString(ans));
            }
            label.setText("");
            n1 = ans;
        }
    }

    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);

    }

    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        label.setText("");
        textField.setText("");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }
}
