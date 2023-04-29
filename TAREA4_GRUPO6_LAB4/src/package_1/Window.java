package package_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setSize(294, 287);
		setLocation(350, 350);
		getContentPane().setLayout(null);
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
		botonEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WindowEj1 ej1 = new WindowEj1();
			}
		});
		botonEjercicio1.setText("Ejercicio 1");
		botonEjercicio1.setBounds(68, 70, 150, 30);
		
	    getContentPane().add(botonEjercicio1);
	    
		botonEjercicio2 = new JButton();
		botonEjercicio2.setText("Ejercicio 2");
		botonEjercicio2.setBounds(68, 130, 150, 30);
		
	    getContentPane().add(botonEjercicio2);
	    
		botonEjercicio3 = new JButton();
		botonEjercicio3.setText("Ejercicio 3");
		botonEjercicio3.setBounds(68, 190, 150, 30);
		
	    getContentPane().add(botonEjercicio3);
	    
	    JLabel lblGrupo = new JLabel("GRUPO NRO: 6");
	    lblGrupo.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblGrupo.setBounds(22, 11, 126, 28);
	    getContentPane().add(lblGrupo);
	}
}
