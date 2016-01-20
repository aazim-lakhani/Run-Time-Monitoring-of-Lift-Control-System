public aspect Idle_movement 
{
	pointcut checkingIdleTime() : call( void LiftController.flush());
	
	after(): checkingIdleTime()
	{
		
		int max=0;
		
		if(LiftApplet.count==400000)
		{
			for(int i=0;i<8;i++)
			{
				if(statistics.counter[i]>statistics.counter[max])
				{
					max=i;
				}
			}
			if(LiftApplet.idleCheck==0)
			{
				LiftApplet.idleCheck=1;
				LiftController.accept_lift_request(max);
				
			}
		}
	}

}
