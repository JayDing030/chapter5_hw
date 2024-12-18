package chapter5;

public class p50 {
	public static void main(String[] args) {
		Car8 car1= new Car8("1號車");

		Thread th1 = new Thread(car1);
		th1.start();
		
		for(int i = 0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car8 implements Runnable{
	private String name;
	
	public Car8(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}