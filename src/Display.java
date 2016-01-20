import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;


public class Display extends LiftApplet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void display(int temp,int di)
    {
   	 Graphics g;
 		g=frame.getGraphics();
   	 String s = Integer.toString(temp);
   	 if(di==1)
   	 {
   		 try{
   	    	 Image img = ImageIO.read(new File("C:/Documents and Settings/MOIZ/workspace/Trial Applet Problem Successful/src/up.jpg"));
   	    	 
   	    	 
   	 	 text0.setText(s);
   	 	 g.drawImage(img, 55, 70, 25, 20, null);
      		 text1.setText(s);
      		 g.drawImage(img, 55, 140, 25, 20, null);
   		 text2.setText(s);
   		 g.drawImage(img, 55, 210, 25, 20, null);
   		 text3.setText(s);	
   		 g.drawImage(img, 55, 280, 25, 20, null);
   	 	 text4.setText(s);
   	 	 g.drawImage(img, 55, 350, 25, 20, null);
   	 	 text5.setText(s);
   	 	 g.drawImage(img, 55, 420, 25, 20, null);
   	 	 text6.setText(s);
   	 	 g.drawImage(img, 55, 490, 25, 20, null);
   	 	 text7.setText(s);
   	 	 g.drawImage(img, 55, 560, 25, 20, null);
   	 	 textl.setText(s);
   	 	 g.drawImage(img, 915, 240, 75, 75, null);
   		 }
	 		catch(Exception e3){}
   	 }
   	 if(di==0)
   	 {
   		 try{
   	    	 Image img = ImageIO.read(new File("C:/Documents and Settings/MOIZ/workspace/Trial Applet Problem Successful/src/down.jpg"));
   	    	 
   	    	 
   	 	 text0.setText(s);
   	 	 g.drawImage(img, 55, 70, 25, 20, null);
      		 text1.setText(s);
      		 g.drawImage(img, 55, 140, 25, 20, null);
   		 text2.setText(s);
   		 g.drawImage(img, 55, 210, 25, 20, null);
   		 text3.setText(s);	
   		 g.drawImage(img, 55, 280, 25, 20, null);
   	 	 text4.setText(s);
   	 	 g.drawImage(img, 55, 350, 25, 20, null);
   	 	 text5.setText(s);
   	 	 g.drawImage(img, 55, 420, 25, 20, null);
   	 	 text6.setText(s);
   	 	 g.drawImage(img, 55, 490, 25, 20, null);
   	 	 text7.setText(s);
   	 	 g.drawImage(img, 55, 560, 25, 20, null);
   	 	 textl.setText(s);
   	 	 g.drawImage(img, 915, 240, 75, 75, null);
   		 }
	 		catch(Exception e3){}
   	 }
   	 if(di==2)
   	 {
   		 g.setColor(Color.white);
   		 g.fillRect(55, 70, 25, 20);
   		 g.fillRect(55, 140, 25, 20);
   		 g.fillRect(55, 210, 25, 20);
   		 g.fillRect(55, 280, 25, 20);
   		 g.fillRect(55, 350, 25, 20);
   		 g.fillRect(55, 420, 25, 20);
   		 g.fillRect(55, 490, 25, 20);
   		 g.fillRect(55, 560, 25, 20);
   		 g.fillRect(915, 240, 75, 75);
   		 g.setColor(Color.black);

   	 }
   	 
    }
}
