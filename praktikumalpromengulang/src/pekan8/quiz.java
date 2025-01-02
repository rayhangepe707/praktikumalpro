package pekan8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class quiz {
    public static void main(String[] args) {
        // Frame Utama
        JFrame frame = new JFrame("Pilkada Padang");
        frame.setSize(400, 333);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Komponen Nama
        JLabel labelNama = new JLabel("Nama:");
        labelNama.setBounds(20, 20, 100, 30);
        labelNama.setFont(new Font("Tahoma", Font.BOLD, 16));
        frame.getContentPane().add(labelNama);

        JTextField fieldNama = new JTextField();
        fieldNama.setBounds(150, 20, 200, 30);
        frame.getContentPane().add(fieldNama);

        // Komponen NIK
        JLabel labelNIK = new JLabel("NIK:");
        labelNIK.setBounds(20, 60, 100, 30);
        labelNIK.setFont(new Font("Tahoma", Font.BOLD, 16));
        frame.getContentPane().add(labelNIK);

        JTextField fieldNIK = new JTextField();
        fieldNIK.setBounds(150, 60, 200, 30);
        frame.getContentPane().add(fieldNIK);

        // Komponen Pilihan
        JLabel labelPilihan = new JLabel("Pilihan:");
        labelPilihan.setBounds(20, 100, 100, 30);
        labelPilihan.setFont(new Font("Tahoma", Font.BOLD, 16));
        frame.getContentPane().add(labelPilihan);

        String[] pilihan = {"Pilih", "1. Fadli-Maigus", "2. Iqbal-Amasrul", "3. Hendri-Hidayat"};
        JComboBox<String> comboPilihan = new JComboBox<>(pilihan);
        comboPilihan.setBounds(150, 100, 200, 30);
        comboPilihan.setModel(new DefaultComboBoxModel(new String[] {"Pilih", "1. Fadli-Maigus", "2. Iqbal-Amasrul", "3. Hendri-Hidayat"}));
        frame.getContentPane().add(comboPilihan);

        // Tombol Konfirmasi
        JButton btnKonfirmasi = new JButton("Konfirmasi");
        btnKonfirmasi.setBounds(113, 150, 140, 30);
        btnKonfirmasi.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.getContentPane().add(btnKonfirmasi);

        // Area Output
        JTextArea outputArea = new JTextArea();
        outputArea.setBounds(20, 200, 350, 86);
        outputArea.setEditable(false);
        frame.getContentPane().add(outputArea);

        // Event Listener Tombol
        btnKonfirmasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = fieldNama.getText();
                String nik = fieldNIK.getText();
                String pilihan = (String) comboPilihan.getSelectedItem();

                if (nama.isEmpty() || nik.isEmpty() || pilihan.equals("Pilih")) {
                    outputArea.setText("Anda Belum Memilih"+"\nNama Anda: "+nama+"\nNIK: "+ nik);
                } else {
                    outputArea.setText("Nama Anda: " + nama + "\nNIK: " + nik + "\nPilihan Anda: " + pilihan +
                           "\n*Terimakasih Sudah Memilih*");
                }
            }
        });

        // Tampilkan Frame
        frame.setVisible(true);
    }
}