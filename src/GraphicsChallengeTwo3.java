import java.awt.*;
import javax.swing.*;

public class GraphicsChallengeTwo3 extends Canvas
	{
		private static final long        serialVersionUID        = 1L;
		static int x = 0;
		static int y = 0;
		public static void main(String[] args) 
			{
				GraphicsChallengeTwo3 canvas = new GraphicsChallengeTwo3();
				JFrame frame = new JFrame(); //Creates new frame
				frame.setSize(500, 500); //Sets frame size
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Allows X to close the frame
				frame.getContentPane().add(canvas).setBackground(Color.white); //Sets background color to white
				frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
				frame.setResizable(false); //Allows frame size to be changed
				frame.setVisible(true); //Makes frame visible
			}
		public void paint(Graphics graphics)
			{
				while(x < 460 || y < 460)
					{
						graphics.setColor(Color.white);
						graphics.fillRect(x - 5, y - 5, 20, 20);
						graphics.setColor(Color.BLACK);
						graphics.fillRect(x, y, 20, 20);
						delay();
						x = x + 5;
						y = y + 5;
					}
			}
		public static void delay()
			{
				try
        			{
        				Thread.sleep(50);
        			} 
        		catch (InterruptedException e)
        			{
        				e.printStackTrace();
        			}
			}
	}
