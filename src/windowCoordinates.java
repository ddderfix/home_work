import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class windowCoordinates extends JFrame{
	
	private BufferedImage image;

	
	public windowCoordinates(String title) {
		
		
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try {
			image = ImageIO.read(new File("start.bmp"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int y = image.getHeight();
		int x = image.getWidth();

		
		setSize(x, y);
		setVisible(true);
		
	}
	
	
	public void paint(Graphics g) {
		
		g.drawImage(image,0,0, null);
		//update(g);
        
    }
	

}
