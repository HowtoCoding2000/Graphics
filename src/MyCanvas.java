import java.awt.*;
import javax.swing.*;
 
public class MyCanvas extends Canvas 
        {
        private static final long        serialVersionUID        = 1L;
 
        public static void main(String[] args) 
        	{
        		MyCanvas canvas = new MyCanvas();
        		JFrame frame = new JFrame();
        		frame.setSize(800, 600);
        		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		frame.getContentPane().add(canvas).setBackground(Color.white);
        		frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
        		frame.setResizable(false);
        		frame.setVisible(true);
        	}
 
        public void paint(Graphics graphics) 
        	{
        		
        		graphics.setColor(Color.yellow);
                graphics.fillOval(600, 50, 100, 100);
                
                graphics.setColor(Color.blue);
                graphics.fillRect(10, 10, 200, 100);
                
                graphics.setColor(Color.black);
                graphics.drawLine(40, 30, 330, 380);
                
                for (int i = 0; i < 350; i++)
                	{
                		graphics.setColor(Color.green);
                        graphics.fillRect(i, 300, 50, 50);
                        
                        delay();
                        
                        graphics.setColor(Color.white);
                        graphics.fillRect(i, 300, 50, 50);
                	}
        	}
            
        public void delay()
        	{
        		try
        			{
        				Thread.sleep(500);
        			} 
        		catch (InterruptedException e)
        			{
        				e.printStackTrace();
        			}
        	}
        }
