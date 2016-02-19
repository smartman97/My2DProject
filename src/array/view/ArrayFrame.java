package array.view;

import javax.swing.JFrame;

import array.controller.ArrayController;

public class ArrayFrame extends JFrame
{
	private ArrayController baseController;
	private ArrayPanel basePanel;
	
	public ArrayFrame(ArrayController baseController)
	{
		this.baseController = baseController;
		basePanel = new ArrayPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1000, 350);
		this.setContentPane(basePanel);
		this.setTitle("My 2D Project");
		this.setVisible(true);
	}
}
