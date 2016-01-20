import java.awt.Color;
import java.awt.Graphics;


public class Sensors extends LiftApplet{
	
	private static final long serialVersionUID = 1L;
	public static boolean val[] = new boolean[8];
	public Sensors()
	{
		val[0]=true;
		for(int i=1;i<8;i++)
		{
			val[i]=false;
		}
	}
	
	public static void pressed(int k)
	{
		for(int i=0;i<8;i++)
		{
			val[i]=false;
		}
		val[k]=true;
		
		}
	 public static void sensor(int temp)
     {
    	 Graphics g;
    	 g=frame.getGraphics();
    	  	
    		 int w=50;
		     g.setColor(Color.red);
    		 for(int i=0;i<8;i++)
    		 {
    			 	
    		        g.fillOval(400,w, 10, 10);
    		        g.fillOval(540,w, 10, 10);
    		        w=w+70;
    		 }
    		    g.setColor(Color.green);
 		    	g.fillOval(400, Y-1, 10, 10);
		        g.fillOval(540, Y-1, 10, 10);
		        g.setColor(Color.black);
    	}
	
}
