public class LiftController extends LiftApplet{
	
	private static final long serialVersionUID = 1L;
	static public boolean lift_req[]=new boolean[8];
	static public boolean up_req[]=new boolean[8];
	static public boolean down_req[]=new boolean[8];
	static public boolean exe_req[]=new boolean[8];
	static public boolean wait_req[]=new boolean[8];
	static public boolean wait2_req[]=new boolean[8];
	
	static int stop=2,up=1,down=0,dir=stop;
	
	
	public static void accept_lift_request(int fno)
	{
		lift_req[fno]=true;
		evaluate_requests();
		
	}
	public static void accept_floor_request(int dir,int fno)
	{
		if(dir==1)
		{
			up_req[fno]=true;
			evaluate_requests();
			
		}
		if(dir==0)
		{
			down_req[fno]=true;
			evaluate_requests();
			
		}
			
	}
		
	public static int evaluate_lift_status()
	{
		int j=0;		
		for(int i=0;i<8;i++)
		{
			if(Sensors.val[i]==true)
			{
				j=i;
			}
		}
		return j;
		
	}
	public static void evaluate_requests()
	{
		
		int status;
		

		status=evaluate_lift_status();
		
		if(dir==stop)
		{
			for(int i=0;i<8;i++)
			{
				if(up_req[i]==true)
				{
					exe_req[i]=true;
					up_req[i]=false;
				}
				if(down_req[i]==true)
				{
					exe_req[i]=true;
					down_req[i]=false;
				}
				if(lift_req[i]==true)
				{
					exe_req[i]=true;
					lift_req[i]=false;
				}
			}
		}
		
		
		if(dir==up)
		{
			
			if((lift_req[status]==true || up_req[status]==true)&& LiftApplet.Ldir==2)
			{
				exe_req[status]=true;
				lift_req[status]=false;
				up_req[status]=false;
			}
			for(int i=status+1;i<8;i++)
			{
				if(lift_req[i]==true)
				{
					exe_req[i]=true;
					lift_req[i]=false;
				}
				if(up_req[i]==true)
				{
					exe_req[i]=true;
					up_req[i]=false;
				}
				if(down_req[7]==true)
				{
					exe_req[7]=true;
					down_req[7]=false;
				}
				
			}
						
			for(int i=0;i<8;i++)
			{
				if(down_req[i]==true)
				{
					wait_req[i]=true;
					down_req[i]=false;
				}
			}
			for(int i=(status-1);i>=0;i--)
			{
				if(down_req[i]==true)
				{
					wait_req[i]=true;
					down_req[i]=false;
				}
				if(lift_req[i]==true)
				{
					wait_req[i]=true;
					lift_req[i]=false;
				}
				if(up_req[i]==true)
				{
					wait2_req[i]=true;
					up_req[i]=false;
				}
			}
		}
		
		
		if(dir==down)
		{
			if((lift_req[status]==true || down_req[status]==true) && LiftApplet.Ldir==2)
			{
				exe_req[status]=true;
				lift_req[status]=false;
				down_req[status]=false;
			}
			for(int i=status-1;i>=0;i--)
			{
				if(lift_req[i]==true)
				{
					exe_req[i]=true;
					lift_req[i]=false;
				}
				if(down_req[i]==true)
				{
					exe_req[i]=true;
					down_req[i]=false;
				}
				if(up_req[0]==true)
				{
					exe_req[0]=true;
					up_req[0]=false;
				}
				
			}
			for(int i=7;i>=0;i--)
			{
				if(up_req[i]==true)
				{
					wait_req[i]=true;
					up_req[i]=false;
				}
			}
			for(int i=(status+1);i<8;i++)
			{
				if(up_req[i]==true)
				{
					wait_req[i]=true;
					up_req[i]=false;
				}
				if(lift_req[i]==true)
				{
					wait_req[i]=true;
					lift_req[i]=false;
				}
				if(down_req[i]==true)
				{
					wait2_req[i]=true;
					down_req[i]=false;
				}
			}
		}
		
		//Displaying the values.
		System.out.print("Execution Queue: ");
		for(int i=0;i<8;i++)
		{
			if(exe_req[i]==true)
			{
				System.out.print(i+" ");
			}
		}
		System.out.print("\nWaiting-1 Queue: ");
		for(int i=0;i<8;i++)
		{
			if(wait_req[i]==true)
			{
				System.out.print(i+" ");
			}
		}
		System.out.print("\nWaiting-2 Queue: ");
		for(int i=0;i<8;i++)
		{
			if(wait2_req[i]==true)
			{
				System.out.print(i+" ");
			}
		}
		System.out.print("\n\n");		
	}
	
