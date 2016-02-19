package array.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import array.controller.ArrayController;

public class ArrayPanel extends JPanel
{
	private ArrayController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField colField;
	private JLabel currentPlayer;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	private JTable playerTable;
	
	public ArrayPanel(ArrayController baseController)
	{
		this.baseController = baseController;
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
