package package_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

public class WindowEj1 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	
	public WindowEj1(){
		setTitle("Contactos");
		setBounds(300, 300, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombre.setBounds(50, 40, 80, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApellido.setBounds(50, 75, 80, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefono.setBounds(50, 110, 80, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblFechanac = new JLabel("Fecha Nac");
		lblFechanac.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFechanac.setBounds(50, 145, 80, 14);
		getContentPane().add(lblFechanac);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(160, 38, 170, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(160, 73, 170, 20);
		getContentPane().add(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(160, 108, 170, 20);
		getContentPane().add(txtTelefono);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(160, 143, 170, 20);
		getContentPane().add(txtFechaNac);
		
		JLabel lblTextoDatos = new JLabel("Los datos ingresados fueron: ");
		lblTextoDatos.setBounds(10, 215, 184, 14);
		getContentPane().add(lblTextoDatos);
		
		JLabel lblMostrar = new JLabel("");
		lblMostrar.setBounds(10, 236, 414, 14);
		getContentPane().add(lblMostrar);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.setBounds(223, 186, 107, 23);
		getContentPane().add(btnMostrar);
		
		setVisible(true);
	}
	
}
