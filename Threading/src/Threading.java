import java.util.*;

class Threadrun extends Thread{
	public void run() {
		System.out.println("Thread Running");
		
	}
}


class Threadstart extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try{
				Thread.sleep(5000);
				}catch(InterruptedException e) {
					System.out.println(e);
					
				}
			System.out.println(i);
		}
	}
}

public class Threading {

	public static void main(String[] args) {
		
		Threadrun T1 = new Threadrun();
		Threadstart T2 = new Threadstart();
		T2.start();
		
		T1.start();
		
	}

}
