package TestCases;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class MyFrame extends JFrame implements ActionListener{
	
	JLabel label1,label2,label3,label4,label5, label6,label7,label8, label9;
	JTextField t1,t2;
	JRadioButton male,female;
	JComboBox day,month,year;
	JTextArea ta1;
	JCheckBox terms;
	JButton submit;
	JLabel msg;
	JTextArea screen;
	
	MyFrame(){
		setTitle("Registration Form");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		
		label1=new JLabel("Name");
		label1.setBounds(20,50,100,	20);
		c.add(label1);
		
		t1=new JTextField();
		t1.setBounds(130, 50,100,20);
		c.add(t1);
		
		label6=new JLabel();
		label6.setBounds(130, 70, 100, 20);
		c.add(label6);
		
		label2=new JLabel("Mobile");
		label2.setBounds(20,100,100,	20);
		c.add(label2);
		
		t2=new JTextField();
		t2.setBounds(130, 100,100,20);
		c.add(t2);
		
		label7=new JLabel();
		label7.setBounds(130, 120, 100, 20);
		c.add(label7);
		
		label3=new JLabel("Gender");
		label3.setBounds(20, 150,100,20);
		c.add(label3);
		
		male=new JRadioButton("Male");
		female=new JRadioButton("Female");
		male.setBounds(130, 150, 80, 20);
		female.setBounds(220, 150, 80, 20);
		c.add(male);
		c.add(female);
		male.setSelected(true);
		
		ButtonGroup gen=new ButtonGroup();
		gen.add(male);
		gen.add(female);
		
		label4=new JLabel("DOB");
		label4.setBounds(20, 200, 100, 20);
		c.add(label4);
		
		String[] days= {"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22",
				"23","24","25","26","27","28","29","30","31"};
		String[] months= {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String[] years= {"","2025","2024","2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011",
				"2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996"};
		day=new JComboBox(days);
		day.setBounds(130, 200, 50, 20);
		c.add(day);
		month=new JComboBox(months);
		month.setBounds(190,200,50,20);
		c.add(month);
		year=new JComboBox(years);		
		year.setBounds(250,200,60,20);
		c.add(year);
		
		label9=new JLabel();
		label9.setBounds(190, 205, 80, 50);
		c.add(label9);
		
		label5=new JLabel("Address");
		label5.setBounds(20, 250, 100, 20);
		c.add(label5);
		
		ta1=new JTextArea();
		ta1.setBounds(130, 240, 200, 50);
		c.add(ta1);
		
		label8=new JLabel();
		label8.setBounds(130, 280, 200, 50);
		c.add(label8);
		
		terms=new JCheckBox("Please accept the terms and conditions");
		terms.setBounds(80, 340, 260, 20);
		c.add(terms);
		
		submit=new JButton("SUBMIT");
		submit.setBounds(150, 380, 80, 20);
		c.add(submit);
		
		submit.addActionListener(this);
		
		screen=new JTextArea();
		screen.setBounds(350, 50, 300, 300);
		c.add(screen);
		
		msg=new JLabel();
		msg.setBounds(20, 400, 250, 20);
		c.add(msg);
		
		c.setBackground(Color.CYAN);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(t1.getText().trim().isEmpty() && t2.getText().trim().isEmpty() && ta1.getText().trim().isEmpty() && day.getSelectedIndex()==0 && month.getSelectedIndex()==0 && year.getSelectedIndex()==0) {
			label6.setText("Name is Empty");
			label7.setText("Mobile is Empty");
			label8.setText("Address is Empty");
			label9.setText("Enter DOB");
		}else if(t1.getText().trim().isEmpty()) {
			label6.setText("Name is Empty");
		}else if(t2.getText().trim().isEmpty()) {
			label7.setText("Mobile is Empty");
		}else if(ta1.getText().trim().isEmpty()) {
			label8.setText("Address is Empty");
		}else if(day.getSelectedIndex()==0 && month.getSelectedIndex()==0 && year.getSelectedIndex()==0) {
			label9.setText("Enter DOB");
		}
		else {
			label6.setText("");
			if(terms.isSelected()) {
				msg.setText("Registration Successfull!!");
				
				String name=t1.getText();
				String mobile=t2.getText();
				String gender="male";
				
				if(female.isSelected()) {
					gender="female";
				}
				String dob=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
				String add=ta1.getText();
				
				screen.setText("Name :"+ name+"\n"+"Mobile :"+mobile+"\n"+"Gender :"+gender+"\n"+"DOB :"+dob+"\n"+"Address :"+add);
			}else {
				msg.setText("Accept terms and conditions to submit");
				screen.setText("");
			}
		}
		if(!t1.getText().isEmpty()) {
			label6.setText("");
		}
		if(!t2.getText().isEmpty()) {
			label7.setText("");
		}
		if(!ta1.getText().isEmpty()) {
			label8.setText("");
		}
		if(day.getSelectedIndex()!=0 && month.getSelectedIndex()!=0 && year.getSelectedIndex()!=0) {
			label9.setText("");
		}

	}
}


public class RegistrationForm {

	public static void main(String[] args) {
		
		MyFrame frame=new MyFrame();
		

	}

}
