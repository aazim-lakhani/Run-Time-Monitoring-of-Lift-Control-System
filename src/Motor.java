import java.awt.Color;
import java.awt.Graphics;


public class Motor extends LiftApplet {
	//1-up 0-down 2-stop
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int dir=2,prev=2;
	//Motor m;
	public static void move_up()
    {
   	 
   	 Graphics g;
        g = frame.getGraphics();
   	// structure();
   	 LiftController.dir=1;
		  flag=true;
		  while(flag==true && Y>51){
      	   Y--;
         	  try{Thread.sleep(10);}catch(Exception e){}
             g.setColor(Color.WHITE);
             g.fillRect(411, Y+1, 128, 70);
             g.setColor(Color.black);
        	  g.fillRect(411, Y, 128, 70);
          int temp;
		   temp=(Y-51)/70;
		   temp=7-temp;
		   Sensors.pressed(temp);
		   if((Y-51)%70==0)
		   {
			   Sensors.sensor(1);
			  Display.display(temp,1);
			  if(LiftController.exe_req[temp]==true)
			   {
				  
				  switch(temp)
		 		   {
		 		   case 0 : LiftButton.remove_illumination(up0,dn0,lg,0);FloorButton.remove_illumination(up0,dn0,lg,0);break;
		  		   case 1 : LiftButton.remove_illumination(up1,dn1,l1,1);FloorButton.remove_illumination(up1,dn1,l1,1);break;
		  		   case 2 : LiftButton.remove_illumination(up2,dn2,l2,2);FloorButton.remove_illumination(up2,dn2,l2,2);break;
		  		   case 3 : LiftButton.remove_illumination(up3,dn3,l3,3);FloorButton.remove_illumination(up3,dn3,l3,3);break;
		  		   case 4 : LiftButton.remove_illumination(up4,dn4,l4,4);FloorButton.remove_illumination(up4,dn4,l4,4);break;
		  		   case 5 : LiftButton.remove_illumination(up5,dn5,l5,5);FloorButton.remove_illumination(up5,dn5,l5,5);break;
		  		   case 6 : LiftButton.remove_illumination(up6,dn6,l6,6);FloorButton.remove_illumination(up6,dn6,l6,6);break;
		  		   case 7 : LiftButton.remove_illumination(up7,dn7,l7,7);FloorButton.remove_illumination(up7,dn7,l7,7);break;
		  		   }
				   Motor.motor_stop();
				   flag=false;
				    LiftController.exe_req[temp]=false;
				  	if(idleCheck==0)
				    Door.open_door();
				  	try{Thread.sleep(1000);}catch(Exception e){}
				 	if(idleCheck==0)
				 	Door.close_door();
				 }
		   }
       }
		  try{Thread.sleep(1000);}catch(Exception e){}
            
    }
	public static void move_down()
    {
   	 flag=true;
    	LiftController.dir=0;
		//structure();
		Graphics g;
		g = frame.getGraphics();
		while(flag==true && Y<541)
	   {
			if(flag==false)
			{
				break;
			}
			Y++;
		   try{Thread.sleep(10);}catch(Exception e){}
		   g.setColor(Color.WHITE);
		   g.fillRect(411, Y-1, 128, 70);
		   g.setColor(Color.black);
		   g.fillRect(411, Y, 128, 70);
		   int temp;
		   temp=(Y-51)/70;
		   switch(temp)
  		   {
  		   case 0 : Sensors.pressed(7);temp=7;break;
  		   case 1 : Sensors.pressed(6);temp=6;break;
  		   case 2 : Sensors.pressed(5);temp=5;break;
  		   case 3 : Sensors.pressed(4);temp=4;break;
  		   case 4 : Sensors.pressed(3);temp=3;break;
  		   case 5 : Sensors.pressed(2);temp=2;break;
  		   case 6 : Sensors.pressed(1);temp=1;break;
  		   case 7 : Sensors.pressed(0);temp=0;break;
  		   }
		  if((Y-51)%70==0)
		   {
			  Sensors.sensor(0);
			 Display.display(temp,0); 
			  if(LiftController.exe_req[temp]==true)
			   {
				   
				   switch(temp)
		 		   {
		 		   case 0 : LiftButton.remove_illumination(up0,dn0,lg,0);FloorButton.remove_illumination(up0,dn0,lg,0);break;
		  		   case 1 : LiftButton.remove_illumination(up1,dn1,l1,1);FloorButton.remove_illumination(up1,dn1,l1,1);break;
		  		   case 2 : LiftButton.remove_illumination(up2,dn2,l2,2);FloorButton.remove_illumination(up2,dn2,l2,2);break;
		  		   case 3 : LiftButton.remove_illumination(up3,dn3,l3,3);FloorButton.remove_illumination(up3,dn3,l3,3);break;
		  		   case 4 : LiftButton.remove_illumination(up4,dn4,l4,4);FloorButton.remove_illumination(up4,dn4,l4,4);break;
		  		   case 5 : LiftButton.remove_illumination(up5,dn5,l5,5);FloorButton.remove_illumination(up5,dn5,l5,5);break;
		  		   case 6 : LiftButton.remove_illumination(up6,dn6,l6,6);FloorButton.remove_illumination(up6,dn6,l6,6);break;
		  		   case 7 : LiftButton.remove_illumination(up7,dn7,l7,7);FloorButton.remove_illumination(up7,dn7,l7,7);break;
		  		   }
				   Motor.motor_stop();
				   flag=false;
				  LiftController.exe_req[temp]=false;
				  if(idleCheck==0)
				  Door.open_door();
				 try{Thread.sleep(1000);}catch(Exception e){}
				 if(idleCheck==0)
				 Door.close_door();
				 		 
			   }
		   }
       }
		try{Thread.sleep(1000);}catch(Exception e){}
	}
   
	
	public static void motor_stop()
	{
		
	}

	public static void check_motor()
	{
		
	}
}
