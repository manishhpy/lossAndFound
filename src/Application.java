class A extends Thread{
	
	public void run() { 
		for(int i=1;i<=50;i++){
			System.out.println("A....."+i);
			try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
	
}

class B extends Thread{
	
	public void run() { 
		for(int i=1;i<=50;i++){
			System.out.println("B....."+i);
			try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }

		}
	}
	
	
}



public class Application {

	public static void main(String[] args) {
		System.out.println("Inside Main Class");
//		for(int i=0;i<50;i++){
//			System.out.println("Inside Main Class....."+i);
//		}
		
		
		A a = new A();
		B b = new B();
		
		
		a.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
		
		
		
	}

}
