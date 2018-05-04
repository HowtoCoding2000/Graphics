import java.awt.*;
import javax.swing.*;

import java.util.Scanner;
public class GraphicsChallengeTwo extends Canvas
	{
		static Scanner userInput = new Scanner (System.in);
		static int length = 0;
		static int color = 0;
		private static final long        serialVersionUID        = 1L;
 
		public static void main(String[] args) 
			{
				askUser();
				
				GraphicsChallengeTwo canvas = new GraphicsChallengeTwo();
				JFrame frame = new JFrame();
				frame.setSize(1000, 1000);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.white);
				frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
				frame.setResizable(false);
				frame.setVisible(true);
			}
		public static void askUser()
			{
				System.out.println("How long do you want the square's sides to be? Maximum 950.");
				length = userInput.nextInt();
				while (length > 950)
					{
						System.out.println("Please choose a number that is less than or equal to 950.");
						length = userInput.nextInt();
					}
				System.out.println("Do you want the square to be (1) red or (2) blue?");
				color = userInput.nextInt();
			}
		public void paint(Graphics graphics)
			{
				if (color == 1)
					{
						graphics.setColor(Color.red);
					}
				else
					{
						graphics.setColor(Color.blue);
					}
				graphics.drawRect(0, 0, length, length);
			}
	}
