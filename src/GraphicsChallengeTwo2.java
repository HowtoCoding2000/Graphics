import java.awt.*;
import javax.swing.*;

public class GraphicsChallengeTwo2 extends Canvas
	{
		private static final long        serialVersionUID        = 1L;
		
		public static void main(String[] args) 
			{
				GraphicsChallengeTwo2 canvas = new GraphicsChallengeTwo2();
				JFrame frame = new JFrame();
				frame.setSize(500, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.white);
				frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
				frame.setResizable(false);
				frame.setVisible(true);
			}
		public void paint(Graphics graphics)
			{
				for (int b = 0; b <= 255; b++)
					{
						for (int g = 0; g <= 255; g++)
							{
								for (int r = 0; r <= 255; r++)
									{
										graphics.setColor(new Color(r, g, b));
										graphics.fillRect(10, 10, 100, 100);
										//delay();
									}
							}
					}
			}
		public void delay()
        	{
        		try
        			{
        				Thread.sleep(5);
        			} 
        		catch (InterruptedException e)
        			{
        				e.printStackTrace();
        			}
        	}
	}
