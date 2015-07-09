package evmSystem;

import java.util.ArrayList;

public class ControlUnit {
	
	
	int candidateNo=0;
	ArrayList<Candidate> candidate=new ArrayList <Candidate>();
	//CandidateSetPanel setCanPanel=new CandidateSetPanel(); 
	//BallotUnit bUnit=new BallotUnit();
	
	
	public void  addCandidate()
	{
		candidateNo++;
	
	candidate.add(new Candidate(candidateNo));
	}
	
	
	public void count(int index)
	{
       candidate.get(index).count();
		
	}
	
	
	public void ShowResult()
	{
		for(int i=0;i<candidate.size();i++)
		{
			
			candidate.get(i).Show();
		}
		
		
	}
	
	
	
	
	
	
	

}
