package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{

    JButton submit , cancel;
    JRadioButton saccount , fdaccount , rdaccount , caccount;
    JCheckBox ac , ib , mb , ea , es , cb , declare;
    String formno;

    SignupThree( String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        setLayout(null);

        JLabel accountDetails = new JLabel("Page 3: Account Details");
        accountDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        accountDetails.setBounds(280, 40, 400, 50);
        add(accountDetails);

        JLabel atype = new JLabel("Account Type:");
        atype.setFont(new Font("Arial", Font.BOLD, 18));
        atype.setBounds(100, 130, 200, 30);
        add(atype);

        saccount = new JRadioButton("Savings Account");
        saccount.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        saccount.setFont(new Font("Arial",Font.BOLD,15));
        saccount.setBounds(110, 170, 200, 28);
        add(saccount);

        caccount = new JRadioButton("Current Account");
        caccount.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        caccount.setFont(new Font("Arial",Font.BOLD,15));
        caccount.setBounds(110, 203, 200, 28);
        add(caccount);

        fdaccount = new JRadioButton("Fixed Deposit Account");
        fdaccount.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        fdaccount.setFont(new Font("Arial",Font.BOLD,15));
        fdaccount.setBounds(330, 170, 200, 28);
        add(fdaccount);

        rdaccount = new JRadioButton("Recurring Deposit Account");
        rdaccount.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        rdaccount.setFont(new Font("Arial",Font.BOLD,15));
        rdaccount.setBounds(330, 203, 300, 28);
        add(rdaccount);

        ButtonGroup actype = new ButtonGroup();
        actype.add(saccount);
        actype.add(fdaccount);
        actype.add(rdaccount);
        actype.add(caccount);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Arial", Font.BOLD, 18));
        card.setBounds(100, 245, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-7634");
        number.setFont(new Font("Arial", Font.BOLD, 17));
        number.setBounds(330, 245, 200, 30);
        add(number);

        JLabel ucard = new JLabel("(Your 16-Digit Card Number)");
        ucard.setFont(new Font("Arial", Font.BOLD, 13));
        ucard.setBounds(100, 274, 200, 12);
        add(ucard);

        JLabel unumber = new JLabel("It would appear on ATM card/Cheque Book and Statements");
        unumber.setFont(new Font("Arial", Font.BOLD, 13));
        unumber.setBounds(330, 274, 600, 12);
        add(unumber);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Arial", Font.BOLD, 18));
        pin.setBounds(100, 310, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Arial", Font.BOLD, 17));
        pnumber.setBounds(330, 310, 200, 30);
        add(pnumber);

        JLabel upin = new JLabel("(4-Digit Password)");
        upin.setFont(new Font("Arial", Font.BOLD, 13));
        upin.setBounds(100, 340, 200, 12);
        add(upin);

        JLabel service = new JLabel("Services Required:");
        service.setFont(new Font("Arial", Font.BOLD, 18));
        service.setBounds(100, 380, 200, 30);
        add(service);

        ac = new JCheckBox("ATM Card");
        ac.setFont(new Font("Arial", Font.BOLD, 16));
        ac.setBounds(100, 425, 200, 26);
        ac.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        add(ac);

        mb = new JCheckBox("Mobile Banking");
        mb.setFont(new Font("Arial", Font.BOLD, 16));
        mb.setBounds(100, 460, 200, 26);
        mb.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        add(mb);

        cb = new JCheckBox("Cheque Book");
        cb.setFont(new Font("Arial", Font.BOLD, 16));
        cb.setBounds(100, 493, 200, 26);
        cb.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        add(cb);

        ib = new JCheckBox("Internet Banking");
        ib.setFont(new Font("Arial", Font.BOLD, 16));
        ib.setBounds(330, 425, 200, 26);
        ib.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        add(ib);

        ea = new JCheckBox("EMAIL Alerts");
        ea.setFont(new Font("Arial", Font.BOLD, 16));
        ea.setBounds(330, 460, 200, 26);
        ea.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        add(ea);

        es = new JCheckBox("E-Statement");
        es.setFont(new Font("Arial", Font.BOLD, 16));
        es.setBounds(330, 493, 200, 26);
        es.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        add(es);

        declare = new JCheckBox("I hereby declares that the above entered details are true to the best of my knowledge");
        declare.setFont(new Font("Arial", Font.BOLD, 13));
        declare.setBounds(100, 565, 600, 12);
        declare.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        add(declare);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Arial",Font.BOLD,17));
        submit.setBounds(230, 594, 100, 27);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Arial",Font.BOLD,17));
        cancel.setBounds(370, 594, 100, 27);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        setSize(850,800);
        setVisible(true);
        setLocation(350,10);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==submit){
            String accountType = null;
            if(saccount.isSelected()){
                accountType = "Saving Account";
            }else if(fdaccount.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if(rdaccount.isSelected()){
                accountType = "Recurring Deposit Account";
            }else if(caccount.isSelected()){
                accountType = "Current Account";
            }

            Random random = new Random();
            String cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5674435800000000L);
            String pin = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facility = "";
            if(ac.isSelected()){
                facility += "ATM Card";
            }
            if(mb.isSelected()){
                facility += " Mobile Banking";
            }
            if(cb.isSelected()){
                facility += " Cheque Book";
            }
            if(ib.isSelected()){
                facility += " Internet Banking";
            }
            if(ea.isSelected()){
                facility += " EMAIL Alerts";
            }
            if(es.isSelected()){
                facility += " E-Statement";
            }

            String declaration = "";
            if(declare.isSelected()){
                declaration += "Declared";
            }

            try{
                if(accountType.equals("") || facility.equals("") || declaration.equals("")){
                    if(accountType.equals("")){
                        JOptionPane.showMessageDialog(null , "Account Type is Required");
                    }
                    if(facility.equals("")){
                        JOptionPane.showMessageDialog(null , "Select at least one service");
                    }
                    if(declaration.equals("")){
                        JOptionPane.showMessageDialog(null , "Declaration Required");
                    }
                }else{
                    Conn c = new Conn();
                    String query1 = "insert into signupthree values ('"+formno+"','"+accountType+"','"+cardNumber+"','"+pin+"','"+facility+"')";
                    String query2 = "insert into login values ('"+formno+"' , '"+cardNumber+"' , '"+pin+"')";
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardNumber+"\n Pin: "+pin);

                    setVisible(false);
                    new Deposit(pin).setVisible(true);
                }
            
             }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new SignupThree("");
    }


}
