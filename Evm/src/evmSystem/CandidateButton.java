package evmSystem;

public class CandidateButton   {
	
	int setUp=1;	
	int index;
	
	


	
	public CandidateButton(int size) {
	
	   index=size;
	}


	public int getSetUp() {
		return setUp;
	}


	public void setSetUp(int setUp) {
		this.setUp = setUp;
	}

	public int  buttonPress(ControlUnit cunit )
	{
		if (setUp==1)
		{
			
			cunit.count(index);
			 return 1;
		}
		
		
		return 0;
	}
	
	
	
	
	
	public int addCandidate(ControlUnit cunit )
	{
		if (setUp==1)
		{
			
			cunit.addCandidate();
			 return 1;
		}
		
		return 0;
	}
	
	

}
