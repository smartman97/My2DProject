package array.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

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
		baseLayout = new SpringLayout();
		
		rowField = new JTextField(5);

		colField = new JTextField(5);
		
		editField = new JTextField(20);
		
		currentPlayer = new JLabel("The current player ");
		
		changeButton = new JButton("Change the indicated player");
		
		displayButton = new JButton("Display the indicated player");
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
			
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(playerTable);
		this.add(changeButton);
		this.add(colField);
		this.add(rowField);
		this.add(editField);
		this.add(currentPlayer);
		this.add(displayButton);
		this.setBackground(Color.GREEN);
	}
	
	/**
	 * Helper method to load info from the model into the GUI as a 2D array/.
	 */
	private void setupTable()
	{
		String [] colHeaders = {"Column 0", "Column 1", "Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyPlayers(), colHeaders);
		playerTable = new JTable(tableModel);

	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, playerTable, 50, SpringLayout.SOUTH, changeButton);
		baseLayout.putConstraint(SpringLayout.WEST, playerTable, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, playerTable, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, -238, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, colField, 0, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, colField, 37, SpringLayout.EAST, rowField);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 8, SpringLayout.SOUTH, editField);
		baseLayout.putConstraint(SpringLayout.NORTH, editField, 27, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, editField, 98, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, currentPlayer, 6, SpringLayout.NORTH, colField);
		baseLayout.putConstraint(SpringLayout.WEST, currentPlayer, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, changeButton, 112, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, displayButton, 16, SpringLayout.SOUTH, colField);
		baseLayout.putConstraint(SpringLayout.NORTH, changeButton, 17, SpringLayout.SOUTH, displayButton);
		baseLayout.putConstraint(SpringLayout.EAST, displayButton, 0, SpringLayout.EAST, changeButton);
	}
	
	private void setupListeners()
	{
		
	}
}
