
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener{
    String pinNumber;
    JButton back;

    BalanceEnquiry(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);

        back = new JButton("BACK"); 
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Arial",Font.BOLD,14));
        back.setBounds(300, 320, 100, 24);
        back.addActionListener(this);
        image.add(back);

        Conn c = new Conn();
        int balance = 0;
        try {         
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");        
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }

        JLabel l1 = new JLabel("Your current Account Balance is Rs. "+balance);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,17));
        l1.setBounds(180, 70, 3400, 200);
        image.add(l1);

        setSize(700, 700);
        setLocation(400, 100);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){      
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);       
    }
    
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
