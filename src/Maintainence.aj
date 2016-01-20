
public aspect Maintainence 
{
	int ifExceed=0;
	pointcut maintain() : execution( void Sensors.sensor(int));

	after() : maintain()
	{
		ifExceed++;
		if(ifExceed>20)
		{
			if((ifExceed%5)==0)
				LiftApplet.maltxt.append("Lift requires Maintainence\n");
		}
	}
}
