package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Menu {
	public static JFrame MENU_FRAME = new JFrame();
	int MENU_FRAME_WIDTH = 500;
	int MENU_FRAME_HEIGHT = 500;
			
	public static JPanel MENU_PANEL_START = new JPanel();
	public static JPanel MENU_PANEL_SETTINGS = new JPanel();
	
	public static JButton MENU_BUTTON_START	= new JButton();
	public static JButton MENU_BUTTON_SETTINGS	= new JButton();
	
	public Menu(){
		MENU_FRAME.isVisible();
		MENU_FRAME.setTitle("Hunt the Wumpus");
		MENU_FRAME.setSize(MENU_FRAME_WIDTH, MENU_FRAME_HEIGHT);
		
		MENU_FRAME.add(MENU_PANEL_START);
		MENU_FRAME.add(MENU_PANEL_SETTINGS);
		
		MENU_PANEL_START.isVisible();
		MENU_PANEL_SETTINGS.isVisible();

	}
}
