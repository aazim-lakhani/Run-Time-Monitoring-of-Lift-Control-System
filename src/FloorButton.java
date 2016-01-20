import javax.swing.JButton;
import javax.swing.UIManager;


public class FloorButton {
	public static int dir;
	public static boolean up[] = new boolean[8];
	public static boolean down[] = new boolean[8];
	public FloorButton()
	{
		for(int i=0;i<8;i++)
		{
			up[i]=false;
			down[i]=false;
		}
	}
	public static void remove_illumination(JButton up,JButton down, JButton lift,int temp)
	 {
	     
		 if(FloorButton.up[temp]==true && FloorButton.down[temp]==true)
		 {
			 if(LiftController.dir==1)
			 {
				 FloorButton.up[temp]=false;
				 up.setBackground(UIManager.getColor("Button.background"));
			}
			 if(LiftController.dir==0)
			 {
				 FloorButton.down[temp]=false;
				 down.setBackground(UIManager.getColor("Button.background"));
			 }
		 }
		 else
		 {
			 
			 FloorButton.up[temp]=false;
			 FloorButton.down[temp]=false;
			 up.setBackground(UIManager.getColor("Button.background"));
			 down.setBackground(UIManager.getColor("Button.background"));
		 }
	}
	    
	static void request_up(int fno)
	{
		dir=1;
		LiftController.accept_floor_request(dir,fno);
		
	}
	static void request_down(int fno)
	{
		dir=0;
		LiftController.accept_floor_request(dir,fno);
	}
}
