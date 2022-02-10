
package ai_lab_final;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CarRacing extends Applet implements ActionListener
{ 
 int x, y, z;
 int t1,t2;
 Button b1, b2, b3,b4;
 String msg=" ";
 
void slep()            
 {
  try 
  {
   Thread.sleep(80);
  }
   catch(Exception ex) {}
 }


public void init()
 {
  t1=0;
  t2=1;
  x=20; 
  y=60;
  setLayout(new FlowLayout(FlowLayout.CENTER));
  Label l=new Label("Car Racing");
  
  b1=new Button("RUN");
  add(b1);
  b1.setBackground(Color.green);
  
  b2=new Button("RED LIGHT");
  add(b2);
  b2.setBackground(Color.red);
  
  b3=new Button("Right");
  add(b3);
  b3.setBackground(Color.yellow);
  
  b4=new Button("Left");
  add(b4);
  b4.setBackground(Color.orange);
  
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
    
 }

public void start()
 {}

public void actionPerformed(ActionEvent e)
 {
  String s=e.getActionCommand();
  if(s.equals("RUN"))
  {
    msg="RUN";
    System.out.println("\nThere is no traffic, Moving On");
    repaint();
  }
  else if(s.equals("RED LIGHT"))
  {
    msg="Red";
    System.out.println("\n# Break #\n");
    repaint(); 
  }
    else if(s.equals("Right"))
  {
    msg="Right";
    System.out.println("\n Agent/any object appearing infront the car!\n");
    //repaint(); 
  }
  
      else if(s.equals("Left"))
  {
    msg="Left";
    System.out.println("\n Agent/any object appearing infront the car!\n");
    //repaint(); 
  }
  
 }


public void paint(Graphics c)
{
 int speed = 0;      
 if(msg.equals("RUN"))
 {   
     
     
  setBackground(Color.black);
  z=getWidth();
  Color c1=new Color(20,160,200);
  Color c2=new Color(200,60,200);
  c.setColor(c1);
  c.drawLine(0,y+75,z,y+75);
  c.setColor(Color.pink);
  c.fillRoundRect(x,y+20,100,40,5,5);
  c.fillArc(x+90,y+20,20,40,270,180);
  c.setColor(Color.BLUE);
  c.fillRoundRect(x+10,y,70,25,10,10);
  c.setColor(Color.white);
  c.fillRect(x+20,y+5,20,25);
  c.fillRect(x+50,y+5,20,25);
  c.setColor(Color.black);
  c.fillRoundRect(x+55,y+10,10,20,10,10);
  c.fillOval(x+10,y+50,25,25);
  c.fillOval(x+60,y+50,25,25);
  c.setColor(Color.white);
  c.fillOval(x+15,y+55,10,10);
  c.fillOval(x+65,y+55,10,10);
    x=x+10; 
    slep();
    
        c.setColor(Color.white);
        c.setFont(new Font("ALGERIAN", Font.PLAIN, 25));
        c.drawString("### Click Green to run & Red for braking the car ###",360,400);
     
     
  if(x+120<z)
  {
    x=x+1;
    speed = speed+10;
    showStatus("\nNo traffic. Go ahead.");
    repaint();
   }
  }
 
 else if(msg.equals("Red")){   
     
     
  setBackground(Color.black);
  z=getWidth();
  Color c1=new Color(20,160,200);
  Color c2=new Color(200,60,200);
  c.setColor(c1);
  c.drawLine(0,y+75,z,y+75);
  c.setColor(Color.pink);
  c.fillRoundRect(x,y+20,100,40,5,5);
  c.fillArc(x+90,y+20,20,40,270,180);
  c.setColor(Color.BLUE);
  c.fillRoundRect(x+10,y,70,25,10,10);
  c.setColor(Color.white);
  c.fillRect(x+20,y+5,20,25);
  c.fillRect(x+50,y+5,20,25);
  c.setColor(Color.black);
  c.fillRoundRect(x+55,y+10,10,20,10,10);
  c.fillOval(x+10,y+50,25,25);
  c.fillOval(x+60,y+50,25,25);
  c.setColor(Color.white);
  c.fillOval(x+15,y+55,10,10);
  c.fillOval(x+65,y+55,10,10);
    x=x+10; 
    slep();
    
        c.setColor(Color.white);
        c.setFont(new Font("ALGERIAN", Font.PLAIN, 25));
        c.drawString("### Click Green to run & Red for braking the car ###",360,400);
 }
    
 else if(msg.equals("Right")){
  setBackground(Color.black);
  z=getWidth();
  Color c3=new Color(20,160,200);
  Color c4=new Color(200,60,200);
  c.setColor(c3);
  c.fillOval(600,80,20,20);
  c.drawLine(0,y+100,z,y+100);
  c.setColor(Color.pink);
  c.fillRoundRect(x,y+45,100,40,5,30);
  c.fillArc(x+90,y+45,20,40,270,205);
  c.setColor(Color.BLUE);
  c.fillRoundRect(x+10,y+25,70,25,10,35);
  c.setColor(Color.white);
  c.fillRect(x+20,y+30,20,25);
  c.fillRect(x+50,y+30,20,25);
  c.setColor(Color.black);
  c.fillRoundRect(x+55,y+35,10,20,10,30);
  c.fillOval(x+10,y+50,25,25);
  c.fillOval(x+60,y+50,25,25);
  c.setColor(Color.white);
  c.fillOval(x+15,y+70,10,10);
  c.fillOval(x+65,y+70,10,10);
    x=x+10; 
    slep();
    x=x+10;
    //y=y+5;
     slep();
     repaint();
     System.out.println(" \nCar moved to right\n");
 
 }
 
 
 else if(msg.equals("Left")){
  setBackground(Color.black);
  z=getWidth();
  Color c3=new Color(20,160,200);
  Color c4=new Color(200,60,200);
  c.setColor(c3);
  c.fillOval(1000,120,20,20);
  c.drawLine(0,y+50,z,y+50);
  c.setColor(Color.pink);
  c.fillRoundRect(x,y-5,100,40,5,30);
  c.fillArc(x+90,y-5,20,40,270,205);
  c.setColor(Color.BLUE);
  c.fillRoundRect(x+10,y-25,70,25,10,35);
  c.setColor(Color.white);
  c.fillRect(x+20,y-20,20,25);
  c.fillRect(x+50,y-20,20,25);
  c.setColor(Color.black);
  c.fillRoundRect(x+55,y-15,10,20,10,30);
  c.fillOval(x+10,y,25,25);
  c.fillOval(x+60,y,25,25);
  c.setColor(Color.white);
  c.fillOval(x+15,y+20,10,10);
  c.fillOval(x+65,y+20,10,10);
    x=x+10; 
    slep();
    x=x+10;
    //y=y+5;
     slep();
     repaint();
     System.out.println(" \nCar moved to left\n");
 
 }
         
    System.out.println("Car Speed is : "+speed+ " km/h");
    
 }
}


