package com.OBBE.Testcases;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;

import com.OBBE.PageObjects.PrismPageObjects;

import org.openqa.selenium.*;

public class GUI extends JFrame{
	
	JLabel label1,label2,label3,label4,label5, background, label6,label7,label8,label9, count,
	label10, label11, label12, label13;
	JLabel usernamelabel, passwordlabel;
	JPasswordField passwordlabl;
	JTextField t1,t2,t3,t4,t5;
	JRadioButton male,female;
	JComboBox type, Env;
	JTextArea ta1;
	JCheckBox terms;
	JButton execute=new JButton("Execute");
	JLabel msg;
	JTextArea screen;
	JCheckBox show;

	
	public void FrameSample() {
		setTitle("New Hire");
		setSize(390	,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		//ImageIcon img=new ImageIcon(System.getProperty("user.dir")+"\\logo.png");
		ImageIcon img=new ImageIcon(getClass().getClassLoader().getResource("logo.png"));
		background=new JLabel("", img, JLabel.CENTER);
		background.setBounds(0, 0, 350, 100);
		add(background);

		
		
		label1=new JLabel("Client ID");
		label1.setBounds(50, 100, 120, 20);
		c.add(label1);
		
		t1=new JTextField();
		t1.setBounds(120, 100, 120, 20);
		c.add(t1);
		
		
		
		
		label6=new JLabel();
		label6.setBounds(120, 120, 120, 20);
		c.add(label6);
		
		usernamelabel=new JLabel("Username");
		usernamelabel.setBounds(50, 145, 120, 20);
		c.add(usernamelabel);
		
		t3=new JTextField();
		t3.setBounds(120, 145, 120, 20);
		t3.setText("sigupta");
		t3.setEditable(false);
		c.add(t3);
		
		label8=new JLabel();
		label8.setBounds(120, 165, 150, 20);
		c.add(label8);
		
		passwordlabel=new JLabel("Password");
		passwordlabel.setBounds(50, 190, 120, 20);
		c.add(passwordlabel);
		
		passwordlabl=new JPasswordField();
		passwordlabl.setBounds(120, 190, 120, 20);
		passwordlabl.setEchoChar('*');
		passwordlabl.setFont(new Font("Verdana", Font.PLAIN, 12));
		passwordlabl.setText("Ninja@78901234");
		passwordlabl.setEditable(false);
		add(passwordlabl);
		
		show=new JCheckBox("Show Password");
		show.setBounds(260, 190, 120, 20);
		show.setBackground(null);
		show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(show.isSelected()) {
					passwordlabl.setEchoChar((char)0);
					
				}
				else {
					passwordlabl.setEchoChar('*');
				}
			}
			
		});
		add(show);
		

		
		label9=new JLabel();
		label9.setBounds(120, 210, 150, 20);
		c.add(label9);
		

		label2=new JLabel("Type");
		label2.setBounds(50, 240, 120, 20);
		c.add(label2);
		
		count=new JLabel("Count");
		count.setBounds(50, 300, 120, 20);
		c.add(count);
		
		t5=new JTextField();
		t5.setBounds(120, 300, 120, 20);
		c.add(t5);
		
		label10=new JLabel();
		label10.setBounds(120, 320, 150, 20);
		c.add(label10);
		
		label11=new JLabel();
		label11.setBounds(120, 320, 250, 20);
		c.add(label11);
		

		
		String[] str= {"--Select--","OB","BE"};
		
		type=new JComboBox(str);
		type.setBounds(120, 240, 120, 20);
		c.add(type);
		
		label7=new JLabel();
		label7.setBounds(120, 260, 120, 20);
		c.add(label7);
		
		execute.setBounds(120, 400, 120, 20);
		c.add(execute);
		
		msg=new JLabel();
		msg.setBounds(120, 420, 150, 20);
		c.add(msg);
		
		String[] str1= {"--Select--","QA86","QRQA","QRSTG","MR1QA","MR2QA","MRSTG","DB50","DB51","DB52","DB53","DB54","DB55","DB56","DB57","DB58",
				"DB59","DB60","DB61","DB62","DB63","DB64","DB65","DB66","DB67","DB68","DB69","DB70","DB71","DB72","DB73","DB74","DB75","DB76","DB77","DB78"
				,"DB79","DB80","DB81","DB82","DB83","DB84","DB85","PRODQA","PRODSTG","ORD11","PRE-RELEASE"};
		
		Env=new JComboBox(str1);
		Env.setBounds(120, 350, 120, 20);
		c.add(Env);
		
		label12=new JLabel("Env");
		label12.setBounds(50, 350, 120, 20);
		c.add(label12);
		
		label13=new JLabel();
		label13.setBounds(120, 370, 120, 20);
		c.add(label13);
		
