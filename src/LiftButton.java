import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.UIManager;

public class LiftButton extends LiftApplet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void request(int fno)
	{
		LiftController.accept_lift_request(fno);  
	}
	public static void alarm()
    {	
		Graphics g;
		g=frame.getGraphics();
		for(int i=0;i<10;i++)
		{
			
   	 try{
   	 Image img = ImageIO.read(new File("C:/Documents and Settings/MOIZ/workspace/Trial Applet Problem Successful/src/alarm.gif"));
   	 g.setColor(Color.white);
   	 g.drawImage(img, 1100, 100, 150, 150, null);
   	 Thread.sleep(300);
   	 g.fillRect(1100, 100, 150, 150);
   	 Thread.sleep(100);
		}
		catch(Exception e3){}
		
		}
		
    }
	public static void remove_illumination(JButton up,JButton down, JButton lift,int temp)
	 {
	     
		lift.setBackground(UIManager.getColor("Button.background"));
	}
	    
	
	public static void request_open_door()
	{
		LiftController.call_ldoor_motor();
	}
	 
	public static void request_close_door()
	{
		LiftController.call_ldoor_motor();
	}
}
