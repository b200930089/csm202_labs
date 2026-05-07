package lab12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField txtNum1, txtNum2;
    private JLabel lblResult;

    public Calculator() {
        setTitle("Тооны машин");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
        JLabel lbl1 = new JLabel("Нэгдүгээр операнд");
        lbl1.setBounds(20, 10, 150, 20);
        add(lbl1);

        txtNum1 = new JTextField();
        txtNum1.setBounds(20, 30, 145, 30);
        add(txtNum1);

        JLabel lbl2 = new JLabel("Хоёрдугаар операнд");
        lbl2.setBounds(180, 10, 150, 20);
        add(lbl2);

        txtNum2 = new JTextField();
        txtNum2.setBounds(180, 30, 145, 30);
        add(txtNum2);

        JButton btnAdd = new JButton("+");
        btnAdd.setBounds(20, 70, 70, 40);
        add(btnAdd);

        JButton btnSub = new JButton("-");
        btnSub.setBounds(95, 70, 70, 40);
        add(btnSub);

        JButton btnMul = new JButton("*");
        btnMul.setBounds(170, 70, 70, 40);
        add(btnMul);

        JButton btnDiv = new JButton("÷");
        btnDiv.setBounds(245, 70, 70, 40);
        add(btnDiv);

        lblResult = new JLabel("Хариу: ");
        lblResult.setBounds(20, 120, 305, 30);
        lblResult.setBorder(BorderFactory.createEtchedBorder());
        add(lblResult);

        btnAdd.addActionListener(e -> performCalculation('+'));
        btnSub.addActionListener(e -> performCalculation('-'));
        btnMul.addActionListener(e -> performCalculation('*'));
        btnDiv.addActionListener(e -> performCalculation('/'));

        setVisible(true);
    }

    private void performCalculation(char operator) {
        try {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            double result = 0;

            switch (operator) {
                case '+': result = add(n1, n2); break;
                case '-': result = subtract(n1, n2); break;
                case '*': result = multiply(n1, n2); break;
                case '/': 
                    if (n2 != 0) {
                        result = divide(n1, n2);
                    } else {
                        lblResult.setText("0-д хувааж болохгүй");
                        return;
                    }
                    break;
            }
            lblResult.setText("Хариу: " + result);
        } catch (NumberFormatException ex) {
            lblResult.setText("Тоо оруулна уу");
        }
    }

    private double add(double a, double b) { return a + b; }
    private double subtract(double a, double b) { return a - b; }
    private double multiply(double a, double b) { return a * b; }
    private double divide(double a, double b) { return a / b; }
}