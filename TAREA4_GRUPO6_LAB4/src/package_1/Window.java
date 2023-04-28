package package_1;

import javax.swing.JFrame;

public class Window extends JFrame 
{
	public Window()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(350, 350);
	}
	
	public Window(int width, int high, int x, int y)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width, high);
		setLocation(x, y);
	}
	
	public void ChangeVisivility(boolean estado)
	{
		setVisible(estado);
	}
	
}
