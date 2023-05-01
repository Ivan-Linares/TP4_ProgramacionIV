package package_1;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class WindowEj2 extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;
	private JTextField textPromedio;
	private JTextField textCondicion;
	
	JPanel panelInput;
	JLabel lblNota1;
	JLabel lblNota2;
	JLabel lblNota3;
	JLabel lblTPS;
	JComboBox comboBoxTPS;
	
	JPanel panelBotones;
	JButton btnCalcular;
	JButton btnNuevo;
	JButton btnSalir;
	
	JPanel panelOutput;
	JLabel lblPromedio;
	JLabel lblCondicion;
	
	public WindowEj2()
	{
		setTitle("Promedio");
		setBounds(300, 300, 500, 500);
		getContentPane().setLayout(null);
		
		SetPanelInput();
		SetPanelBotones();
		SetPanelOutput();
				
		setVisible(true);
	}
	
	private void SetPanelInput()
	{
		panelInput = new JPanel();
		panelInput.setBounds(50, 82, 241, 160);
		getContentPane().add(panelInput);
		panelInput.setLayout(null);
		
		SetLabelsInput();
		SetTextFieldsInput();
		SetComboBoxTPS();
	}
	
	private void SetLabelsInput()
	{
		lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(12, 13, 56, 16);
		panelInput.add(lblNota1);
		
		lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(12, 52, 56, 16);
		panelInput.add(lblNota2);
		
		lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(12, 87, 56, 16);
		panelInput.add(lblNota3);
		
		lblTPS = new JLabel("TPS: ");
		lblTPS.setBounds(12, 131, 56, 16);
		panelInput.add(lblTPS);
	}
	
	private void SetTextFieldsInput()
	{
		textNota1 = new JTextField();
		textNota1.setBounds(93, 10, 116, 22);
		panelInput.add(textNota1);
		textNota1.setColumns(10);
		
		textNota2 = new JTextField();
		textNota2.setBounds(93, 49, 116, 22);
		panelInput.add(textNota2);
		textNota2.setColumns(10);
		
		textNota3 = new JTextField();
		textNota3.setBounds(93, 84, 116, 22);
		panelInput.add(textNota3);
		textNota3.setColumns(10);
	}
	
	private void SetComboBoxTPS()
	{
		comboBoxTPS = new JComboBox();
		comboBoxTPS.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		comboBoxTPS.setBounds(93, 128, 116, 22);
		panelInput.add(comboBoxTPS);
	}
	
	private void SetPanelBotones()
	{
		panelBotones = new JPanel();
		panelBotones.setBounds(326, 136, 117, 106);
		getContentPane().add(panelBotones);
		panelBotones.setLayout(null);
		
		SetBotones();
	}
	
	private void SetBotones()
	{
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(12, 5, 95, 25);
		panelBotones.add(btnCalcular);
		
		btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(12, 35, 95, 25);
		panelBotones.add(btnNuevo);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(12, 65, 95, 25);
		panelBotones.add(btnSalir);
	}
	
	private void SetPanelOutput()
	{
		panelOutput = new JPanel();
		panelOutput.setBounds(50, 279, 241, 78);
		getContentPane().add(panelOutput);
		panelOutput.setLayout(null);
		
		SetLabelsOutput();
		SetTextFieldsOutput();
	}
	
	private void SetLabelsOutput()
	{
		lblPromedio = new JLabel("Promedio: ");
		lblPromedio.setBounds(12, 5, 63, 16);
		panelOutput.add(lblPromedio);
		
		lblCondicion = new JLabel("Condicion: ");
		lblCondicion.setBounds(12, 49, 64, 16);
		panelOutput.add(lblCondicion);
	}
	
	private void SetTextFieldsOutput()
	{
		textPromedio = new JTextField();
		textPromedio.setBounds(93, 2, 116, 22);
		panelOutput.add(textPromedio);
		textPromedio.setColumns(10);
		
		textCondicion = new JTextField();
		textCondicion.setBounds(93, 46, 116, 22);
		panelOutput.add(textCondicion);
		textCondicion.setColumns(10);
	}
}
