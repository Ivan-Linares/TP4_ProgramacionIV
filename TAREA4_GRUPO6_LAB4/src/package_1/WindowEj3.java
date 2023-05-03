package package_1;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class WindowEj3 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel panelSistemaOperativo;
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnMac;
	private JRadioButton rdbtnLinux;
	
	private JPanel panelEspecialidad;
	private JCheckBox chckbxAdministracion;
	private JCheckBox chckbxProgramacion;
	private JCheckBox chckbxDisenoGrfico;
	
	private JTextField txtHoras;
	
	ButtonGroup buttonGroup;
	
	public WindowEj3() {
		setTitle("Ejercicio 3");
		setBounds(500,500, 485, 329);
		getContentPane().setLayout(null);
		
		SetPanelSistemaOperativo();
		AddSeccionSistemaOperativo();	
		
		SetPanelEspecialidad();
		AddSeccionEspecialidad();
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador");
		lblCantidadDeHoras.setBounds(43, 205, 243, 34);
		getContentPane().add(lblCantidadDeHoras);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(274, 212, 89, 20);
		getContentPane().add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new eventoBtnAceptar(rdbtnWindows, rdbtnMac, rdbtnLinux, 
				chckbxAdministracion, chckbxProgramacion, chckbxDisenoGrfico, 
				txtHoras));
		btnAceptar.setBounds(366, 246, 89, 23);
		getContentPane().add(btnAceptar);
		setVisible(true);
	}
	
	public void SetPanelSistemaOperativo(){
		panelSistemaOperativo = new JPanel();
		panelSistemaOperativo.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSistemaOperativo.setBounds(43, 11, 412, 57);
		getContentPane().add(panelSistemaOperativo);
		panelSistemaOperativo.setLayout(null);
	}
	
	public void AddSeccionSistemaOperativo(){
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema operativo");
		lblElijeUnSistema.setBounds(10, 21, 152, 14);
		panelSistemaOperativo.add(lblElijeUnSistema);
				
		rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(170, 17, 98, 23);
		panelSistemaOperativo.add(rdbtnWindows);
		
		rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(272, 17, 64, 23);
		panelSistemaOperativo.add(rdbtnMac);
		
		rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(340, 17, 64, 23);
		panelSistemaOperativo.add(rdbtnLinux);
		
		buttonGroup = new ButtonGroup();   
		buttonGroup.add(rdbtnWindows);
		buttonGroup.add(rdbtnMac);
		buttonGroup.add(rdbtnLinux);	
	}
	
	public void SetPanelEspecialidad(){
		panelEspecialidad = new JPanel();
		panelEspecialidad.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEspecialidad.setBounds(43, 91, 411, 91);
		getContentPane().add(panelEspecialidad);
		panelEspecialidad.setLayout(null);
	}
	
	public void AddSeccionEspecialidad(){
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setBounds(24, 39, 145, 14);
		panelEspecialidad.add(lblElijeUnaEspecialidad);
		
		chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(191, 35, 180, 23);
		panelEspecialidad.add(chckbxAdministracion);
		
		chckbxProgramacion = new JCheckBox("Programacion");
		chckbxProgramacion.setBounds(191, 9, 180, 23);
		panelEspecialidad.add(chckbxProgramacion);
		
		chckbxDisenoGrfico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDisenoGrfico.setBounds(191, 61, 180, 23);
		panelEspecialidad.add(chckbxDisenoGrfico);
	}
}

class eventoBtnAceptar implements ActionListener {
	
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnMac;
	private JRadioButton rdbtnLinux;
	
	private JCheckBox chckbxAdministracion;
	private JCheckBox chckbxProgramacion;
	private JCheckBox chckbxDisenoGrfico;
	
	private JTextField txtHoras;

	public eventoBtnAceptar(JRadioButton rdbtnWindows, JRadioButton rdbtnMac, JRadioButton rdbtnLinux, 
			JCheckBox chckbxAdministracion, JCheckBox chckbxProgramacion, JCheckBox chckbxDisenoGrfico, 
			JTextField txtHoras)
	{	
		
		this.rdbtnWindows = rdbtnWindows;
		this.rdbtnMac = rdbtnMac;
		this.rdbtnLinux = rdbtnLinux;
		
		this.chckbxAdministracion = chckbxAdministracion;
		this.chckbxProgramacion = chckbxProgramacion;
		this.chckbxDisenoGrfico = chckbxDisenoGrfico;
		
		this.txtHoras = txtHoras;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		mostrarInformacion();
	}

	public void mostrarInformacion()
	{
		String textDialog = "";
		
		if(rdbtnWindows.isSelected())
			textDialog += "Windows - ";
		
		if(rdbtnMac.isSelected())
			textDialog += "Mac - ";
		
		if(rdbtnLinux.isSelected())
			textDialog += "Linux - ";
		
		if(chckbxProgramacion.isSelected())
			textDialog += "Programacion - ";
		
		if(chckbxAdministracion.isSelected())
			textDialog += "Administracion - ";
		
		if(chckbxDisenoGrfico.isSelected())
			textDialog += "Diseño Grafico - ";
		
		textDialog += txtHoras.getText() + " Hs";
		
		JOptionPane.showMessageDialog(null, textDialog);
	}
	
}
