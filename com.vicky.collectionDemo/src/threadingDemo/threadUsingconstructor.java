package threadingDemo;

public class threadUsingconstructor implements Runnable {
	Thread th;
	void threadUsingconstructor()
	{
		th=new Thread(this);
		System.out.println("hello form construct");
		th.start();
		System.out.println("Is thread is alive"+th.isAlive());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Invoking the child thread");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread is started");
		System.out.println("Main invoking the object of the child class");
		threadUsingconstructor demo=new threadUsingconstructor();
		demo.run();
		System.out.println("Main finished");

	}

	

}
