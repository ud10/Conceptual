package threading;
public class Threading {
	 public static void main(String[] args) {
	        new Thread(new B(), "name_thread1").start();
	    }
}
class A implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
 
class B implements Runnable {
 
    public void run() {
        new A().run();
        new Thread(new A(), "name_thread2").run();
        new Thread(new A(), "name_thread3").run();
    }
}
