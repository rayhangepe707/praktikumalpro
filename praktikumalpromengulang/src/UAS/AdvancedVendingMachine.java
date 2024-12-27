package UAS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedVendingMachine extends JFrame {
    private JComboBox<String> productComboBox;
    private JTextField quantityField;
    private JTextArea receiptArea;
    private JLabel totalLabel;
    private JButton addButton, clearButton, payButton;

    private String[] products = {"Chips", "Soda", "Candy", "Juice", "Water", "Chocolate"};
    private double[] prices = {2.00, 1.50, 1.00, 2.50, 1.00, 2.00};
    private double total = 0.0;

    public AdvancedVendingMachine() {
        setTitle("Advanced Vending Machine");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Title Panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Advanced Vending Machine");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.add(new JLabel("Product:"));

        productComboBox = new JComboBox<>(products);
        inputPanel.add(productComboBox);

        inputPanel.add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        inputPanel.add(quantityField);

        add(inputPanel, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Add");
        clearButton = new JButton("Clear");
        payButton = new JButton("Pay");

        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(payButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Receipt and Total Panel
        JPanel receiptPanel = new JPanel(new BorderLayout());
        receiptArea = new JTextArea(10, 30);
        receiptArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(receiptArea);

        totalLabel = new JLabel("Total: $0.00");
        receiptPanel.add(scrollPane, BorderLayout.CENTER);
        receiptPanel.add(totalLabel, BorderLayout.SOUTH);

        add(receiptPanel, BorderLayout.EAST);

        // Action Listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAddAction();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleClearAction();
            }
        });

        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handlePayAction();
            }
        });
    }

    private void handleAddAction() {
        try {
            String product = (String) productComboBox.getSelectedItem();
            int quantity = Integer.parseInt(quantityField.getText());

            // Nested if-else to validate quantity
            if (quantity <= 0) {
                JOptionPane.showMessageDialog(this, "Quantity must be greater than zero.");
                return;
            }

            double price = 0;
            for (int i = 0; i < products.length; i++) {
                if (products[i].equals(product)) {
                    price = prices[i];
                    break;
                }
            }

            double itemTotal = price * quantity;
            total += itemTotal;

            receiptArea.append(product + " x " + quantity + " = $" + String.format("%.2f", itemTotal) + "\n");
            updateTotal();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
        }
    }

    private void handleClearAction() {
        total = 0.0;
        receiptArea.setText("");
        quantityField.setText("");
        updateTotal();
    }

    private void handlePayAction() {
        if (total > 0) {
            JOptionPane.showMessageDialog(this, "Thank you for your purchase!\nTotal: $" + String.format("%.2f", total));
            handleClearAction();
        } else {
            JOptionPane.showMessageDialog(this, "No items selected.");
        }
    }

    private void updateTotal() {
        totalLabel.setText("Total: $" + String.format("%.2f", total));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdvancedVendingMachine app = new AdvancedVendingMachine();
            app.setVisible(true);
        });
    }
}
