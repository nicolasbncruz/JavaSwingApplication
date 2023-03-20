package pe.cibertec.karen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton btnIngresar;
	private JButton btnSalir;
	private JButton btnSalir_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin frame = new FrmLogin();
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
	public FrmLogin() {
		setBackground(new Color(255, 255, 255));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblUsername.setBounds(417, 110, 150, 42);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPassword.setBounds(417, 178, 150, 42);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtUsername.setBounds(577, 110, 183, 42);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtPassword.setBounds(577, 178, 183, 42);
		contentPane.add(txtPassword);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnIngresar(e);
			}
		});
		btnIngresar.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnIngresar.setBounds(364, 367, 183, 42);
		contentPane.add(btnIngresar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnSalir(e);
			}
		});
		btnSalir.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnSalir.setBounds(577, 367, 183, 42);
		contentPane.add(btnSalir);
		
		btnSalir_1 = new JButton("Borrar");
		btnSalir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnSalir_1(e);
			}
		});
		btnSalir_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnSalir_1.setBounds(577, 283, 183, 42);
		contentPane.add(btnSalir_1);
	}
	
	protected void actionPerformedBtnSalir(ActionEvent e) {
		System.exit(0);
	}
	protected void actionPerformedBtnSalir_1(ActionEvent e) {
		txtUsername.setText(null);
		txtPassword.setText(null);
	}
	protected void actionPerformedBtnIngresar(ActionEvent e) {
		String username, password;
		username = txtUsername.getText();
		password = txtPassword.getText();
		if(password.contains("dz") && username.contains("Codeni")) {
			JOptionPane.showMessageDialog(null, "gg", "login success", JOptionPane.CANCEL_OPTION);
			
		}
	}
}
