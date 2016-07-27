/**
 * 
 */
package abstractClasses;

/**
 * @author uditgupta
 * Jul 6, 2016 12:12:38 PM
 */
abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
}

public class AbstractTest {

	public static void main(String[] args) {
			//here it is an object of anonymous inner class which is a subclass of 'my', rather than the abstract class 'my' itself
		   my m = new my() {};
	       m.mymethod();
	}

}
