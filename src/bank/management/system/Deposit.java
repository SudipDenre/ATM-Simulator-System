
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{

    JTextField damount;
    JButton deposit , back;
    String pinNumber;

    Deposit(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);

        JLabel text = new JLabel("Enter Amount you want to Deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,17));
        text.setBounds(220, 70, 400, 200);
        image.add(text);

        damount = new JTextField();
        damount.setBounds(220,200,280,30);
        damount.setFont(new Font("Arial", Font.BOLD, 14));
        add(damount);

        deposit = new JButton("DEPOSIT"); 
        deposit.setForeground(Color.BLACK);
        deposit.setFont(new Font("Arial",Font.BOLD,14));
        deposit.setBounds(310, 290, 100, 24);
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("BACK"); 
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Arial",Font.BOLD,14));
        back.setBounds(310, 320, 100, 24);
        back.addActionListener(this);
        image.add(back);

        setSize(700, 700);
        setLocation(400, 100);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){
            String amount = damount.getText();
            Date date = new Date();
            if(amount.equals("")){
                JOptionPane.showMessageDialog(null , "Please Enter the Amount");

            }else{
                try{
                    Conn c = new Conn();
                    String query = "insert into bank values ('"+pinNumber+"' , '"+date.toString()+"' , 'Deposit' , '"+amount+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null , "Rs. "+amount+" is deposited successfully in your account");
                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);          
                }catch(Exception e){
                    System.out.println(e);
                }        
            }
        }else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
