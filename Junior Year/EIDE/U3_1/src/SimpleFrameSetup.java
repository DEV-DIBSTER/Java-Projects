import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.beans.*;

public class SimpleFrameSetup {
	
	//Data
	
	
	// FRAME
	private JFrame jf;				//Top Level.
	private JDesktopPane jdesk;		//Layer for dialogue windows.
	private JInternalFrame jif1;	//Layer for multiple "windows".
	
	// COMPONENTS
	
	
	// LISTENERS
	
	// Constructor
	public SimpleFrameSetup() {
		initialize();
		setUpListeners();
	}
		
	private void initialize(){
		// FRAME setup //Top container.
		jf = new JFrame("Unit 3 - FIRST GUI"); 				//Instantiate frame and sets title.
		jf.setLayout(null);									//Absolute/manual positioning.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Exits the application when users click on "X".
		jf.setSize(600, 600); 								//Windows and height, must set or will have 0 size.
		jf.setVisible(true);								//Must set, default is false.
		
		
		// DESKTOP PANE setup								//Needed for dialogue windows to pop up.
		jdesk = new JDesktopPane(); 						//Instantiates.
		jdesk.setBounds(jf.getBounds());					//Sets size equal to JFrame.
		jdesk.setVisible(true);								//Must set, default is false.
		jf.add(jdesk);										//Adds this to the frame.
		
		
		// INTERNAL FRAME setup // Needed to emulate multiple "windows".
		jif1 = new JInternalFrame("Simple Setup");			//Instantiate and sets title.
		jif1.setLayout(null);								//Absolute Positioning.
		jif1.setVisible(true);								//Must set, default is false.
		jdesk.add(jif1);									//Adds this to the desktop pane.
		jif1.setBackground(Color.RED);						//Changes the color to red.
		//jifi.setBackground(new Color(135, 50, 168));		//RGB values.
		
		try {												//DInstead of setBounds to make internal frame non movable.
			jif1.setMaximum(true);
		} catch (PropertyVetoException error) {
			error.printStackTrace();
		}
		
		// BUTTON setup
		
		
		// TEXTFiELD setup
		
		
		// POSITION SIZE of components
	}
	
	
	// IMPLEMENT AN ACTION LISTENER.
	// Need to send an actionPerformed message to all action listeners
	// registered for a given component.
	// Steps involved:
	//		- Declare an event handler class and specify that the class implements the ActionListenre interface.
	//		- Register an instance of the event handler class a s listener on one or more components. 
	
	private void setUpListeners() {
		
	}
	
	
	
	
	
	public static void main(String[] args){
		new SimpleFrameSetup();	//Simple GUI start.
								//A more robust approach uses the Runnable Interface.
	}

}
