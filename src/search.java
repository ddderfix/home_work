import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class search {

	static boolean resultSearch = false;
	public boolean search (BufferedImage screenShot, BufferedImage readImage ){
		
		System.out.println("==> функция поиск");
		
		
		Robot robot = null;
		
for(int x =0;x< screenShot.getWidth() ;x++){
			
			for(int y=0;y< screenShot.getHeight();y++){
				//System.out.println(x+" " +y);
				if(y+3<screenShot.getHeight()){
					if(screenShot.getRGB(x, y)== readImage.getRGB(0, 0) &
							screenShot.getRGB(x, (y+1))== readImage.getRGB(0, 1) &
							screenShot.getRGB(x, (y+2))== readImage.getRGB(0, 2) &
							screenShot.getRGB(x, (y+3))== readImage.getRGB(0, 3)){
						System.out.println(x+" " +y);
						//robot.mouseMove(x+758,y-515);
						//robot.mouseRelease(InputEvent.BUTTON1_MASK);
						//robot.mousePress(InputEvent.BUTTON1_MASK);
						//robot.delay(10);
						//robot.mouseRelease(InputEvent.BUTTON1_MASK);
						//robot.mousePress(InputEvent.BUTTON1_MASK);
						resultSearch = true;	
						
						System.out.println(" !!!!!!!! найдено !!!!!!!!!!");
						
						//BufferedImage screenShot2 = robot.createScreenCapture(new Rectangle(y,x,100,100));
						//ImageIO.write(screenShot2, "BMP", new File("new_screenShot_"+x+"_"+y+".bmp"));
								};
								
							//	System.out.println(x + " не найдено");
				};
				//System.out.println(x+" " +y);
				//System.out.println(screenShot.getRGB(y, x));
			};
			
		};
	
		System.out.println("==> функция поиск конец");
		return resultSearch;
		
	}
	
	
}
