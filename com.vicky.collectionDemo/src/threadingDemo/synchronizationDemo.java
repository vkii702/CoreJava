package threadingDemo;

public class synchronizationDemo implements Runnable {
	//Synchroniaztion is process that one threads will get the resources at one time.
	 synchronized public void disp() {//to achive synchronization we used keyword "Synchronized" 
		for(int i=0;i<=10;i++)
		{
		System.out.println(Thread.currentThread().getName()+"-"+i);
		}
		System.out.println();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		disp();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main threads");
		synchronizationDemo demo=new synchronizationDemo();
		Thread th=new Thread(demo);
		Thread th1=new Thread(demo);
		
		th.setName("Thread 1");
		th1.setName("Thread 2");
		th.start();
		th1.start();
		System.out.println("main finished");
		
	}

	
}
