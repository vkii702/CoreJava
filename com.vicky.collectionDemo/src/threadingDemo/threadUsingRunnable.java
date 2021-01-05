package threadingDemo;
class Student implements Runnable 
{

	@Override
	 public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from run1");
		
	}
	
}
public class threadUsingRunnable extends  Student{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Invoked child thread..");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		threadUsingconstructor demo=new threadUsingconstructor();
		Student s1=new Student();
		Thread th=new Thread(demo);
		th.start();
		Thread th1=new Thread(demo);
		th1.start();
		Thread th2=new Thread(s1);
		th2.start();
		System.out.println("Main finished");

	}

	

}
