import java.awt.*;
import javax.swing.*;

public class GraphicsChallengeTwo5 extends Canvas
	{
		private static final long        serialVersionUID        = 1L;
		
		public static void main(String[] args) 
			{
				GraphicsChallengeTwo5 canvas = new GraphicsChallengeTwo5();
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
				int n = 1;
				
				for (int y = 0; y < 160; y = y + 20)
					{
						if (n == 1)
							{
								graphics.setColor(Color.red);
								for (int x = 0; x < 160; x = x + 40)
									{
										graphics.fillRect(x , y, 20, 20);
									}
								graphics.setColor(Color.green);
								for (int x = 20; x < 180; x = x + 40)
									{
										graphics.fillRect(x , y, 20, 20);
										n = 2;
									}
							}
						else if (n == 2)
							{
								graphics.setColor(Color.red);
								for (int x = 20; x < 180; x = x + 40)
									{
										graphics.fillRect(x , y, 20, 20);
										n = 1;
									}
								graphics.setColor(Color.green);
								for (int x = 0; x < 160; x = x + 40)
									{
										graphics.fillRect(x , y, 20, 20);
									}
							}
					}
			}

	}
