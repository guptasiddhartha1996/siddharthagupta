package TestCases;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrames extends JFrame implements ActionListener{
	
	Container c;
	JLabel label1, label2,background;
	JTextField user;
	JPasswordField pass;
	JButton btn;
	
	MyFrames(){
		setTitle("Loginform");
		
		setSize(700,700);
		setLocationRelativeTo(null);
		//setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img=new ImageIcon("Background.jpg");
		background =new JLabel("",img,JLabel.CENTER);
		background.setBounds(0, 0, 700, 500);
		add(background);
		
		c=getContentPane();
		c.setLayout(null); 	
		label1 =new JLabel("Username");
		label2 =new JLabel("Password");
		
		label1.setBounds(10,50,100,20);
		label2.setBounds(10,100,100,20);
		c.add(label1);
		c.add(label2);
		
		user=new JTextField();
		user.setBounds(120,50,120,20);
		c.add(user);
		
		pass=new JPasswordField();
		pass.setBounds(120,100,120,20);
		c.add(pass);
		
		
		btn=new JButton("Login");
		btn.setBounds(100, 150, 70, 20);
		c.add(btn);
		btn.addActionListener(this);
		
		
		JTextArea textarea=new JTextArea();
		textarea.setBounds(300, 100, 300, 200);
		c.add(textarea);
		textarea.setText("This is a text area ");
		textarea.setFont(new Font("Arial",Font.BOLD,20));
		textarea.setEditable(false);
		
		c.setBackground(Color.BLUE);
		
		JRadioButton radio1=new JRadioButton("Male");
		radio1.setBounds(300,50,100,20);
		c.add(radio1);
		
		JRadioButton radio2=new JRadioButton("Female");
		radio2.setBounds(400,50,100,20);
		c.add(radio2);
		
		ButtonGroup gender=new ButtonGroup();
		gender.add(radio1);
		gender.add(radio2);
		
		radio1.setSelected(true);
		
		JRadioButton general=new JRadioButton("General");
		general.setBounds(200, 70, 100, 20);
		
		JRadioButton obc=new JRadioButton("OBC");
		obc.setBounds(200, 100, 100, 20);
		
		JRadioButton sc=new JRadioButton("SC");
		sc.setBounds(200, 130, 100, 20);
		
		JRadioButton st=new JRadioButton("ST");
		st.setBounds(200, 160, 100, 20);
		
		c.add(general);
		c.add(obc);
		c.add(sc);
		c.add(st);
		
		ButtonGroup caste=new ButtonGroup();
		caste.add(general);
		caste.add(obc);
		caste.add(sc);
		caste.add(st);
		general.setSelected(true);
		obc.setEnabled(false);
		
		JCheckBox check=new JCheckBox("High School");
		check.setBounds(200, 190, 120, 20);
		JCheckBox check2=new JCheckBox("Intermediate");
		check2.setBounds(200, 220, 120, 20);
		JCheckBox check3=new JCheckBox("Graduation");
		check3.setBounds(200, 250, 120, 20);
		JCheckBox check4=new JCheckBox("Post Graduation");
		check4.setBounds(200, 280, 120, 20);
		c.add(check);
		c.add(check2);
		c.add(check3);
		c.add(check4);	
		
		check.setSelected(true);
		Font font=new Font("Arial",Font.ITALIC,15);
		check.setFont(font);
		check2.setFont(font);
		check3.setFont(font);
		check4.setFont(font);
		
		check4.setEnabled(false);
		
		String[] values= {"A", "B", "C", "D"};
		JComboBox combo=new JComboBox(values);
		combo.setBounds(200, 310, 120, 20);
		c.add(combo);
		//combo.setEditable(true);
		
		combo.setSelectedItem("B");
		combo.setFont(font);
		
		JLabel label=new JLabel("");
		label.setBounds(200, 340, 120, 20);
		c.add(label);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Username: "+ user.getText());
				System.out.println("Password: "+ pass.getText());
				String item=(String)combo.getSelectedItem();
				label.setText(item);
				
			}
		});

		
		
		setVisible(true);
		
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
	
}


public class GUI {

	public static void main(String[] args) {
		MyFrame frame=new MyFrame();

	}

}
