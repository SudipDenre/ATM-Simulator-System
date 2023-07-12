package bank.management.system;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
 
    JTextField panTextField , aadharTextField;
    JButton next;
    JRadioButton yes1 , no1 ,yes2 , no2; 
    JComboBox religion1 , category1 , income1 , occupation1;
    String formno;

    SignupTwo(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setLayout(null);

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        additionalDetails.setBounds(280, 40, 400, 45);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Arial",Font.BOLD,18));
        religion.setBounds(100, 130, 100, 30);
        add(religion);

        String[] valReligion = {"Hindu" , "Muslim" , "Sikh" , "Christian" , "Other"};
        religion1 = new JComboBox(valReligion);
        religion1.setBounds(270,130,340,30);
        religion1.setFont(new Font("Arial", Font.BOLD, 14));
        religion1.setBackground(Color.WHITE);
        add(religion1);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Arial",Font.BOLD,18));
        category.setBounds(100, 180, 200, 30);
        add(category);

        String[] valCategory = {"General" , "SC" , "ST" , "OBC" , "Other"};
        category1 = new JComboBox(valCategory);
        category1.setBounds(270,180,340,30);
        category1.setFont(new Font("Arial", Font.BOLD, 14));
        category1.setBackground(Color.WHITE);
        add(category1);     

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Arial",Font.BOLD,18));
        income.setBounds(100, 230, 200, 30);
        add(income);

        String[] valIncome = {"Null" , "< 1,50,000" , "< 2,50,000" , "< 5,00,000" , "Upto 10,00,000"};
        income1 = new JComboBox(valIncome);
        income1.setBounds(270,230,340,30);
        income1.setFont(new Font("Arial", Font.BOLD, 14));
        income1.setBackground(Color.WHITE);
        add(income1);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Arial",Font.BOLD,18));
        occupation.setBounds(100, 280, 200, 30);
        add(occupation);

        String[] valOccupation = {"Self-Employed" , "Student" , "Bussiness" , "Salaried" , "Other"};
        occupation1 = new JComboBox(valOccupation);
        occupation1.setBounds(270,280,340,30);
        occupation1.setFont(new Font("Arial", Font.BOLD, 14));
        occupation1.setBackground(Color.WHITE);
        add(occupation1);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Arial",Font.BOLD,18));
        pan.setBounds(100, 330, 200, 30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setBounds(270,330,340,30);
        panTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Arial",Font.BOLD,18));
        aadhar.setBounds(100, 380, 200, 30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setBounds(270,380,340,31);
        aadharTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(aadharTextField);       

        JLabel sencitizen = new JLabel("Senior Citizen:");
        sencitizen.setFont(new Font("Arial",Font.BOLD,18));
        sencitizen.setBounds(100, 430, 200, 30);
        add(sencitizen);

        yes1 = new JRadioButton("Yes");
        yes1.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        yes1.setFont(new Font("Arial",Font.BOLD,18));
        yes1.setBounds(270, 430, 100, 30);
        add(yes1);

        no1 = new JRadioButton("No");
        no1.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        no1.setFont(new Font("Arial",Font.BOLD,18));
        no1.setBounds(400, 430, 100, 30);
        add(no1);

        ButtonGroup sencitizengroup = new ButtonGroup();
        sencitizengroup.add(yes1);
        sencitizengroup.add(no1);

        JLabel eaccount = new JLabel("Existing Account:");
        eaccount.setFont(new Font("Arial",Font.BOLD,18));
        eaccount.setBounds(100, 480, 200, 30);
        add(eaccount);

        yes2 = new JRadioButton("Yes");
        yes2.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        yes2.setFont(new Font("Arial",Font.BOLD,18));
        yes2.setBounds(270, 480, 100, 30);
        add(yes2);

        no2 = new JRadioButton("No");
        no2.setBackground(Color.getHSBColor(0.4f, 0.6f, 0.8f));
        no2.setFont(new Font("Arial",Font.BOLD,18));
        no2.setBounds(400, 480, 100, 30);
        add(no2);

        ButtonGroup eaccountgroup = new ButtonGroup();
        eaccountgroup.add(yes2);
        eaccountgroup.add(no2);

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
        
        String religion = (String)religion1.getSelectedItem();
        String category = (String)category1.getSelectedItem();
        String income = (String)income1.getSelectedItem();
        String occupation = (String)occupation1.getSelectedItem();
        String PAN = panTextField.getText();
        String Aadhar = aadharTextField.getText();
        String seniorcitizen = null;

        if(yes1.isSelected()){
                seniorcitizen = "Yes";
        }else if(no1.isSelected()){
                seniorcitizen = "No";
        }
        
        String existingAccount = null;
        
        if(yes2.isSelected()){
            existingAccount = "Yes";
        }else if(no2.isSelected()){
            existingAccount = "No";
        }
     
        try{  
            Conn c = new Conn();
            String query = "insert into signuptwo values ('"+formno+"','"+religion+"','"+category+"','"+income+"','"+occupation+"','"+PAN+"','"+Aadhar+"','"+seniorcitizen+"','"+existingAccount+"')";
            c.s.executeUpdate(query);
            setVisible(false);
            new SignupThree(formno).setVisible(true);;
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}

