package package_1;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

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
		setBounds(300, 300, 475, 355);
		getContentPane().setLayout(null);
		
		SetPanelInput();
		SetPanelOutput();
		SetPanelBotones();
			
		setVisible(true);
	}
	
	private void SetPanelInput()
	{
		panelInput = new JPanel();
		panelInput.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInput.setBounds(26, 28, 241, 172);
		getContentPane().add(panelInput);
		panelInput.setLayout(null);
		
		SetLabelsInput();
		SetTextFieldsInput();
		SetComboBoxTPS();
	}
	
	private void SetLabelsInput()
	{
		lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(12, 32, 56, 16);
		panelInput.add(lblNota1);
		
		lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(12, 65, 56, 16);
		panelInput.add(lblNota2);
		
		lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(12, 98, 56, 16);
		panelInput.add(lblNota3);
		
		lblTPS = new JLabel("TPS: ");
		lblTPS.setBounds(12, 131, 56, 16);
		panelInput.add(lblTPS);
	}
	
	private void SetTextFieldsInput()
	{
		textNota1 = new JTextField();
		textNota1.setBounds(93, 29, 116, 22);
		panelInput.add(textNota1);
		textNota1.setColumns(10);
		
		textNota2 = new JTextField();
		textNota2.setBounds(93, 62, 116, 22);
		panelInput.add(textNota2);
		textNota2.setColumns(10);
		
		textNota3 = new JTextField();
		textNota3.setBounds(93, 95, 116, 22);
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
		panelBotones.setBounds(302, 65, 135, 123);
		getContentPane().add(panelBotones);
		panelBotones.setLayout(null);
		
		SetBotones();
	}
	
	private void SetBotones()
	{
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(12, 15, 113, 25);
		btnCalcular.addActionListener(new eventoBtnCalcular(comboBoxTPS, textCondicion, textNota1, textNota2, textNota3, textPromedio));
		panelBotones.add(btnCalcular);
		
		btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textNota1.setText(null);
				textNota2.setText(null);
				textNota3.setText(null);
				
				comboBoxTPS.setSelectedItem("Aprobado");
				
				textPromedio.setText(null);
				textCondicion.setText(null);
			}
		});
		
		btnNuevo.setBounds(12, 51, 113, 25);
		
		panelBotones.add(btnNuevo);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(12, 87, 113, 25);
		panelBotones.add(btnSalir);
	}
	
	private void SetPanelOutput()
	{
		panelOutput = new JPanel();
		panelOutput.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelOutput.setBounds(26, 211, 241, 92);
		getContentPane().add(panelOutput);
		panelOutput.setLayout(null);
		
		SetLabelsOutput();
		SetTextFieldsOutput();
	}
	
	private void SetLabelsOutput()
	{
		lblPromedio = new JLabel("Promedio: ");
		lblPromedio.setBounds(14, 26, 63, 16);
		panelOutput.add(lblPromedio);
		
		lblCondicion = new JLabel("Condicion: ");
		lblCondicion.setBounds(13, 59, 64, 16);
		panelOutput.add(lblCondicion);
	}
	
	private void SetTextFieldsOutput()
	{
		textPromedio = new JTextField();
		textPromedio.setBounds(93, 23, 116, 22);
		panelOutput.add(textPromedio);
		textPromedio.setColumns(10);
		
		textCondicion = new JTextField();
		textCondicion.setBounds(93, 56, 116, 22);
		panelOutput.add(textCondicion);
		textCondicion.setColumns(10);
	}
}

class eventoBtnCalcular implements ActionListener{
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;
	
	JComboBox comboBoxTPS;
	private JTextField textCondicion;
	private JTextField textPromedio;
	private Component rootPane;
	
	public eventoBtnCalcular(JComboBox comboBoxTPS, JTextField textCondicion, JTextField textNota1, JTextField textNota2, JTextField textNota3, JTextField textPromedio){
		this.comboBoxTPS = comboBoxTPS;
		this.textCondicion = textCondicion;
		this.textPromedio = textPromedio;
		this.textNota1 = textNota1;
		this.textNota2 = textNota2;
		this.textNota3 = textNota3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		actualizarInformacion();
	}
	
	public void actualizarInformacion()
	{
		
		Double nota1 = null, nota2 = null, nota3 = null;
		
		boolean aux = true;
		
		if((!validarNumeros(textNota1.getText().trim())) || textNota1.getText().isEmpty() || (!validarNota(textNota1.getText()))) {
			JOptionPane.showMessageDialog(rootPane, "La primer nota es erronea");
			aux = false;
		}else {
			nota1 = Double.parseDouble(textNota1.getText());
		}
		if((!validarNumeros(textNota2.getText().trim())) || textNota2.getText().isEmpty() || (!validarNota(textNota2.getText()))) {
			JOptionPane.showMessageDialog(rootPane, "La segunda nota es erronea");
			aux = false;
		}else {
			nota2 = Double.parseDouble(textNota2.getText());
		}
		if((!validarNumeros(textNota3.getText().trim())) || textNota3.getText().isEmpty() || (!validarNota(textNota3.getText()))) {
			JOptionPane.showMessageDialog(rootPane, "La tercer nota es erronea");
			aux = false;
		}else {
			nota3 = Double.parseDouble(textNota3.getText());
		}
		
		if(aux) {
			String promedio = devolverPromedio(nota1, nota2, nota3);
			textPromedio.setText(promedio);
			
			
			String condicionSelected = comboBoxTPS.getSelectedItem().toString();
			if(condicionSelected == "Desaprobado")
				setCondicion("Libre");
			else if(nota1 < 6 || nota2 < 6 || nota3 < 6)
			{
				setCondicion("Libre");
			}
			else if(condicionSelected == "Aprobado")
			{
				if(nota1 >= 8 && nota2 >= 8 && nota3 >= 8)
					setCondicion("Promocionado");
				else if((nota1 >= 6 && nota1 <= 8) && (nota2 >= 6 && nota2 <= 8) && (nota3 >= 6 && nota3 <= 8))
					setCondicion("Regular");
			}		
			
		}
		
	}
	
	public void setCondicion(String condicion){
		textCondicion.setText(condicion);
	}
	
	public static boolean validarNumeros(String datos) {
		return datos.matches("[0-9]{1,2}");
	}
	
	public static boolean validarNota(String datos) {
		int nota = Integer.parseInt(datos);
		
		if(nota <= 0 || nota > 10) {
			return false;
		}else
			return true;
	}
	
	public static String devolverPromedio(double nota1, double nota2, double nota3) {
		double promedio = (nota1 + nota2 + nota3)/3;
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		return df.format(promedio);
	}
	
}
