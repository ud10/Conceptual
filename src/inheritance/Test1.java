/**
 * 
 */
package inheritance;

/**
 * @author uditgupta
 * Jul 21, 2016 5:58:23 PM
 */

class Base {
	public void m1(){
		System.out.println("m1: base");
	}
}
class Derived extends Base{
	public void m1(){
		System.out.println("m1: derived");
	}
}
public class Test1 {

	public static void main(String[] args){
		Derived d = new Derived();
		Base b = new Derived();
		Base b1 = new Base();
		d.m1();
		b.m1();
		b1.m1();
	}
}
