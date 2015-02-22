import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;


public class ivent {
	
	
	public void iventChangeClothes(){
		
				
		
	}
	
	public void iventRegistration() {
		
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.mouseMove(10, 100);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
				
		
	}
	
	

}
