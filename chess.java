//Author: Hardik Patel
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;


public class chess extends JFrame
{
		
	public static void main(String[] args) 
	{
		
		JFrame.setDefaultLookAndFeelDecorated(true); 
        JFrame frame = new JFrame("Chess Game"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        chessGUI chessWindow = new chessGUI();
        frame.setContentPane(chessWindow.createGUI(frame));
        frame.addWindowFocusListener(chessWindow);
        
        frame.setSize(550,650);
        frame.setResizable(false);
        frame.setVisible(true);  
        frame.pack();       
        
    }	
	
}