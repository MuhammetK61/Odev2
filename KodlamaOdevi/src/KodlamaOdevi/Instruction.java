package KodlamaOdevi;

public class Instruction extends User {
	String branch;
	
	
	public Instruction(){
		
	}
	
	public Instruction(String branch) {
		this.branch=branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
