
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/*<object code="SwingAnim" width=1024 height=500>
* </object>
*/

public class LiftApplet extends JApplet implements ActionListener{

     /**
      *
      */
	boolean sn=true;
	 private static final long serialVersionUID = 1L;
	 static JButton lift = new JButton("START UP");
	 static JButton up0 = new JButton("^");
     static JButton up1 = new JButton("^");
     static JButton dn1 = new JButton("v");
     static JButton up2 = new JButton("^");
     static JButton dn2 = new JButton("v");
     static JButton up3 = new JButton("^");
     static JButton dn3 = new JButton("v");
     static JButton up4 = new JButton("^");
     static JButton dn4 = new JButton("v");
     static JButton up5 = new JButton("^");
     static JButton dn5 = new JButton("v");
     static JButton up6 = new JButton("^");
     static JButton dn6 = new JButton("v");
     static JButton dn7 = new JButton("v");
     Font font = new Font("Arial", Font.PLAIN, 24);
     Font font2 = new Font("Algerian", Font.PLAIN, 50);
     Font font1 = new Font("Algerian", Font.PLAIN, 100);
     static JTextField text1 = new JTextField("");
     static JTextField text2 = new JTextField("");
     static JTextField text3 = new JTextField("");
     static JTextField text4 = new JTextField("");
     static JTextField text5 = new JTextField("");
     static JTextField text6 = new JTextField("");
     static JTextField text7 = new JTextField("");
     static JTextField text0 = new JTextField("");
     static JTextField textl = new JTextField("");
     static TextArea maltxt = new TextArea("");
     static TextArea speedtxt = new TextArea("");
     static TextArea totaltxt = new TextArea("");
     JTextField Monitor = new JTextField("");
     JLabel lb = new JLabel("LIFT_BUTTONS");
     JLabel G = new JLabel("0");
     JLabel lb1 = new JLabel("1");
     JLabel lb2 = new JLabel("2");
     JLabel lb3 = new JLabel("3");
     JLabel lb4 = new JLabel("4");
     JLabel lb5 = new JLabel("5");
     JLabel lb6 = new JLabel("6");
     JLabel lb7 = new JLabel("7");
     static JButton lg = new JButton("0");
     static JButton l1 = new JButton("1");
     static JButton l2 = new JButton("2");
     static JButton l3 = new JButton("3");
     static JButton l4 = new JButton("4");
     static JButton l5 = new JButton("5");
     static JButton l6 = new JButton("6");
     static JButton l7 = new JButton("7");
     static JButton dn0 = new JButton("7");
     static JButton up7 = new JButton("7");
     static JButton stp = new JButton("S");
     static JButton open = new JButton("<-->");
     static JButton close = new JButton("-><-");
     static JButton alarm = new JButton("Alarm");
     static JButton call = new JButton("Call");
     static int x1=474;
	 static int x2=475;   
     static JFrame frame = new JFrame("Lift System");
     JPanel panel = new JPanel();
     Thread run = null;
     static int Ldir=2;
     static int Y=541 , count=0;
     static boolean check_door=true;
     static int idleCheck=0;
     public static volatile boolean flag=true;
     public int getfloor()
 	{
    	 int temp=(Y-51)/70;
 		return (7-temp);
 	}
     
