import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class no extends JFrame implements ActionListener, MouseListener
{
	
	
	private JButton againButton, exitButton;
	private JLabel l1,l2;
	private JPanel panel;
	
	
	
	public no()
	{
		super("Fool Game");
		
		
		
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
		l1=new JLabel("Are you a fool?");
		l1.setBounds(200,100,100,100);
		panel.add(l1);
		
		l2=new JLabel("You are NOT a Fool");
		l2.setBounds(200,200,140,50);
		l2.setBackground(Color.green);
		l2.setOpaque(true); 
		panel.add(l2);
	
		
		againButton = new JButton("Again");
		againButton.setBounds(270,350,100,30);
		againButton.addMouseListener(this);
		againButton.addActionListener(this);
		panel.add(againButton);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(400,350,100,30);
		exitButton.addActionListener(this);
		exitButton.addMouseListener(this);
		panel.add(exitButton);
		
		this.add(panel);
		//loginButton.addMouseEntered();
	
			
		
	}
	//////////////Actions
		
		public void actionPerformed(ActionEvent ae)
		{
			String b = ae.getActionCommand();
			if(b==againButton.getText())
			{							
			   Fool f=new Fool();
			   f.setVisible(true);
			   this.setVisible(false);
			}
			else if(b==exitButton.getText())
			{
				System.exit(0); 
			}
			
		}
		public void mouseEntered(MouseEvent me)
		{
			
			

		}
		public void mouseExited(MouseEvent me)
		{
		
		}
		public void mouseReleased(MouseEvent me){}
		public void mousePressed(MouseEvent me)
		{
			
		}
		public void mouseClicked(MouseEvent me)
		{
			JButton b= (JButton)me.getComponent();
			if(b==againButton)
			{							
			   Fool f=new Fool();
			   f.setVisible(true);
			   this.setVisible(false);
			}
			else if(b==exitButton)
			{
			  System.exit(0); 
			}
		}
}
	
	
