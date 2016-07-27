/**
 * 
 */
package basics;

/**
 * @author uditgupta
 * Jul 10, 2016 12:44:04 AM
 */
public class Test1 {
	static int val = 1;
	public int getVal(){
		try{
			val += 1;
			return val;
		}catch(Exception e){
			return 0;
		}finally{
			System.out.println("Value in finally is:" + Test1.val);
			val += 1;
			System.out.println("Second Value in finally is:" + Test1.val);
			//return val;
		}
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		System.out.println("Value is:" + t.getVal());
		System.out.println("Value is:" + Test1.val);
	}
}
