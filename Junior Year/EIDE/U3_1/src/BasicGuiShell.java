import java.awt.*;

public class BasicGuiShell {
	
	//Data
	
	
	// FRAME
	
	
	// COMPONENTS
	
	
	// LISTENERS
	
	
	// Constructor
	public BasicGuiShell() {
		initialize();
		setUpListeners();
	}
		
	private void initialize(){
		// FRAME setup //Top container.
		
		
		// DESKTOP PANE setup	//Needed for dialogue windows to pop up.
		
		
		// INTERNAL FRAME setup // Needed to emulate multiple "windows".
		
		
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
		new BasicGuiShell();	//Simple GUI start.
								//A more robust approach uses the Runnable Interface.
	}

}
