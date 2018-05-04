import java.awt.*;
import javax.swing.*;

public class GraphicsChallengeTwo4 extends Canvas
	{
		private static final long        serialVersionUID        = 1L;
				
			public static void main(String[] args) 
				{
					GraphicsChallengeTwo4 canvas = new GraphicsChallengeTwo4();
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
					String direction = "right";
					boolean bouncing = true;
					while (bouncing)
						{
							while (direction == "right")
								{
									for (int i = 0; i <= 480; i = i + 5)
										{
											graphics.setColor(Color.white);
											graphics.fillRect(i - 5, 230, 20, 20);
											graphics.setColor(Color.BLACK);
											graphics.fillRect(i, 230, 20, 20);
											delay();
										}
									direction = "left";
								}
							while (direction == "left")
								{
									for (int i = 480; i >= 0; i = i - 5)
										{
											graphics.setColor(Color.white);
											graphics.fillRect(i + 5, 230, 20, 20);
											graphics.setColor(Color.BLACK);
											graphics.fillRect(i, 230, 20, 20);
											delay();
										}
									direction = "right";
								}
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
