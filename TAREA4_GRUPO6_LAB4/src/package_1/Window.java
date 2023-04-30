package package_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame //clase que hereda de Jframe
{
	private static final long serialVersionUID = 1L;
	
	private JButton botonEjercicio1;
	private JButton botonEjercicio2;
	private JButton botonEjercicio3;
	
	public Window()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // por herencia toma los set de las prop de las ventanas
		setSize(294, 287);
		setLocation(350, 350);
		getContentPane().setLayout(null);
		
		AgregarBotones();
	}
		
	public void ChangeVisibility(boolean estado)
	{
		setVisible(estado);
	}
	
	public void AgregarBotones() 
	{
		botonEjercicio1 = new JButton();
		botonEjercicio1.setText("Ejercicio 1");
		botonEjercicio1.setBounds(68, 70, 150, 30);
		botonEjercicio1.addActionListener(new EventoBoton1());//interfaz que detecta cuando se hace click en un boton
			
		getContentPane().add(botonEjercicio1); //Agrega el boton adentro del frame
	    
		botonEjercicio2 = new JButton();
		botonEjercicio2.setText("Ejercicio 2");
		botonEjercicio2.setBounds(68, 130, 150, 30);
		botonEjercicio1.addActionListener(new EventoBoton2());
		
	    getContentPane().add(botonEjercicio2);
	    
		botonEjercicio3 = new JButton();
		botonEjercicio3.setText("Ejercicio 3");
		botonEjercicio3.setBounds(68, 190, 150, 30);
		botonEjercicio1.addActionListener(new EventoBoton3());
		
	    getContentPane().add(botonEjercicio3);
	    
	    JLabel lblGrupo = new JLabel("GRUPO NRO: 6");
	    lblGrupo.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblGrupo.setBounds(22, 11, 126, 28);
	    getContentPane().add(lblGrupo);
	}
	
	class EventoBoton1 implements ActionListener //Implemento ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) //desarrolla el metodo
		{
			WindowEj1 ej1 = new WindowEj1();  //genera la ventana Contactos
		}
		
	}
	
	class EventoBoton2 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//WindowEj1 ej2 = new WindowEj1(); //TODO: Crear la clase WindowsEj2 y reemplazar la que esta puesta aca
		}
		
	}
	
	class EventoBoton3 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//WindowEj1 ej3 = new WindowEj1(); //TODO: Crear la clase WindowsEj3 y reemplazar la que esta puesta aca
		}
		
	}
}
