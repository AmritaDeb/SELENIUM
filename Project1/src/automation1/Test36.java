package automation1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Test36 {
	
	public static void main(String[] args) throws Exception{
		
//		Robot r = new Robot();
//		for(int i=1; i<=500; i=i+10){
//			r.mouseMove(200+i, 100);
//			Thread.sleep(1000);
//		}
		
		//Runtime.getRuntime().exec("calc");
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_I);
	
	}

}
