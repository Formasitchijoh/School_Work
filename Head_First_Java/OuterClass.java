package W3School;

public class OuterClass {

	 int x = 10;

	static class InnerClass{
		 int y =5;
	 }
	 
	public static void main(String[] args) {
		//instantiating the Outerclass
		OuterClass myOuter = new OuterClass();
		
	//	OuterClass.InnerClass myInner = myOuter.new InnerClass();
		OuterClass.InnerClass myInner = new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}

}
