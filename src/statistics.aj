
public aspect statistics 
{
	static int[] counter = {0,0,0,0,0,0,0,0};
	
	LiftApplet L= new LiftApplet();
	pointcut count() : (execution ( void Motor.move_up()) || 
					   execution ( void Motor.move_down()));
	
	after() : count()
	{
		int flr=L.getfloor();
		counter[flr]++;
		LiftApplet.totaltxt.append("{");
		for(int i=0;i<8;i++)
			LiftApplet.totaltxt.append(counter[i]+",");
		LiftApplet.totaltxt.append("}\n");
	}

}

