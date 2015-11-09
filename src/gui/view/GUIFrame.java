package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

/**
 * 
 * @author Sam Montoya
 * @version 0.x Nov 9, 2015
 */
public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
		basePanel = new GUIPanel(baseController); //Creates an instance of the GUIPanel with a reference to the controller.
		setupFrame();
	}
	
	/**
	 * Helper method to setup the Frame and its structure.
	 */
	
	private void setupFrame()
	{	this.setTitle("My App Name");
		this.setContentPane(basePanel); 	//Sets the panel in the GUIFrame, THIS IS REQUIRED.
		this.setResizable(false); 			//Makes it so it can't be resized by the user.
		this.setSize(400, 400); 			//Sets the window size
		this.setVisible(true); 				// Must be the last line of code in the setupFrame method.
	}
}
