import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.omg.CORBA.PUBLIC_MEMBER;




 class ScreenShot  {
	 
	

	public  ScreenShot ( int x,  int y,int width, int height, String title )  {
			
		System.out.println("==> функция скриншот");
			Robot robot = null;
			
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
			 BufferedImage screenShot = robot.createScreenCapture(new Rectangle(x,y,width,height));
			System.out.println("делаем скриншот");
						
			try {
				ImageIO.write(screenShot, "BMP", new File(title+".bmp"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			System.out.println("==> функция скриншот конец");
		//return screenShot;
		 
	 }


	}

