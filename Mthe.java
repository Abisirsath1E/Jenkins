package simple.program;    

public class Mthe {
	
	int x=11;
	int y=9;
	void addition () 
	{
		int z=x+y;
		System.out.println(z); 
	}
	
	void substraction ()
	{ int z=x/y;
	System.out.println(z);
	}
	void multiplication ()
	
	{int z=x%y;
	System.out.println(z);
	}
	public static void main(String [] args) {
	Mthe calculation = new Mthe();
	calculation . addition();
	calculation . substraction();
	calculation . multiplication();
	
	
	}
			}