     public void init(){
    panel.setBackground(Color.white);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setLayout(null);
    Monitor.setBounds(1000,300,100,20);
    Monitor.setBorder(null);
    Monitor.setFont(font);
    Monitor.setText("Monitor");
    text0.setBounds(30,40,20,20);   
    text1.setBounds(30,110,20,20);   
    text2.setBounds(30,180,20,20);   
    text3.setBounds(30,250,20,20);   
    text4.setBounds(30,320,20,20);   
    text5.setBounds(30,390,20,20);   
    text6.setBounds(30,460,20,20);
    text7.setBounds(30,530,20,20);   
    textl.setBounds(850,200,60,100);   
    dn7.setBounds(120,50,60,20);
    dn6.setBounds(120,125,60,20);
    up6.setBounds(120,103,60,20);
    dn5.setBounds(120,195,60,20);
    up5.setBounds(120,173,60,20);
    dn4.setBounds(120,265,60,20);
    up4.setBounds(120,243,60,20);
    dn3.setBounds(120,335,60,20);
    up3.setBounds(120,313,60,20);
    dn2.setBounds(120,405,60,20);
    up2.setBounds(120,383,60,20);
    dn1.setBounds(120,475,60,20);
    up1.setBounds(120,453,60,20);
    up0.setBounds(120,520,60,20);
    totaltxt.setBounds(900,330,300,100);
    totaltxt.setEditable(false);
    totaltxt.setBackground(Color.white);
    speedtxt.setBounds(900,450,300,100);
    speedtxt.setEditable(false);
    speedtxt.setBackground(Color.white);
    maltxt.setBounds(900,570,300,100);
    maltxt.setEditable(false);
    maltxt.setBackground(Color.white);
    lift.setBounds(1150,20,100,33);
    text0.setBorder(null);
    text0.setFont(font);
    text0.setText("0");
    text1.setBorder(null);
    text1.setFont(font);
    text1.setText("0");
    text2.setBorder(null);
    text2.setFont(font);
    text2.setText("0");
    text3.setBorder(null);
    text3.setFont(font);
    text3.setText("0");
    text4.setBorder(null);
    text4.setFont(font);
    text4.setText("0");
    text5.setBorder(null);
    text5.setFont(font);
    text5.setText("0");
    text6.setBorder(null);
    text6.setFont(font);
    text6.setText("0");
    text7.setBorder(null);
    text7.setFont(font);
    text7.setText("0");
    textl.setBorder(null);
    textl.setFont(font1);
    textl.setText("0");
    G.setFont(font2);
    lb7.setFont(font2);
    lb6.setFont(font2);
    lb5.setFont(font2);
    lb4.setFont(font2);
    lb3.setFont(font2);
    lb2.setFont(font2);
    lb1.setFont(font2);
    lb.setBounds(910,25,100,25);
    G.setBounds(760,510,60,60);
    lb1.setBounds(760,440,60,60);
    lb2.setBounds(760,370,60,60);
    lb3.setBounds(760,300,60,60);
    lb4.setBounds(760,230,60,60);
    lb5.setBounds(760,160,60,60);
    lb6.setBounds(760,90,60,60);
    lb7.setBounds(760,20,60,60);
    
    call.setBounds(910,55,75,25);
    alarm.setBounds(830,85,75,25);
    open.setBounds(910,85,75,25);
    close.setBounds(990,85,75,25);
    stp.setBounds(830,115,75,25);
    l7.setBounds(910,115,75,25);
    l6.setBounds(990,115,75,25);
    l5.setBounds(830,145,75,25);
    l4.setBounds(910,145,75,25);
    l3.setBounds(990,145,75,25);
    l2.setBounds(830,175,75,25);
    l1.setBounds(910,175,75,25);
    lg.setBounds(990,175,75,25);
    panel.add(Monitor);
    panel.add(dn7);
    panel.add(dn6);
    panel.add(up6);
    panel.add(dn5);
    panel.add(up5);
    panel.add(dn4);
    panel.add(up4);
    panel.add(dn3);
    panel.add(up3);
    panel.add(dn2);
    panel.add(up2);
    panel.add(dn1);
    panel.add(up1);
    panel.add(up0);
    panel.add(lift);
    panel.add(lb);
    panel.add(call);
    panel.add(alarm);
    panel.add(close);
    panel.add(open);
    panel.add(stp);
    panel.add(lg);
    panel.add(l1);
    panel.add(l2);
    panel.add(l3);
    panel.add(l4);
    panel.add(l5);
    panel.add(l6);
    panel.add(l7);
    panel.add(G);
    panel.add(lb1);
    panel.add(lb2);
    panel.add(lb3);
    panel.add(lb4);
    panel.add(lb5);
    panel.add(lb6);
    panel.add(lb7);
    panel.add(text0);
    panel.add(text1);
    panel.add(text2);
    panel.add(text3);
    panel.add(text4);
    panel.add(text5);
    panel.add(text6);
    panel.add(text7);
    panel.add(textl);
    frame.add(panel);
    frame.setSize(400,400);
    frame.setVisible(true);
    panel.add(maltxt);
    panel.add(totaltxt);
    panel.add(speedtxt);
    lift.addActionListener(this);
    up0.addActionListener(this);
    up1.addActionListener(this);
    up2.addActionListener(this);
    up3.addActionListener(this);
    up4.addActionListener(this);
    up5.addActionListener(this);
    up6.addActionListener(this);
    dn1.addActionListener(this);
    dn2.addActionListener(this);
    dn3.addActionListener(this);
    dn4.addActionListener(this);
    dn5.addActionListener(this);
    dn6.addActionListener(this);
    dn7.addActionListener(this);
    lg.addActionListener(this);
    l1.addActionListener(this);
    l2.addActionListener(this);
    l3.addActionListener(this);
    l4.addActionListener(this);
    l5.addActionListener(this);
    l6.addActionListener(this);
    l7.addActionListener(this);
    close.addActionListener(this);
    open.addActionListener(this);
    call.addActionListener(this);
    alarm.addActionListener(this);
    
    LiftController.execute();
    new Lift();
        
     }
   
     
 
    
     public void actionPerformed(ActionEvent e)
     {
          if(e.getSource()==lift)
          {
             structure();
          }
          
          if(e.getSource()==up0)
          {
        	  up0.setBackground(Color.green);
        	  FloorButton.request_up(0);
        	  FloorButton.up[0]=true;
          }
          if(e.getSource()==up1)
          {
        	  up1.setBackground(Color.green);
              FloorButton.request_up(1);
              FloorButton.up[1]=true;
          }
          if(e.getSource()==up2)
          {
        	  up2.setBackground(Color.green);
              FloorButton.request_up(2);
              FloorButton.up[2]=true;
          }
          if(e.getSource()==up3)
          {
        	  up3.setBackground(Color.green);
              FloorButton.request_up(3);
              FloorButton.up[3]=true;
          }
          if(e.getSource()==up4)
          {
        	  up4.setBackground(Color.green);
              FloorButton.request_up(4);
              FloorButton.up[4]=true;
          }
          if(e.getSource()==up5)
          {
        	  up5.setBackground(Color.green);
              FloorButton.request_up(5);
              FloorButton.up[5]=true;
          }
          if(e.getSource()==up6)
          {
        	  up6.setBackground(Color.green);
              FloorButton.request_up(6);
              FloorButton.up[6]=true;
          }
          if(e.getSource()==dn1)
          {
        	  dn1.setBackground(Color.green);
              FloorButton.request_down(1);
              FloorButton.down[1]=true;
          }
          if(e.getSource()==dn2)
          {
        	  dn2.setBackground(Color.green);
              FloorButton.request_down(2);
              FloorButton.down[2]=true;
          }
          if(e.getSource()==dn3)
          {
        	  dn3.setBackground(Color.green);
              FloorButton.request_down(3);
              FloorButton.down[3]=true;
          }
          if(e.getSource()==dn4)
          {
        	  dn4.setBackground(Color.green);
              FloorButton.request_down(4);
              FloorButton.down[4]=true;
          }
          if(e.getSource()==dn5)
          {
        	  dn5.setBackground(Color.green);
              FloorButton.request_down(5);
              FloorButton.down[5]=true;
          }
          if(e.getSource()==dn6)
          {
        	  
        	  dn6.setBackground(Color.green);
              FloorButton.request_down(6);
              FloorButton.down[6]=true;
          }
          if(e.getSource()==dn7)
          {
        	  dn7.setBackground(Color.green);
              FloorButton.request_down(7);  
              FloorButton.down[7]=true;
          }
          if(e.getSource()==lg)
          {
        	  lg.setBackground(Color.green);
              LiftButton.request(0);            
          }
          if(e.getSource()==l1)
          {
        	  l1.setBackground(Color.green);
              LiftButton.request(1);            
          }
          if(e.getSource()==l2)
          {
        	  l2.setBackground(Color.green);
              LiftButton.request(2);            
          }
          if(e.getSource()==l3)
          {
        	  l3.setBackground(Color.green);
              LiftButton.request(3);            
          }
          if(e.getSource()==l4)
          {
        	  l4.setBackground(Color.green);
              LiftButton.request(4);            
          }
          if(e.getSource()==l5)
          {
        	  l5.setBackground(Color.green);
              LiftButton.request(5);            
          }
          if(e.getSource()==l6)
          {
        	  l6.setBackground(Color.green);
              LiftButton.request(6);            
          }
          if(e.getSource()==l7)
          {
        	  l7.setBackground(Color.green);
        	  LiftButton.request(7);            
          }
          if(e.getSource()==alarm)
          {
              LiftButton.alarm();
          }
          if(e.getSource()==open)
          {
              if(check_door==true)
              {
            	  LiftButton.request_open_door();
            	  Door.open_door();
            	  try {
            		  Thread.sleep(500);
            	  } catch (InterruptedException e1) {
            		  e1.printStackTrace();
               }
              Door.close_door();
              }
          }
          if(e.getSource()==close)
          {
              if(check_door==false)
            	  {
            	  LiftButton.request_close_door();
            	  Door.close_door();
            	  }
          }
          

     }

