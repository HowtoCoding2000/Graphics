import java.awt.*;
import javax.swing.*;
public class GraphicsChallenge2 extends Canvas
	{
		 private static final long        serialVersionUID        = 1L;
		 
         public static void main(String[] args) 
                 {
                 	GraphicsChallenge3 canvas = new GraphicsChallenge3();
                 	JFrame frame = new JFrame();
                 	frame.setSize(258, 280);
                 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 	frame.getContentPane().add(canvas).setBackground(Color.black);
                 	frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
                 	frame.setResizable(false);
                 	frame.setVisible(true);
                 }
         public void paint(Graphics graphics) 
         	{
         		graphics.setColor(Color.red);
         		graphics.drawRect(0, 0, 250, 250);
         		
         	}
         
	}
