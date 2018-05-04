import java.awt.*;
import javax.swing.*;
public class GraphicsChallenge3 extends Canvas
	{
		 private static final long        serialVersionUID        = 1L;
		 
         public static void main(String[] args) 
        	 {
        		 GraphicsChallenge3 canvas = new GraphicsChallenge3();
        		 JFrame frame = new JFrame();
        		 frame.setSize(1000, 1000);
        		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		 frame.getContentPane().add(canvas).setBackground(Color.white);
        		 frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
        		 frame.setResizable(false);
        		 frame.setVisible(true);
        	 }
         public void paint(Graphics graphics) 
         	{
         		graphics.setColor(Color.yellow);
         		graphics.fillRect(940, 920, 50, 50);
         		
         		graphics.setColor(Color.blue);
         		graphics.drawRect(940, 920, 50, 50);
         		
         		graphics.setColor(Color.red);
         		graphics.fillOval(250, 250, 500, 500);
         		
         		graphics.setColor(Color.green);
         		graphics.fillRect(300, 400, 50, 50);
         		graphics.fillRect(650, 400, 50, 50);
         		
         		graphics.setColor(Color.cyan);
         		graphics.fillOval(350, 500, 300, 200);
         	}
         
	}