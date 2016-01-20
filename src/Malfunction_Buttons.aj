import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public aspect Malfunction_Buttons 
{
	//ActionEvent e;
	
	int x;
	pointcut checking() : execution( void LiftApplet.actionPerformed(ActionEvent) );
	pointcut checkUpreq() : call ( void FloorButton.request_up(int));
	pointcut checkDownreq() : call ( void FloorButton.request_down(int));
	pointcut checkLiftreq() : call ( void LiftButton.request(int));
	after(ActionEvent e) : checking() && args(e)
	{
		
		if(e.getSource().equals(LiftApplet.up0) && x!=0)
        {
      	  LiftApplet.maltxt.append("Malfunctioing of Floor-0 UP Button\n");
        }
        if(e.getSource().equals(LiftApplet.up1) && x!=1)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-1 UP Button\n");
        }
        if(e.getSource().equals(LiftApplet.up2) && x!=2)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-2 UP Button\n");
        }
        if(e.getSource().equals(LiftApplet.up3) && x!=3)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-3 UP Button\n");
        }
        if(e.getSource().equals(LiftApplet.up4) && x!=4)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-4 UP Button\n");
        }
        if(e.getSource().equals(LiftApplet.up5) && x!=5)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-5 UP Button\n");
        }
        if(e.getSource().equals(LiftApplet.up6) && x!=6)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-6 UP Button\n");
        }
        if(e.getSource().equals(LiftApplet.dn1) && x!=1)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-1 DOWN Button\n");
        }
        if(e.getSource().equals(LiftApplet.dn2) && x!=2)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-3 DOWN Button\n");
        }
        if(e.getSource().equals(LiftApplet.dn4) && x!=4)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-4 DOWN Button\n");
        }
        if(e.getSource().equals(LiftApplet.dn5) && x!=5)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-5 DOWN Button\n");
        }
        if(e.getSource().equals(LiftApplet.dn6) && x!=6)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-6 DOWN Button\n");
        }
        if(e.getSource().equals(LiftApplet.dn7) && x!=7)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Floor-7 DOWN Button\n");
        }
        if(e.getSource().equals(LiftApplet.lg) && x!=0)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Lift-0 Button\n");
        }
        if(e.getSource().equals(LiftApplet.l1) && x!=1)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Lift-1 Button\n");
        }
        if(e.getSource().equals(LiftApplet.l2) && x!=2)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Lift-2 Button\n");
        }
        if(e.getSource().equals(LiftApplet.l3) && x!=3)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Lift-3 Button\n");
        }
        if(e.getSource().equals(LiftApplet.l4) && x!=4)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Lift-4 Button\n");
        }
        if(e.getSource().equals(LiftApplet.l5) && x!=5)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Lift-5 Button\n");
        }
        if(e.getSource().equals(LiftApplet.l6) && x!=6)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Lift-6 Button\n");
        }
        if(e.getSource().equals(LiftApplet.l7) && x!=7)
        {
        	LiftApplet.maltxt.append("Malfunctioing of Lift-7 Button\n");
        }
        
	}
	before(int x1): checkUpreq() && args(x1)
	{
		x=x1;
		
	}
	before(int x1): checkDownreq() && args(x1)
	{
		x=x1;
		
	}
	before(int x1): checkLiftreq() && args(x1)
	{
		x=x1;
		
	}
}
