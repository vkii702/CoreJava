package threadingDemo;

public class threadLifecycle implements Runnable {
	@Override
	public void run()// run meathod is default meathod that is invoked by start meathod.
	{
			for(int i=0;i<10;i++)
			{
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread started");//first the main thread will execute.
		threadLifecycle th=new threadLifecycle();//as we are implemething runnable interface we have 
		Thread thread=new Thread(th);//we have to pass the object of class to thread class.
		thread.start();//start meathod is used to star the execution of thread.
		try {
			thread.sleep(1000);//sleep meathod is used to sleep the thread for some time.
		} catch (InterruptedException e) {//till that other thread will  start its execution.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main finished");
		
	}

	

}
