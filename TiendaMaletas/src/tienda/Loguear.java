package tienda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Loguear extends JFrame implements ActionListener {

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	private JPasswordField PasswordField;
	private JButton btnEntrar;
	private JLabel lblContrasena;
	private JButton btnLimpiar;
	private JLabel lblUsuario;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loguear frame = new Loguear();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loguear() {
		setTitle("Ingresar Usuario");
		// Agregando icono a la ventana Tienda
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
		lblContrasena.setBounds(98, 130, 82, 14);
		contentPane.add(lblContrasena);
		JLabel lblIngresarANuestro = new JLabel("Ingresar a nuestro Sistema");
		lblIngresarANuestro.setForeground(Color.BLUE);
		lblIngresarANuestro.setFont(new Font("Gill Sans MT", Font.PLAIN, 22));
		lblIngresarANuestro.setBounds(98, 25, 292, 23);
		contentPane.add(lblIngresarANuestro);
		PasswordField = new JPasswordField();
		PasswordField.setBounds(179, 128, 147, 20);
		contentPane.add(PasswordField);
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(this);
		btnEntrar.setForeground(Color.BLUE);
		btnEntrar.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
		btnEntrar.setBounds(226, 186, 100, 23);
		contentPane.add(btnEntrar);
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setForeground(Color.BLUE);
		btnLimpiar.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
		btnLimpiar.setBounds(98, 186, 94, 23);
		contentPane.add(btnLimpiar);
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
		lblUsuario.setBounds(98, 93, 82, 14);
		contentPane.add(lblUsuario);
		txtUsuario = new JTextField();
		txtUsuario.setBounds(177, 91, 149, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

	}

	// Direccionamos eventos Tipo ActionEvent
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEntrar) {
			actionPerformedBtnEntrar(e);
		}
		if (e.getSource() == btnLimpiar) {
			actionPerformedBtnLimpiar(e);
		}
	}

	// Procesamos el botón Limpiar
	protected void actionPerformedBtnLimpiar(ActionEvent e) {
		txtUsuario.requestFocus();
		txtUsuario.setText("");
		PasswordField.setText("");
	}

	// Procesar el botón Entrar
	protected void actionPerformedBtnEntrar(ActionEvent e) {
		// Declarar nuestras variables
		String usuario;
		// Entrada de datos y obtenerlas.
		usuario = txtUsuario.getText();
		// Para obtener la contrasenña de un JPasswordField lo declaramos como
		// un String, ya que la contraseña se regresa como un char [].
		String contrasena = new String(PasswordField.getPassword());
		// Realizamos validaciones con "if - else- if" para el ComboBox.
		if (usuario.equals("admin") && contrasena.equals("admin")) {
			// JOptionPane.showMessageDialog(null,"Bienvenido al sistema,
			// ingresó correctamente");
			Tienda dc = new Tienda();
			dc.setVisible(true);
			dispose();
		} else {
			JOptionPane.showMessageDialog(null, "Usuario o Clave incorrecta");
		}
	}

}
