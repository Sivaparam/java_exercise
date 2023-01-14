package jan13;

import java.awt.datatransfer.SystemFlavorMap;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int a = 10;
		
		try {
			
			int c = a/1;
			System.out.println(c);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside catch block");
		}	
		
	}

}
