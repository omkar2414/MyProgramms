package Thread;

public class MyThread implements Runnable {
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try{
				Thread.sleep(1000);
				}catch(Exception e){
					
				}
		}
	}


	public static void main(String[] args) {
		
		MyThread obj = new MyThread();
		Thread thread = new Thread(obj);
		thread.start();

	}
}

	
