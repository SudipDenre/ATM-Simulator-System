package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7;
    String pinNumber;

    FastCash(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);

        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,17));
        text.setBounds(230, 70, 300, 200);
        image.add(text);

        b1 = new JButton("Rs.100"); 
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBounds(180, 230, 130, 24);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Rs.1000"); 
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBounds(180, 263, 130, 24);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Rs.5000"); 
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setBounds(180, 296, 130, 24);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("Rs.500"); 
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font("Arial",Font.BOLD,14));
        b4.setBounds(340, 230, 200, 24);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs.2000"); 
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("Arial",Font.BOLD,14));
        b5.setBounds(340, 263, 200, 24);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("Rs.10000"); 
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("Arial",Font.BOLD,14));
        b6.setBounds(340, 296, 200, 24);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("BACK"); 
        b7.setForeground(Color.BLACK);
        b7.setFont(new Font("Arial",Font.BOLD,14));
        b7.setBounds(340, 329, 200, 24);
        b7.addActionListener(this);
        image.add(b7);

        setSize(700, 700);
        setLocation(400, 100);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = ((JButton)ae.getSource()).getText().substring(3); 
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            } 

            if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }

            if (ae.getSource() == b7) {
                this.setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            }else{
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pinNumber+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}

