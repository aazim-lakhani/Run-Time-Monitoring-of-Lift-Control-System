
public aspect Time_successiveFloor 
{
	
	long stime=0;
	long etime=0;
	pointcut check_Time(): call( void Sensors.sensor(int));
	pointcut moveUp_Time(): execution (void Motor.move_up());
	pointcut moveDown_Time(): execution ( void Motor.move_down());
	before() : check_Time()
	{
		stime=etime;
		etime = System.currentTimeMillis();
		if((etime-stime)>1150)
		{
			LiftApplet.speedtxt.append("Speed of lift is slower [:(]->"+(etime-stime)+'\n');
		}
		else
		{
			LiftApplet.speedtxt.append("Speed of lift is Great  [:)]->"+(etime-stime)+'\n');
		}
	}
	before() : moveUp_Time()
	{
		etime = System.currentTimeMillis();
		
	}
	before() : moveDown_Time()
	{
		etime = System.currentTimeMillis();
	}
}
