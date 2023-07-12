
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class MiniStatement extends JFrame {

    String pinNumber;

    MiniStatement(String pinNumber){
        this.pinNumber = pinNumber;
        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel();       
        add(mini);

        JLabel bank = new JLabel("ABC Bank");
        bank.setForeground(Color.BLACK);
        bank.setFont(new Font("System",Font.BOLD,17));
        bank.setBounds(140, 20, 200, 28);
        add(bank);

        JLabel cardNum = new JLabel();
        cardNum.setForeground(Color.BLACK);
        cardNum.setFont(new Font("System",Font.BOLD,14));
        cardNum.setBounds(60, 80, 300, 30);
        add(cardNum);

        JLabel balance = new JLabel();
        balance.setBounds(60, 500, 300, 100);
        add(balance);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pinNumber+"'");

            while(rs.next()){
                cardNum.setText("Card Number:  "+rs.getString("cardNumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardNumber").substring(12));
            }
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Conn c1 = new Conn();
            int balance1 = 0;
            ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if (rs.getString("type").equals("Deposit")) {
                    balance1 += Integer.parseInt(rs.getString("amount"));
                }else {
                    balance1 -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current Account balance is Rs. " + balance1);
        }catch(Exception e){
            System.out.println(e);
        }

        mini.setBounds(60, 100, 500, 600);

        setSize(400, 700);
        setLocation(20, 100);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
