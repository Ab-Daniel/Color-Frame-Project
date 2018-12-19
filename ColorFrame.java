import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class ColorFrame extends JFrame
{
	
	public ColorFrame()
	{
		
		colorPanel.setSize(PANEL_WIDTH, PANEL_WIDTH);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
	}
	
	public JPanel createButtonPanel()
	{
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout( ));
		panel.add(makeButton("Red"));
		panel.add(makeButton("Green"));
		panel.add(makeButton("Blue"));
		return panel;
		
	}
	
	public JButton makeButton(final String aString)
	{
		
		JButton button = new JButton(aString);
		
		class ButtonListener implements ActionListener
		{

			public void actionPerformed(ActionEvent arg0) 
			{
				
				if(aString == "Red")
				{
					colorPanel.setBackground(Color.RED);
				}
				
				if(aString == "Green")
				{
					colorPanel.setBackground(Color.GREEN);
				}
				
				if(aString == "Blue")
				{
					colorPanel.setBackground(Color.BLUE);
				}
				
			}
			
		}
		
		ActionListener listener = new ButtonListener();
		button.addActionListener(listener);
		return button;
		
	}
	
	
	public JMenu createMenus(final String aString)
	{
		
		JMenu menu = new JMenu(aString);
		return menu;
		
	}
	
	public void makeColorAction()
	{
		
		
		
	}
	
	public void makeCustomAction()
	{
		
		
		
	}
	
	
	private static final int PANEL_WIDTH = 300;
	private static final int PANEL_HEIGHT = 200;
	
	private CustomFrame custom;
	private JPanel colorPanel;
	
}
