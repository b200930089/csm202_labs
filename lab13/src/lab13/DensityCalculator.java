package lab13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DensityCalculator extends JFrame {
	private JTextField massField, volumeField, resultField;
    private JComboBox<String> massUnits, volumeUnits, densityUnits;
	private JTextArea answerArea;
	
	public DensityCalculator() {
		setTitle("Density Calculator");
		setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));
        
        JPanel topPanel = new JPanel(new GridLayout(2,1));
        JLabel titleLabel = new JLabel("Density Calculator", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        JLabel formulaLabel = new JLabel("p = m / V", JLabel.CENTER);
        formulaLabel.setFont(new Font("Serif", Font.ITALIC, 20));
        topPanel.add(titleLabel);
        topPanel.add(formulaLabel);
        add(topPanel, BorderLayout.NORTH);
        
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.gridx = 0; gbc.gridy = 0; centerPanel.add(new JLabel("density p ="), gbc);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        gbc.gridx = 1; centerPanel.add(resultField, gbc);
        String[] dUnits = {"g/cm³", "kg/m³", "lb/ft³"};
        densityUnits = new JComboBox<>(dUnits);
        gbc.gridx = 2; centerPanel.add(densityUnits, gbc);
        
        gbc.gridx = 0; gbc.gridy = 1; centerPanel.add(new JLabel("mass m ="), gbc);
        gbc.gridx = 1; centerPanel.add(massField, gbc);
        String[] mUnits = {"g", "kg", "lb"};
        massUnits = new JComboBox<>(mUnits);
        gbc.gridx = 2; centerPanel.add(massUnits, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2; centerPanel.add(new JLabel("volume V ="), gbc);
        volumeField = new JTextField(10);
        gbc.gridx = 1; centerPanel.add(volumeField, gbc);
        String[] vUnits = {"cm^3", "m^3", "ft^3"};
        volumeUnits = new JComboBox<>(vUnits);
        gbc.gridx = 2; centerPanel.add(volumeUnits, gbc);
        
        add(centerPanel, BorderLayout.CENTER);
        
        JPanel bottomPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        JButton btnClear  = new JButton("Clear");
        JButton btnCalculate = new JButton("Calculate");
        buttonPanel.add(btnClear);
        buttonPanel.add(btnCalculate);
        
        answerArea = new JTextArea();
        answerArea.setEditable(false);
        answerArea.setBorder(BorderFactory.createTitledBorder("Answer: "));
        
        bottomPanel.add(buttonPanel, BorderLayout.NORTH);
        bottomPanel.add(new JScrollPane(answerArea), BorderLayout.SOUTH);
        add(bottomPanel, BorderLayout.SOUTH);
        
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String mStr = massField.getText();
                    String vStr = volumeField.getText();

                    if (mStr.isEmpty() || vStr.isEmpty()) {
                        throw new Exception("Масс болон эзлэхүүнийг оруулна уу!");
                    }

                    double mass = Double.parseDouble(mStr);
                    double volume = Double.parseDouble(vStr);

                    if (volume == 0) {
                        throw new ArithmeticException("Эзлэхүүн 0 байж болохгүй (0-д хуваах боломжгүй)!");
                    }
                    
                    if (mass < 0 || volume < 0) {
                        throw new Exception("Масс болон эзлэхүүн сөрөг утга байж болохгүй!");
                    }

                    double density = mass / volume;
                    
                    String unitLabel = densityUnits.getSelectedItem().toString();
                    resultField.setText(String.format("%.4f", density));
                    answerArea.setText("Тооцоолсон нягт: " + String.format("%.4f", density) + " " + unitLabel);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, 
                        "Алдаа: Зөвхөн тоон утга оруулна уу!", 
                        "Оролтын алдаа", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, 
                        ex.getMessage(), 
                        "Тооны алдаа", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, 
                        ex.getMessage(), 
                        "Алдаа", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btnClear.addActionListener(e -> {
            massField.setText("");
            volumeField.setText("");
            resultField.setText("");
            answerArea.setText("");
        });

        setLocationRelativeTo(null); 
    }
        
}

