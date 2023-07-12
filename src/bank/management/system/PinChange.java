
package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener{

    String pinNumber;
    JPasswordField pinTextField , rpinTextField;
    JButton change , back;

    PinChange(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,17));
        text.setBounds(260, 60, 300, 200);
        image.add(text);

        JLabel npin = new JLabel("New PIN:");
        npin.setForeground(Color.WHITE);
        npin.setFont(new Font("System",Font.BOLD,17));
        npin.setBounds(170, 180, 200, 30);
        image.add(npin);

        JLabel repin = new JLabel("Re-Enter New PIN:");
        repin.setForeground(Color.WHITE);
        repin.setFont(new Font("System",Font.BOLD,17));
        repin.setBounds(170, 210, 300, 30);
        image.add(repin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(340,180,200,24);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        rpinTextField = new JPasswordField();
        rpinTextField.setBounds(340,210,200,24);
        rpinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(rpinTextField);

        change = new JButton("CHANGE"); 
        change.setForeground(Color.BLACK);
        change.setFont(new Font("Arial",Font.BOLD,14));
        change.setBounds(300, 290, 100, 24);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK"); 
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Arial",Font.BOLD,14));
        back.setBounds(300, 320, 100, 24);
        back.addActionListener(this);
        image.add(back);

        setSize(700, 700);
        setLocation(400, 100);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==change){
            try{
                char[] pinChars = pinTextField.getPassword();
                String npin = new String(pinChars);
                char[] pinChars1 = rpinTextField.getPassword();
                String rpin = new String(pinChars1);

                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null , "Entered PIN doesn't match");
                    return;
                }

                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null , "Please Enter the  New PIN");
                    return;
                }

                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null , "Please Re-Enter the New PIN");
                    return;
                }

                Conn c = new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pinNumber+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pinNumber+"' ";
                String q3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pinNumber+"' ";

                c.s.executeUpdate(q1);
                c.s.executeUpdate(q2);
                c.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
        }else{
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
