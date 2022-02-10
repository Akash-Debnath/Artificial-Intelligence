package ai_lab_final;


import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;


public class AutomaticAC extends Applet implements Runnable {
    
    boolean flag;
    Thread t;
    Button b1,b2;
    
    public void start(){
    t = new Thread(this);
    flag = true;
    t.start();
    }
    
    
    public void init()
 {

  setLayout(new FlowLayout(FlowLayout.CENTER));
  Label l=new Label("**     AUTOMATIC Air Condition      **");
  add(l);
 }
    
     @Override
    public void run() {
    while(true){
        try{
        if(flag)
            flag = false;
        else
            flag = true;
            t.sleep(3000);
            repaint();
        }catch (Exception e){}
      }
    }
    
    public void paint(Graphics g){
    
    setBackground(Color.magenta);
    int x[] = {300,400,500};
    int y[] = {300,200,300};
    
    g.setColor(new Color(100,102,102));

    g.drawRect(300, 300, 200, 100);
    g.setColor(Color.white);
    g.fillRect(300, 300, 200, 100);
    
    if(flag){
        System.out.println("\nNo human agent. [Off the AC]");
        g.drawRect(375,350,0,0);
        g.setColor(new Color(120,0,0));
        g.fillRect(375,350,50,50);
        g.setColor(Color.black);
        g.drawLine(400, 350, 400, 400);
    }
    else{       
        System.out.println("\nAgent coming to the room and its High Temparature\n");
        Color clr=new Color(100,200,86);
        g.setColor(clr);
        
        g.drawOval(50,350,100,125);
        g.fillOval(50,350,100,125);
        
        g.drawRect(20, 475, 170, 95);
        g.fillRect(20, 475, 170, 95);
        
        g.drawRect(40,550,35,95);
        g.fillRect(40,550,35,95);
        
        g.drawRect(130,550,35,95);
        g.fillRect(130,550,35,95);//
        

        g.setColor(Color.black);
        g.drawOval(80,390,20,12);
        g.fillOval(80,390,20,12);
   
        g.drawOval(125,390,20,12);
        g.fillOval(125,390,20,12);

        g.drawArc(80,395,17,5,0,90);

        g.drawArc(125,395,17,5,0,90);

        g.drawLine(105,432,105,437);
        g.drawLine(120,432,120,437);
        g.drawArc(105,437,15,5,0,-90); 

        g.setColor(Color.yellow);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        g.drawString("AC Is Opened as Person(s) enter the room as wather is terribly Hot!!!",470,270);
        

        g.drawRect(375,350,50,50);
        g.setColor(Color.black);
        
        g.fillRect(375,350,50,50); 
        g.setColor(new Color(120,0,0));
        
        int x1[]= {375,390,390,375,375};
        int y1[] ={350, 360, 390, 400, 350};
        
        g.fillPolygon(x1,y1,5);
        int x2[]={425,410,410,425,425};
        int y2[] = {350,360,390,400,350};
        g.fillPolygon(x2, y2, 5);

        
        System.out.println(" \n The Temparature of the AC will decrease if the weather temparature get increase.\n");
    
      } 
 
   }
        
}
