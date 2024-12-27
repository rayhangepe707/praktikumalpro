package UAS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachineApp extends JFrame {
    private JLabel totalLabel;
    private JTextArea receiptArea;
    private double total = 0.0;

    public VendingMachineApp() {
        setTitle("Vending Machine");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel for Title
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Welcome to Vending Machine");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        // Center Panel for Product Buttons
        JPanel productPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        String[] products = {"Teh Gelas - $2.00", "Kopikap - $1.50", "Ale Ale - $1.50", "Le Minerale - $3.50", "Ayia - $1.00", "Mount Tea - $2.00"};
        double[] prices = {2.00, 1.50, 1.00, 2.50, 1.00, 2.00};

        for (int i = 0; i < products.length; i++) {
            String product = products[i];
            double price = prices[i];
            JButton productButton = new JButton(product);
            productButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    total += price;
                    receiptArea.append(product + "\n");
                    updateTotal();
                }
            });
            productPanel.add(productButton);
        }

        add(productPanel, BorderLayout.CENTER);

        // Bottom Panel for Receipt and Controls
        JPanel bottomPanel = new JPanel(new BorderLayout());

        // Receipt Area
        receiptArea = new JTextArea(10, 30);
        receiptArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(receiptArea);
        bottomPanel.add(scrollPane, BorderLayout.CENTER);

        // Controls
        JPanel controlPanel = new JPanel(new FlowLayout());
        totalLabel = new JLabel("Total: $0.00");
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = 0.0;
                receiptArea.setText("");
                updateTotal();
            }
        });

        JButton payButton = new JButton("Pay");
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (total > 0) {
                    JOptionPane.showMessageDialog(null, "Thank you for your purchase!\nTotal: $" + String.format("%.2f", total));
                    total = 0.0;
                    receiptArea.setText("");
                    updateTotal();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select an item before paying.");
                }
            }
        });

        controlPanel.add(totalLabel);
        controlPanel.add(clearButton);
        controlPanel.add(payButton);
        bottomPanel.add(controlPanel, BorderLayout.SOUTH);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void updateTotal() {
        totalLabel.setText("Total: $" + String.format("%.2f", total));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VendingMachineApp app = new VendingMachineApp();
            app.setVisible(true);
        });
    }
}
