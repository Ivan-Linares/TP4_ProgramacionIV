package package_1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton botonEjercicio1;
	private JButton botonEjercicio2;
	private JButton botonEjercicio3;
	
	public Window()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(350, 350);
		setLayout(null);
		AgregarBotones();
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
	
	public void AgregarBotones() {
		botonEjercicio1 = new JButton();
		botonEjercicio1.setText("Ejercicio 1");
		botonEjercicio1.setBounds(175, 20, 150, 30);
		
	    getContentPane().add(botonEjercicio1);
	    
		botonEjercicio2 = new JButton();
		botonEjercicio2.setText("Ejercicio 2");
		botonEjercicio2.setBounds(175, 70, 150, 30);
		
	    getContentPane().add(botonEjercicio2);
	    
		botonEjercicio3 = new JButton();
		botonEjercicio3.setText("Ejercicio 3");
		botonEjercicio3.setBounds(175, 120, 150, 30);
		
	    getContentPane().add(botonEjercicio3);
	}
	
}
