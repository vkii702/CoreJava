package threadingDemo;

public class threadDemo extends Thread {
	public void run()//In thread based execution one thread executes first and then it executes another thread.
	{//In thread the run meathod is inbuilt.
		for(int i=0;i<=10;i++) {//using start meathod we are invoking run meathod.
			{
				
				System.out.println("The value of thread"+i);
				while(i==5)
				{
					break;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadDemo th=new threadDemo();
		th.start();
		System.out.println("Main thread start");//by default there is a main thread.
		System.out.println("Main finished");

	}

}
