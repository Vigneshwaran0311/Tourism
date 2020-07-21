package org.locations;

public class Loc {
	

	public void location2() {
		System.out.println("Hyderabad");
	}

	public void location1() {
		System.out.println("Chennai");
  }
	
	public static void main(String[] args) {
		
		Loc l=new Loc();
		l.location1();
        l.location2();
	}

}
