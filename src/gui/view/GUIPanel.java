package gui.view;

import javax.swing.*;

import gui.controller.GUIController;

import java.awt.event.*;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("Dont click the button");
		firstTextField = new JTextField("Type words?");
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Loads content into the panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout); //Needs to be the first line of the setupPanel helper method.
		this.add(firstButton);
		this.add(firstTextField);
		
	}
	
	/**
	 * Helper method to hold ugly GUI layout code.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 18, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Really...?");
			}
		});
			
			this.addMouseListener(new MouseListener()
			{
				public void mouseClicked(MouseEvent clicked)
				{
					
				}

				public void mousePressed(MouseEvent pressed)
				{
					
				}

				public void mouseReleased(MouseEvent released)
				{
					
				}

				public void mouseEntered(MouseEvent entered)
				{
					
				}

				public void mouseExited(MouseEvent exited)
				{
					
				}
			});
	}
}
