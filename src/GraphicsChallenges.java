import java.awt.*;
import javax.swing.*;
public class GraphicsChallenges extends Canvas
	{
		 private static final long        serialVersionUID        = 1L;
		 
         public static void main(String[] args) 
                 {
                 	GraphicsChallenges canvas = new GraphicsChallenges();
                 	JFrame frame = new JFrame();
                 	frame.setSize(850, 800);
                 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 	frame.getContentPane().add(canvas).setBackground(Color.black);
                 	frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
                 	frame.setResizable(false);
                 	frame.setVisible(true);
                 }
         public void paint(Graphics graphics) 
         	{
         		graphics.setColor(Color.white);
         		graphics.fillRect(50, 50, 800, 400);
         		
         		graphics.setColor(Color.magenta);
         		graphics.drawLine(0, 0, 800, 600);
         		
         		graphics.drawLine(800, 0, 0, 600);
         		
         	}
         
	}
