import java.awt.Color;
import java.awt.Graphics;


public class Door extends LiftApplet 
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static void open_door()
	 	{
	    	 check_door=false;
	 		Graphics g;
	         g = frame.getGraphics();
	         
	 		  g.setColor(Color.lightGray);
	 	        while(LiftApplet.x1>410&&x2<537)
	 	        {
	 	        	try{Thread.sleep(20);}catch(Exception e){}
	 	        	g.drawLine(x1,Y,x1,Y+69);
	 	        	g.drawLine(x2,Y,x2,Y+69);
	 	        	x1--;x2++;
	 	        }
	 	}
	 static void close_door()
	 	{
	 		Graphics g;
	 	    g = frame.getGraphics();
	 		 g.setColor(Color.black);
	 	        while(x1<475&&x2>474)
	 	        {
	 	        	try{Thread.sleep(20);}catch(Exception e){}
	 	        	g.drawLine(x1,Y,x1,Y+69);
	 	        	g.drawLine(x2,Y,x2,Y+69);
	 	        	x1++;x2--;
	 	        }
	 	        check_door=true;
	 	}
}
