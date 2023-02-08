
public class Trainingsgroep {

	private int size;
	private String startingDate;
	private String name; 
	private boolean allAssigned; 
	
	public Trainingsgroep() {
		size = 13;
	}
	public Trainingsgroep(int size,String startingDate) {
		this.size = size ;
		this.startingDate = startingDate;
	}
	public Trainingsgroep(int size, String startingDate, String name, boolean allAssigned) {
	 this.size = size;
	 this.startingDate = startingDate;
	 this.name = name; 
	 this.allAssigned = allAssigned; 
	}

	
	public void printSize() {
		System.out.println("size = " + this.size);
	}
	
	public void printStartingDate() {
		System.out.println("StartingDate="+ this.startingDate);
	}
	public void setSize(int a ) {
		size = a ; 
	}
	public void setStartingDate(String b) {
		startingDate = b ; 
	}
	public int getSize() { 
		return size;
	}
	public String getStartingDate() { 
		return startingDate; 
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAllAssigned() {
		return allAssigned;
	}

	public void setAllAssigned(boolean allAssigned) {
		this.allAssigned = allAssigned;
	}
	

	
}
