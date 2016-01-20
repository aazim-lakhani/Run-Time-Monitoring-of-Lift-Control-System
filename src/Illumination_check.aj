import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
public aspect Illumination_check 
{
	pointcut checkbgColor() : execution(void LiftApplet.actionPerformed(ActionEvent));
	
	after(ActionEvent e): checkbgColor() && args(e)
	{
		JButton J=(JButton) e.getSource();
		Color c;
		c=J.getBackground();
		if(c!=Color.green && !(e.getSource().equals(LiftApplet.lift)) && !(e.getSource().equals(LiftApplet.stp)) 
				&& !(e.getSource().equals(LiftApplet.alarm)) && !(e.getSource().equals(LiftApplet.call))
				&& !(e.getSource().equals(LiftApplet.open)) && !(e.getSource().equals(LiftApplet.close)))
		{
			LiftApplet.maltxt.append("Illimination of some Button is not working properly\n");
			
		}
		
	}
}