          public void structure(){
         Graphics g;
         g = frame.getGraphics();
         int y=50,y1=50;
         g.setColor(Color.gray); 
        g.fill3DRect(200, 50, 200, 562,true);
        g.fill3DRect(550, 50, 200, 562,true);
        g.setColor(Color.white);
        
        for(int i=0;i<7;i++){
            y = y + 70;
            g.drawLine(200, y, 400, y);
        }
        for(int j=0;j<7;j++){
            y1 = y1+ 70;
            g.drawLine(550, y1, 750, y1);
        }
        
        g.setColor(Color.red);
        int y2=50;
       if(sn)
       {
    	   g.setColor(Color.green);
    	   g.fillOval(400, 540, 10, 10);
           g.fillOval(540, 540, 10, 10);
           g.setColor(Color.red);
    	   for(int i=0;i<7;i++){
    		   g.fillOval(400, y2, 10, 10);
    		   y2  += 70;
    	   					}
    	   int y4=50;
    	   for(int i=0;i<7;i++){
    		   g.fillOval(540, y4, 10, 10);
    		   y4  += 70;
    	   					}
       sn=false;
       }
        g.setColor(Color.black);
   	// g.fillRect(411, Y, 128, 70);
   	 g.fill3DRect(411, Y, 128, 70, true);
   	
    }

	
         
}
