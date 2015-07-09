package evmSystem;

public class CandidateButton extends BallotUnit{
	
	int setUp=0;	
	
	
	
	
	public int getSetUp() {
		return setUp;
	}


	public void setSetUp(int setUp) {
		this.setUp = setUp;
	}

	public int  buttonPress( )
	{
		if (setUp==1)
		{
			
			cunit.count(0);
			 return 1;
		}
		
		return 0;
	}
	

}
