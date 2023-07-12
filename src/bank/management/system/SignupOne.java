package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener{

    long random;
    JTextField nameTextField,fnameTextField,emailTextField,adrsTextField,cityTextField,pincTextField,stateTextField;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser datechooser;

    SignupOne(){
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
        setLayout(null);

        random = Math.abs((new Random().nextLong() % 9000L) + 1000L);
        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 36);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Arial",Font.BOLD,18));
        name.setBounds(100, 130, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(270,130,340,30);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Arial",Font.BOLD,18));
        fname.setBounds(100, 180, 200, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setBounds(270,180,340,30);
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Arial",Font.BOLD,18));
        dob.setBounds(100, 230, 200, 30);
        add(dob);

        datechooser = new JDateChooser();
        datechooser.setBounds(270, 230, 340, 30);
        datechooser.setBackground(Color.BLACK);
        datechooser.setFont(new Font("Arial",Font.BOLD,18));
        add(datechooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Arial",Font.BOLD,18));
        gender.setBounds(100, 280, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        male.setFont(new Font("Arial",Font.BOLD,18));
        male.setBounds(270, 280, 100, 30);
        add(male);

        female = new JRadioButton("Female");
        female.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        female.setFont(new Font("Arial",Font.BOLD,18));
        female.setBounds(400, 280, 100, 30);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Arial",Font.BOLD,18));
        email.setBounds(100, 330, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(270,330,340,30);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(emailTextField);

        JLabel mstatus = new JLabel("Marital Status:");
        mstatus.setFont(new Font("Arial",Font.BOLD,18));
        mstatus.setBounds(100, 380, 200, 30);
        add(mstatus);

        married = new JRadioButton("Married");
        married.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        married.setFont(new Font("Arial",Font.BOLD,18));
        married.setBounds(270, 380, 100, 30);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        unmarried.setFont(new Font("Arial",Font.BOLD,18));
        unmarried.setBounds(390, 380, 150, 30);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        other.setFont(new Font("Arial",Font.BOLD,18));
        other.setBounds(535, 380, 100, 30);
        add(other);

        ButtonGroup mstatusgroup = new ButtonGroup();
        mstatusgroup.add(married);
        mstatusgroup.add(unmarried);
        mstatusgroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Arial",Font.BOLD,18));
        address.setBounds(100, 430, 200, 30);
        add(address);

        adrsTextField = new JTextField();
        adrsTextField.setBounds(270,430,340,30);
        adrsTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(adrsTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Arial",Font.BOLD,18));
        city.setBounds(100, 480, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(270,480,340,30);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cityTextField);

        JLabel pinc = new JLabel("Pin Code:");
        pinc.setFont(new Font("Arial",Font.BOLD,18));
        pinc.setBounds(100, 530, 200, 30);
        add(pinc);

        pincTextField = new JTextField();
        pincTextField.setBounds(270,530,340,30);
        pincTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pincTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Arial",Font.BOLD,18));
        state.setBounds(100, 580, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setBounds(270,580,340,30);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(stateTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Arial",Font.BOLD,17));
        next.setBounds(535, 650, 80, 27);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        setSize(850,800);
        setVisible(true);
        setLocation(350,10);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;

        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        } 

        String email = emailTextField.getText();
        String marital = null;

        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital = "Other";
        }

        String address = adrsTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincTextField.getText();

        try{
            if(name.equals("") || fname.equals("") || dob.equals("") || gender.equals("") || marital.equals("") || email.equals("") || address.equals("") || city.equals("") || state.equals("") || pin.equals("")){
                JOptionPane.showMessageDialog(null, "Oops! You forgot something");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new SignupOne();
    }
}
