
package ai_lab_final;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea textarea= new JTextArea();
	private JTextField textfield=new JTextField();                                  
	private JButton button=new JButton();
	private JLabel label=new JLabel();
	
	Chatbot(){                                                // Layout and Properties defined in Constructer                                         
		
		JFrame frame=new JFrame();                                     
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(400,400);
		frame.getContentPane().setBackground(Color.magenta);
		frame.setTitle("ChatBot of NSTU");
		frame.add(textarea);
		frame.add(textfield);
		textarea.setSize(300,310);
		textarea.setLocation(1, 1);
		textarea.setBackground(Color.yellow);
		textfield.setSize(300,20);
		textfield.setLocation(1,320);
		frame.add(button);
		label.setText("SEND");
		button.add(label);
		button.setSize(400,20);
		button.setLocation(300,320);
		
		button.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==button) {                           // Message sents on Click button
					
					String text=textfield.getText().toLowerCase();
					textarea.setForeground(Color.red);
					textarea.append("You-->"+text+"\n");
					textfield.setText("");
					
					if(text.contains("hi")) {                         // input Checking
						replyMeth("Hlw. Welcome to IIT,NSTU\n");
					}
					else if(text.contains("how are you")) {
						replyMeth("I'm fine. \n");
					}
                                        
                                        else if(text.contains("who are you")) {
						replyMeth("I'm the robot of Institute of Information \nTechnology."
                                                        + " Am i know who you are?\n");
					}
                                        
					else if(text.contains("what is your name")) {
						replyMeth("I'm the robot of Institute of Information Technology\n"
                                                        + "Am i know who you are?\n");
					}
                                        
                                        else if(text.contains("Yes i am akash")) {
						replyMeth("Nice to meet you, Akash\n");
                                                 
					}
                                        
					else if(text.contains("gender")) {
						replyMeth("I've no gender but seem like a man)");
					}
					else if(text.contains("married?")) {
						replyMeth("Sorry, i am a robot\n");
					}
					else if(text.contains("bye")) {
						replyMeth("Okay, you can poke me anytime\n");
					}
					else 
						replyMeth("Sorry, can you tell it in an alternative way\n");
					
				}
				
			}
			
		});
		
	}
	public void replyMeth(String s) {                          // Reply Method
		textarea.append("ChatBot-->"+s+"\n");         
	}
			

}




