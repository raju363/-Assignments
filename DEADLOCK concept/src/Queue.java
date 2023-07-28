
public class Queue 
		{
	private int element;

	boolean flag=true;
	synchronized public void read() {
		
			if(!flag) {
				System.out.println(" Read :-"+ element);
				flag=true;
				notify();
			}
			try {
				wait();
			}
			catch(InterruptedException ex){
				ex.printStackTrace();
			}
			
		}
		

	synchronized public void write(int n) {
			if(!flag) {
				this.element=n;
				System.out.println(" Read :-"+ element);
				flag=false;
				notify();
			}
			try {
				wait();
			}
			catch(InterruptedException ex){
				ex.printStackTrace();
			}
		}
		
 static 	class ReadThread implements Runnable{
		Thread t;
		Queue q;
		public ReadThread(Queue q) {
			t= new Thread(this);
			this.q=q;
			t.start();
	}
		public void run()
		{
			while(true)
				q.read();
		}
	}
	static class writeThread implements Runnable
	{
		Thread t;
		Queue q;
		public writeThread(Queue q) {
			t= new Thread(this);
			
			this.q=q;
			t.start();
		}
		public void run() {
			int n=1;
		while(true)
			q.write(n++);	
			
		}
		
	
	}
	 public static void main(String[]args) {
	 
		 	Queue q=new Queue();
		ReadThread t1= new ReadThread(q);
		 writeThread t2= new writeThread(q);
		 try {
			 t1.t.join();
			 t2.t.join();
		 }
		 
		 catch(InterruptedException ex)
		 {
			 System.out.println(ex);
		 }
		 System.out.println("  Main is Terminating");
	 
	 }
		}
	   
	 
	 