	public static void flush()
	{
		boolean check=false;
		for(int j=0;j<8;j++)
		{
			if(wait_req[j]!=false)
			{
				check=true;
			}
		}
		if(check==true)
		{
			for(int i=0;i<8;i++)
			{
				exe_req[i]=wait_req[i];
				wait_req[i]=wait2_req[i];
				wait2_req[i]=false;
			}
		}
		else
		{
			for(int i=0;i<8;i++)
			{
				exe_req[i]=wait2_req[i];
				wait2_req[i]=false;
			}
		}
		/*System.out.print("Execution Queue: ");
		for(int i=0;i<8;i++)
		{
			if(exe_req[i]==true)
			{
				System.out.print(i+" ");
			}
		}
		System.out.print("\nWaiting-1 Queue: ");
		for(int i=0;i<8;i++)
		{
			if(wait_req[i]==true)
			{
				System.out.print(i+" ");
			}
		}
		System.out.print("\nWaiting-2 Queue: ");
		for(int i=0;i<8;i++)
		{
			if(wait2_req[i]==true)
			{
				System.out.print(i+" ");
			}
		}
		System.out.print("\n\n");*/		
	}
	public static void execute()
    {
   	 
   	 int m=1;
   	 boolean c=false;
   	 while(LiftController.exe_req[m]==false)
   	 {
   		 if(LiftController.exe_req[0]==true)
       	 {
   			 c=true;
   			 LiftButton.remove_illumination(up0,dn0,lg,0);
       	 }
   		 m=(m+1)%8;
   	 }
   	 if(c==true)
   	 {
   		 LiftController.exe_req[0]=false;
   		 LiftController.dir=1;
   		 Door.open_door();
   		 try{Thread.sleep(1000);}catch(Exception e){}
   		 Door.close_door();
   	}
   	 if(c==false)
   	 {
   		 Ldir=1;
   		 Motor.move_up();
   	 }
   	 
   	 while(true)
   	 {
	 		if(check_door==true)
   		 {
	 			int temp;
   	 	 		boolean check=false;
   	 	 		if(count>4)
   		 		{
   	 	 			LiftController.dir=2;
   	 	 			int disp=0;
   	 	 			disp=(Y-51)/70;
		 				disp=7-disp;
   		 			Display.display(disp,2);
   		 		}
   	 	 		
   		 		for(int i=0;i<8;i++)
   		 		{
   		 			if(LiftController.exe_req[i]==true)
   		 			{
   		 				if(idleCheck==0)
   		 				count=0;
   		 				check=true;
   		 				temp=(Y-51)/70;
   		 				temp=7-temp;
   		 				if(temp==i)	
   		 				{
   		 					LiftController.exe_req[i]=false;
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
   		 					if(idleCheck==0)
   		 					Door.open_door();
   		 					if(idleCheck==0)
   		 					Door.close_door();
   		 				}
   		 				
   		 				if(temp<i)
   		 				{
   		 					Ldir=1;
   		 					Motor.move_up();
   		 					Ldir=2;
   		 				}
   		 				if(temp>i)
   		 				{
   		 					Ldir=0;
   		 					Motor.move_down();
   		 					Ldir=2;
   		 				}
   		 				idleCheck=0;
   		 			}
   		 		}
   		 		if(check==false)
   		 		{
   		 			
   		 			LiftController.flush();
   		 			count++;
   		 		}
   		 		if(count>10)
   		 		{
   		 			LiftController.dir=2;
   		 		}
   		  	}
	 		
   }
 }
	public static boolean dir_display()
	{
		return true;
	}
	public static int flr_display()
	{
		return 1;
	}
	public static void call_fdoor_motor()
	{
		
	}
	public static void call_ldoor_motor()
	{
		
	}
	public static void call_assistant()
	{
		
	}
}
