package Extra_Readings;

public class Person {
	
	private String name;
	private int age;
	
	/*
	 * Its either i use a constructor or i use getters
	 * and setters
	 */
	//***********************************************************
	//setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age >= 18) {
			System.out.println("You are i a legal age");
		}
		else 
			System.out.println("You are below 18 years of age");
			
		{
		
		this.age = age;
	}
	
   }
	//*************************************************************
	//getters
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
