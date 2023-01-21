package EMS;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class FrontPage extends JFrame implements ActionListener {
	    
		FrontPage(){                                                                        //for frame coding
	        
	        getContentPane().setBackground(Color.WHITE);
	        setLayout(null);
	        
	        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
	        heading.setBounds(80, 30, 1200, 60);
	        heading.setFont(new Font("Arail", Font.PLAIN, 60));
	        heading.setForeground(Color.BLACK);
	        add(heading);
	        
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/FrontPage.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(50, 100, 1050, 500);
	        add(image);
	        
	        JButton clickhere = new JButton("Kanishka Negi (190101142");
	        clickhere.setBounds(400, 400, 200, 50);
	        clickhere.setBackground(Color.WHITE);
	        clickhere.setForeground(Color.BLACK);
	        clickhere.addActionListener(this);
	        image.add(clickhere);
	        
	        
	        setSize(1170, 650);
	        setLocation(200, 50);
	        setVisible(true);                                                                                                          //for the visibility ( default = left)
	        
		}
	    public void actionPerformed(ActionEvent ae) {
	        setVisible(false);
	        new Login();
	    }
	    
	    public static void main(String args[]) {
	        new FrontPage();                    //Object
	    }
	}



