import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;




public class Start_window extends JFrame{
	
	


	public Start_window(String title){
		
	
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		  final Dimension startWindowSize = new Dimension(200,300);
		 
		
	 final JButton Start_Button = new JButton("STARt");
	Start_Button.setBackground(Color.RED);
	Start_Button.setPreferredSize(new Dimension(80,40));
	Start_Button.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
			
		}
		
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			System.out.println("==*************==");
			System.out.println("==> функция старт");
		
			
			//////разрешение экрана
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			System.out.println("разрешение экрана "+ dim.width + "x" + dim.height);
			
			//кнопка старт, делаем скриншот области
		
			
			new ScreenShot(0,0, dim.width, dim.height, "start");
			
			
			
			System.out.println("кнопка старт/вызов функции ScreenShot");
			
			//
			
			BufferedImage nw_search = null;
			BufferedImage start = null;
			try {
				nw_search = ImageIO.read(new File("nw_search.bmp"));
				start = ImageIO.read(new File("start.bmp"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("читаем файл картинки");
			
			
			 
			
			search sh = new search ( );
			if (sh.search(start, nw_search)){
				Start_Button.setBackground(Color.green);
				 
				 startWindowSize.height = 200;
				 startWindowSize.width = 1024;
				
				 setSize(startWindowSize);
					
				
				System.out.println(sh.resultSearch);	
			}else {
				Start_Button.setBackground(Color.black);
				System.out.println(sh.resultSearch);} 
				
				
		//	System.out.println(start.getRGB(19, 678) + " " + nw_search.getRGB(0, 0));	 
			
			System.out.println("==> функция старт конец");
			System.out.println("==*************==");
		}
	});
	
	
	
	add(Start_Button);
	setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
	
	setSize(startWindowSize);
	
	setVisible(true);
	}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Start_window("assistant_nw");
		
	}

}
