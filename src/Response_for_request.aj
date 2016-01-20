
public aspect Response_for_request 
{
	long ltime[]=new long[8];
	long uptime[]=new long[8];
	long downtime[]=new long[8];
	pointcut assignlift() : execution(void LiftController.accept_lift_request(int));
	pointcut assignfloor() : execution(void LiftController.accept_floor_request(int,int));
	pointcut check() : execution(void Motor.move_up()) || execution(void Motor.move_down());
	
	after() : check()
	{
		int x=0;
		x=((LiftApplet.Y)-51)/70;
		x=7-x;
		long ctime=System.currentTimeMillis();
		if((ctime-ltime[x])>25000 && (ctime-ltime[x])<1000000)
		{
			LiftApplet.maltxt.append("Lift took longer to service the current request\n");
			ltime[x]=0;
		}
		if((ctime-uptime[x])>25000 && (ctime-uptime[x])<1000000)// && LiftController.dir==1
		{
			LiftApplet.maltxt.append("Lift took longer to service the current request \n");
			uptime[x]=0;
		}
		if((ctime-downtime[x])>25000 && (ctime-downtime[x])<1000000)// && LiftController.dir==0
		{
			LiftApplet.maltxt.append("Lift took longer to service the current request \n");
			downtime[x]=0;
		}
	}
	after(int x): assignlift() && args(x)
	{
		ltime[x]=System.currentTimeMillis();
	}
	after(int x,int y) : assignfloor() && args(x,y)
	{
		if(x==1)
			uptime[y]=System.currentTimeMillis();
		else
			downtime[y]=System.currentTimeMillis();
	}
}
