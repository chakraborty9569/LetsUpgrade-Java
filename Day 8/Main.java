
public class Main {
	public static void main(String[] args) {
		Doctor d[] = new Doctor[3];
		Engineer e[] = new Engineer[3];
		Pilot p[] = new Pilot[3];
		
		for (int i = 0; i < 3; i++) {
			d[i]=new Doctor();
			
			d[i].getDetails();
			d[i].display();
			d[i].operations();
		}
		
		for (int i = 0; i < 3; i++) {
			e[i]=new Engineer();
			
			e[i].getDetails();
			e[i].display();
			e[i].operations();
		}
		
		for (int i = 0; i < 3; i++) {
			p[i]=new Pilot();
			
			p[i].getDetails();
			p[i].display();
			p[i].operations();
		}
		
	}
}
