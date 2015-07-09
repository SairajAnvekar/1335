package evmSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControlUnit cuit=new  ControlUnit();
	
	    BallotUnit bt=new BallotUnit(cuit);
		
		bt.addPannel();	
		bt.addPannel();		
		bt.addPannel();
		bt.addPannel();	
		bt.addPannel();		
		bt.addPannel();	
		
		
		
		
		
	
		System.out.println("******* Adding Candidate*********************");	
		
		bt.panel.get(0).CandidateButn.addCandidate(cuit);
		bt.panel.get(1).CandidateButn.addCandidate(cuit);
		bt.panel.get(2).CandidateButn.addCandidate(cuit);
		bt.panel.get(3).CandidateButn.addCandidate(cuit);
		
		
		
		System.out.println("****************************");	
				
		bt.panel.get(0).CandidateButn.buttonPress(cuit);
		bt.panel.get(1).CandidateButn.buttonPress(cuit);
		bt.panel.get(2).CandidateButn.buttonPress(cuit);
		bt.panel.get(2).CandidateButn.buttonPress(cuit);
		bt.panel.get(2).CandidateButn.buttonPress(cuit);
	
		System.out.println("****************************");	
		System.out.println("cid            vote");	
		cuit.ShowResult();

	}

}
