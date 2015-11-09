package gui.controller;

import gui.view.GUIFrame;

/**
 * Controller for the simple GUI.
 * @author Sam Montoya
 * @version 1.0, Nov 9
 */
public class GUIController
{
	/**
	 * Reference to the GUIFrame obect of the view.
	 */
	private GUIFrame baseFrame;
	
	public GUIController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{}
}
