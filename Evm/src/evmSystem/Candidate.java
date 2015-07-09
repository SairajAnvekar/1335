package evmSystem;

public class Candidate {
	
	
	
    int cid;
	double count=0;
	
	
	
	public Candidate(int candidateNo) {
		// TODO Auto-generated constructor stub
		cid=candidateNo;
	}



	public void count()
	{
		count=count+1;
	}
	
	
	
	public void  Show()
	{
		
		System.out.println(cid+"                "+count);
	}
	
	
	
	
	

}
