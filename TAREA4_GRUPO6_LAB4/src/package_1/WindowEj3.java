package package_1;

import javax.swing.JFrame;
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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtHoras;
	public WindowEj3() {
		setTitle("Ejercicio 3");
		setBounds(500,500, 485, 329);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(43, 11, 412, 57);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema");
		lblElijeUnSistema.setBounds(10, 21, 127, 14);
		panel.add(lblElijeUnSistema);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(124, 17, 98, 23);
		panel.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(224, 17, 93, 23);
		panel.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(319, 17, 87, 23);
		panel.add(rdbtnLinux);
		
		JLabel lblOperativo = new JLabel("operativo");
		lblOperativo.setBounds(10, 32, 108, 14);
		panel.add(lblOperativo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(43, 91, 411, 91);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(191, 35, 180, 23);
		panel_1.add(chckbxAdministracion);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programacion");
		chckbxProgramacion.setBounds(191, 9, 180, 23);
		panel_1.add(chckbxProgramacion);
		
		JCheckBox chckbxDiseoGrfico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseoGrfico.setBounds(191, 61, 180, 23);
		panel_1.add(chckbxDiseoGrfico);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una");
		lblElijeUnaEspecialidad.setBounds(37, 39, 128, 14);
		panel_1.add(lblElijeUnaEspecialidad);
		
		JLabel lblEspecialidad = new JLabel("especialidad");
		lblEspecialidad.setBounds(37, 50, 99, 14);
		panel_1.add(lblEspecialidad);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas");
		lblCantidadDeHoras.setBounds(43, 198, 190, 34);
		getContentPane().add(lblCantidadDeHoras);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(195, 212, 141, 20);
		getContentPane().add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Test boton");
			}
		});
		btnAceptar.setBounds(336, 256, 89, 23);
		getContentPane().add(btnAceptar);		
		
		JLabel lblEnElComputador = new JLabel("en el computador");
		lblEnElComputador.setBounds(43, 228, 106, 20);
		getContentPane().add(lblEnElComputador);
		setVisible(true);
	}
}
