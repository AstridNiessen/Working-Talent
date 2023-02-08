
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Het werkt!");
		
		Person p ; //Declaration 
		p = new Person();//Assignment 
		
		Person p2 = new Person(); //Initialization 
		p2.name = "Astrid"; 
		p2.bsn = 34567890;
		p2.lovesProgramming = true;
		p2.printName();
		
		p2.setName("Henk");
		p2.printName();
		
		String p2Name = p2.getName();
		
		Person p3 = new Person("Piet", 23455433); 
		
		
		
		Trainingsgroep t1 = new Trainingsgroep ();
		t1.setSize(13);
		t1.printSize();
		
		t1.setStartingDate("06-02-2023");
		t1.printStartingDate();
		
		int t1Size = t1.getSize();
		t1.printSize();
		
		String t1StartingDate = t1.getStartingDate();
		t1.printStartingDate();
		
		Trainingsgroep t2 = new Trainingsgroep(14, "07-02-2023", "Working talent" , false);
		t2.printStartingDate();

				
	}
		
}
