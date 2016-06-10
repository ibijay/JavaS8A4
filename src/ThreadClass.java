public class ThreadClass {
	public static void main(String[] args){
		MyThread mt = new MyThread();
		while (mt.isAlive())
		{
			try {
				System.out.println("Main Thread is Alive until Child Thread is Running");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Main Thread is Interrupted during sleep "+e);;
			}
		}
		System.out.println("Main Thread Run is over");
	}
}