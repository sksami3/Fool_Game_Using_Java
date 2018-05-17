import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Fool extends JFrame implements ActionListener, MouseListener
{
	
	
	private JButton yesButton, noButton;
	private JLabel l1;
	private JPanel panel;
	int x;
	int y;
	
	
	public Fool()
	{
		super("Fool Game");
		//random
		
		
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
		l1=new JLabel("Are you a fool?");
		l1.setBounds(200,100,100,100);
		
		panel.add(l1);
	
		
		noButton = new JButton("No");
		noButton.setBounds(150,350,100,30);
		noButton.setBackground(Color.red);
		noButton.addMouseListener(this);
		noButton.addActionListener(this);
		panel.add(noButton);
		
		yesButton = new JButton("Yes");
		yesButton.setBounds(300,350,100,30);
		yesButton.setBackground(Color.green);
		yesButton.addMouseListener(this);
		yesButton.addActionListener(this);
		panel.add(yesButton);
		
		this.add(panel);
		//loginButton.addMouseEntered();
	
			
		
	}
	//////////////Actions
		
		public void actionPerformed(ActionEvent ae)
		{
			String b = ae.getActionCommand();
			if(b==noButton.getText())
			{							
			   no n=new no();
			   n.setVisible(true);
			   this.setVisible(false);
			   //this.dispose();
			}
			else if(b==yesButton.getText())
			{
			   yes y=new yes();
			   y.setVisible(true);
			   this.setVisible(false);
			   //this.dispose();
			}
		}
		public void mouseEntered(MouseEvent me)
		{
			Random r=new Random();		
			x=r.nextInt(700);
			Random r1=new Random();		
			y=r1.nextInt(350);
			JButton b= (JButton)me.getComponent();
			if(b==noButton)
			{							
			noButton.setBounds(x,y,100,30);	
			
			}

		}
		public void mouseExited(MouseEvent me)
		{
			
		}
		public void mouseReleased(MouseEvent me)
		{
			
		}
		public void mousePressed(MouseEvent me)
		{
			
		}
		public void mouseClicked(MouseEvent me)
		{
			JButton b= (JButton)me.getComponent();
			if(b==noButton)
			{							
			   no n=new no();
			   n.setVisible(true);
			   this.setVisible(false);
			   //this.dispose();
			   
			}
			else if(b==yesButton)
			{
			   yes y=new yes();
			   y.setVisible(true);
			   this.setVisible(false);
			   //this.dispose();
			}
		}
}
	
	
