package threadingDemo;

public class threadPrioritydemo implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The name of the thread" + Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadPrioritydemo demo=new threadPrioritydemo();
		Thread th=new Thread(demo);
		Thread th1=new Thread(demo);
		Thread th2=new Thread(demo);
		Thread th3=new Thread(demo);
		
		th.setName("Thread1");
		th1.setName("Thread2");
		th2.setName("Thread3");
		th3.setName("thread4");
		
		System.out.println("thread is setting priority");
		
		//Norm_priority=5
		//Max_priority=10
		//min_priority=0
		th.setPriority(Thread.MIN_PRIORITY);
		th1.setPriority(Thread.NORM_PRIORITY);
		th2.setPriority(Thread.MIN_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
		
		th.start();
		th1.start();
		th2.start();
		th3.start();
	}	
}