//		screen=new JTextArea();
//		screen.setBounds(290, 100, 200, 200);
//		c.add(screen);
		
		//c.setBackground(Color.PINK);
		
		setVisible(true);
        execute.addActionListener(new ActionListener() {
   

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	
                	
                	TestNG runner=new TestNG();
            		List<String> suitefiles=new ArrayList<String>();
            		suitefiles.add(System.getProperty("user.dir")+"\\testng.xml");
                	
                	if(t1.getText().trim().isEmpty() && type.getSelectedIndex()==0 && 
                			t3.getText().trim().isEmpty() && t5.getText().trim().isEmpty() &&
                			Env.getSelectedIndex()==0) {
                		label6.setText("Client ID is empty");
                		label7.setText("Please select Type");
                		label8.setText("Please Enter Username");
                		label9.setText("Please Enter Password");
                		label10.setText("Please Enter the count");
                		label13.setText("Please select Env");
                		
                	}else if(t1.getText().trim().isEmpty()) {
                		label6.setText("Client ID is empty");
                	}else if(type.getSelectedIndex()==0) {
                		label7.setText("Please select Type");
                	}else if(t3.getText().trim().isEmpty()) {
                		label8.setText("Please Enter Username");
                	}
                	else if(t5.getText().trim().isEmpty()) {
                		label10.setText("Please Enter the count");
                	}else if(Integer.parseInt(t5.getText().trim())==0) {
                		label11.setText("Please Enter the count greater than 0");
                	}else if(Env.getSelectedIndex()==0) {
                		label13.setText("Please select Env");
                	}
                	
//                	else if(Integer.parseInt(t5.getText().trim())!=0) {
//                		label11.setText("");
//                	}
                	
                	else {
                		
                		if(type.getSelectedItem().equals("BE"))
                		{
                			label11.setText("");
                			String cid=t1.getText().trim();
                			String username=t3.getText().trim();
                			String password=passwordlabl.getText().trim();
                			int counting=Integer.parseInt(t5.getText().trim());
                			System.out.println(username);
                			System.out.println(password);
                			System.out.println(counting);
                    		System.out.println(System.getProperty("user.dir"));
                    		msg.setText("BE New Hire is Launched!");
                    		String env=Env.getSelectedItem().toString();
                    		System.out.println("Environment is: "+ env);
                    		BENewhire be=new BENewhire();
                    		be.newhire(cid,username,password,counting,env);
//                    		runner.setTestClasses(new Class[] {com.OBBE.Testcases.BENewhire.class});
//                    		runner.run();
                    	
                            // Do yuor stuff
                		}
                		else {
                			
                			
                			String cid=t1.getText().trim();
                			String username=t3.getText().trim();
                			String password=passwordlabl.getText().trim();
                			int counting=Integer.parseInt(t5.getText().trim());
                			System.out.println(username);
                			System.out.println(password);
                			System.out.println(counting);
                    		System.out.println("Hello World");
                    		msg.setText("OB New Hire is Launched!");
                    		String env=Env.getSelectedItem().toString();
                    		System.out.println("Environment is: "+ env);
                    		OBNewhire ob=new OBNewhire();
                    		ob.newhire(cid,username,password,counting,env);
//                    		runner.setTestClasses(new Class[] {com.OBBE.Testcases.OBNewhire.class});
//                    		runner.run();
                    		
                			
                		}
                		

                	}
                	if(!t1.getText().trim().isEmpty()) {
                		label6.setText("");
                	}
                	if(type.getSelectedIndex()!=0) {
                		label7.setText("");
                	}
                	if(!t3.getText().trim().isEmpty()) {
                		label8.setText("");
                	}
                	if(!passwordlabl.getText().trim().isEmpty()) {
                		label9.setText("");
                	}
                	if(!t5.getText().trim().isEmpty()) {
                		label10.setText("");
                	}
                	if(Env.getSelectedIndex()!=0) {
                		label13.setText("");
                	}
                	if(t1.getText().trim().isEmpty() && type.getSelectedIndex()==0 &&
                			t3.getText().trim().isEmpty() && t5.getText().trim().isEmpty() &&
                			Env.getSelectedIndex()!=0)
                	{
                		label6.setText("Client ID is empty");
                		label7.setText("Please select Type");
                		label8.setText("Please Enter Username");
                		label9.setText("Please Enter Password");
                		label10.setText("Please Enter the count");
                	}
                	if(t1.getText().trim().isEmpty() && type.getSelectedIndex()==0 && 
                			t3.getText().trim().isEmpty() && !t5.getText().trim().isEmpty() &&
                			Env.getSelectedIndex()==0) {
                		label6.setText("Client ID is empty");
                		label7.setText("Please select Type");
                		label8.setText("Please Enter Username");
                		label9.setText("Please Enter Password");
                		label13.setText("Please select Env");
                	}
                	if(t1.getText().trim().isEmpty() && type.getSelectedIndex()==0 && 
                			!t3.getText().trim().isEmpty() && t5.getText().trim().isEmpty() &&
                			Env.getSelectedIndex()==0) {
                		label6.setText("Client ID is empty");
                		label7.setText("Please select Type");
               
                		label9.setText("Please Enter Password");
                		label10.setText("Please Enter the count");
                		label13.setText("Please select Env");
                		
                	}
                	if(t1.getText().trim().isEmpty() && type.getSelectedIndex()!=0 && 
                			t3.getText().trim().isEmpty() && t5.getText().trim().isEmpty() &&
                			Env.getSelectedIndex()==0) {
                		label6.setText("Client ID is empty");
                		
                		label8.setText("Please Enter Username");
                		label9.setText("Please Enter Password");
                		label10.setText("Please Enter the count");
                		label13.setText("Please select Env");
                		
                	}
                	if(!t1.getText().trim().isEmpty() && type.getSelectedIndex()==0 && 
                			t3.getText().trim().isEmpty() && t5.getText().trim().isEmpty() &&
                			Env.getSelectedIndex()==0) {
                		
                		label7.setText("Please select Type");
                		label8.setText("Please Enter Username");
                		label9.setText("Please Enter Password");
                		label10.setText("Please Enter the count");
                		label13.setText("Please select Env");
                	}

                	

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
            

        });	
        
        
	}


	public static void main(String[] args) {
		GUI i=new GUI();
		i.FrameSample();

	}

}
