package evmSystem;

import java.util.ArrayList;

public class BallotUnit {
	
	int noOfCandidate;

	
	BallotLamp  lamp=new BallotLamp();;
	//Panel panel=new Panel();
	ArrayList<Panel> panel=new ArrayList<Panel>();	
	ControlUnit cunit;
	
		
	BallotUnit(ControlUnit cunit)
	{
		this.cunit=cunit;
	}
	
	
	
	public void  addPannel()
	{  
		panel.add(new Panel(panel.size()));
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
