package chapter5;

public class p44 {
	public static void main(String[] args) {
		Car3 car1= new Car3("1號車");
		car1.start();
		
		for(int i = 0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car3 extends Thread{
	private String name;
	
	public Car3(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}