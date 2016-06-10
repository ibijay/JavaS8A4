public class MyThread extends Thread{
	MyThread(){
		System.out.println("My Thread Running");
		start();
	}
	public void run(){
		for(int i =0;i<10;i++){
			try{
				System.out.println("Print The Count "+i);
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println("My Thread is Interrupted during sleep "+e);
			}
		}
		System.out.println("My Thread Run is over");
	}
}