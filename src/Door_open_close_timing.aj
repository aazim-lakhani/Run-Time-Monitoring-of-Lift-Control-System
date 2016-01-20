
public aspect Door_open_close_timing 
{
	long etime,stime;
	pointcut close_door(): execution( void Door.close_door());
	pointcut open_door(): execution( void Door.open_door());
	before():open_door()
	{
		stime = System.currentTimeMillis();
		
	}

	after():open_door()
	{
		etime= System.currentTimeMillis();
		if(etime-stime>=2500)
		{
			LiftApplet.maltxt.append("Error: Too much time to open the door. Get it recitified Honey\n");
		}
	}
	before():close_door()
	{
		stime = System.currentTimeMillis();
		
	}

	after():close_door()
	{
		etime= System.currentTimeMillis();
		if(etime-stime>=2500)
		{
			LiftApplet.maltxt.append("Error: Too much time to close the door. Get it recitified Honey\n");
		}
	}
}
