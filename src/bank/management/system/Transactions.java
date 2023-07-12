
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{

    JButton deposit , fcash , pchange , withdrawl , statement , enquiry , exit;
    String pinNumber;

    Transactions(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);

        JLabel text = new JLabel("Please Select Your Transaction");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,17));
        text.setBounds(230, 70, 300, 200);
        image.add(text);

        deposit = new JButton("DEPOSIT"); 
        deposit.setForeground(Color.BLACK);
        deposit.setFont(new Font("Arial",Font.BOLD,14));
        deposit.setBounds(180, 230, 130, 24);
        deposit.addActionListener(this);
        image.add(deposit);    

        fcash = new JButton("FAST CASH"); 
        fcash.setForeground(Color.BLACK);
        fcash.setFont(new Font("Arial",Font.BOLD,14));
        fcash.setBounds(180, 263, 130, 24);
        fcash.addActionListener(this);
        image.add(fcash);

        pchange = new JButton("PIN CHANGE"); 
        pchange.setForeground(Color.BLACK);
        pchange.setFont(new Font("Arial",Font.BOLD,14));
        pchange.setBounds(180, 296, 130, 24);
        pchange.addActionListener(this);
        image.add(pchange);

        withdrawl = new JButton("CASH WITHDRAWL"); 
        withdrawl.setForeground(Color.BLACK);
        withdrawl.setFont(new Font("Arial",Font.BOLD,14));
        withdrawl.setBounds(340, 230, 200, 24);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        statement = new JButton("MINI STATEMENT"); 
        statement.setForeground(Color.BLACK);
        statement.setFont(new Font("Arial",Font.BOLD,14));
        statement.setBounds(340, 263, 200, 24);
        statement.addActionListener(this);
        image.add(statement);

        enquiry = new JButton("BALANCE ENQUIRY"); 
        enquiry.setForeground(Color.BLACK);
        enquiry.setFont(new Font("Arial",Font.BOLD,14));
        enquiry.setBounds(340, 296, 200, 24);
        enquiry.addActionListener(this);
        image.add(enquiry);

        exit = new JButton("EXIT"); 
        exit.setForeground(Color.BLACK);
        exit.setFont(new Font("Arial",Font.BOLD,14));
        exit.setBounds(340, 329, 200, 24);
        exit.addActionListener(this);
        image.add(exit);

        setSize(700, 700);
        setLocation(400, 100);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        }else if(ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinNumber).setVisible(true);
        }else if(ae.getSource()==fcash){
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }else if(ae.getSource()==pchange){
            setVisible(false);
            new PinChange(pinNumber).setVisible(true);
        }else if(ae.getSource()==enquiry){
            setVisible(false);
            new BalanceEnquiry(pinNumber).setVisible(true);
        }else if(ae.getSource()==statement){
            new MiniStatement(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Transactions("");
    }
}
