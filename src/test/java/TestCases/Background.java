package TestCases;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class SidMyFrames extends JFrame{
	
	JLabel background;
	
	SidMyFrames(){
		setTitle("Background Image");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\gupta\\OneDrive\\Desktop\\Images\\Background.png")));
		setLayout(new FlowLayout());
		background=new JLabel();
		add(background);
		setSize(500,500);
		
		setVisible(true);
	}
}

public class Background {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SidMyFrames frame1=new SidMyFrames();

	}

}
