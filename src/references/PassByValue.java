package references;

public class PassByValue {
	
	public static void changeValue2(int[] d) {  
		   d[1] = 5;
		   int[] b = {0,9,8,7};
		   d = b;
	}  
	 public static void main() {  
	   int[] a = {1,2,3,4};
	   changeValue2(a); 
	   for(int i: a){
		   System.out.println(a[i]); // 1,5,3,4
	   }
	 }
}
