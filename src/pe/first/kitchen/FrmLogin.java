package pe.first.kitchen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblNewLabel;
	private JLabel lblClock;

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

	public void clock() {
		Thread clock = new Thread() {
			public void run() {
				try {
					for (;;) {
						Calendar calendar = new GregorianCalendar();
						int day = calendar.get(Calendar.DAY_OF_MONTH);
						int month = calendar.get(Calendar.MONTH) + 1;
						int year = calendar.get(Calendar.YEAR);
						int second = calendar.get(Calendar.SECOND);
						int minute = calendar.get(Calendar.MINUTE);
						int hour = calendar.get(Calendar.HOUR);
						lblClock.setText(day + "/" + month + "/" + year + " - " + hour + ":" + minute + ":" + second);
						sleep(1000);
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		clock.start();
	}

	/**
	 * Create the frame.
	 */
	public FrmLogin() {
		setBackground(new Color(255, 255, 255));
		setTitle("Login");
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(213, 213, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		txtUsername = new JTextField();
		txtUsername.setMargin(new Insets(10, 20, 10, 10));		
		txtUsername.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtUsername.setBounds(423, 171, 350, 45);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JPasswordField();		
		txtPassword.setMargin(new Insets(10, 20, 10, 2));
		txtPassword.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtPassword.setBounds(423, 258, 350, 45);
		contentPane.add(txtPassword);

		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(FrmLogin.class.getResource("/icons/login.png")).getImage();
		ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(354, 380, Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(imgIcon);
		lblNewLabel.setBounds(10, 28, 354, 461);
		contentPane.add(lblNewLabel);

		lblClock = new JLabel("");
		lblClock.setForeground(new Color(55, 55, 255));
		lblClock.setHorizontalAlignment(SwingConstants.LEFT);
		lblClock.setFont(new Font("Consolas", Font.BOLD, 17));
		lblClock.setBounds(44, 0, 310, 34);
		contentPane.add(lblClock);
		
		pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedPnlBtnLogin(e);
			}
		});
		pnlBtnLogin.setBackground(new Color(121, 121, 255));
		pnlBtnLogin.setFont(new Font("Calibri", Font.BOLD, 25));
		pnlBtnLogin.setBounds(423, 346, 215, 59);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		lblLogin = new JLabel("INGRESAR");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Calibri", Font.BOLD, 25));
		lblLogin.setBounds(30, 11, 155, 48);
		pnlBtnLogin.add(lblLogin);
		
		lblExit = new JLabel("");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedLblExit(e);
			}
		});
		lblExit.setIcon(new ImageIcon(FrmLogin.class.getResource("/icons/close.png")));
		lblExit.setBounds(755, 11, 45, 45);
		contentPane.add(lblExit);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblUsuario.setBounds(423, 137, 123, 23);
		contentPane.add(lblUsuario);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblPassword.setBounds(423, 227, 123, 23);
		contentPane.add(lblPassword);
		
		pnlBtnClean = new JPanel();
		pnlBtnClean.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mouseClickedPnlBtnClean(e);
			}
		});
		pnlBtnClean.setLayout(null);
		pnlBtnClean.setFont(new Font("Calibri", Font.BOLD, 25));
		pnlBtnClean.setBackground(new Color(53, 215, 170));
		pnlBtnClean.setBounds(659, 346, 114, 59);
		contentPane.add(pnlBtnClean);
		
		lblClean = new JLabel("LIMPIAR");
		lblClean.setHorizontalAlignment(SwingConstants.CENTER);
		lblClean.setForeground(Color.WHITE);
		lblClean.setFont(new Font("Calibri", Font.BOLD, 25));
		lblClean.setBounds(10, 22, 91, 26);
		pnlBtnClean.add(lblClean);
		clock();
	}
	 
	private JPanel pnlBtnLogin;
	private JLabel lblLogin;
	private JLabel lblExit;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JPanel pnlBtnClean;
	private JLabel lblClean;
	
	protected void mouseClickedLblExit(MouseEvent e) {
		if(JOptionPane.showConfirmDialog(null, "Estas seguro de salir", "Confirmacion", JOptionPane.YES_NO_OPTION)==0) {
			System.exit(0);	
		}		
	}
	
	protected void mouseClickedPnlBtnLogin(MouseEvent e) {
		String username, password;
		username = txtUsername.getText();
		password = txtPassword.getText();
		if (password.equals("admin") && username.equals("admin")) {
			JOptionPane.showMessageDialog(null, "Login exitoso", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);			
			FrmMain frmMain = new FrmMain();
			frmMain.setVisible(true);		
			frmMain.setLocationRelativeTo(this);
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
			txtUsername.requestFocus();
		}
	}
	protected void mouseClickedPnlBtnClean(MouseEvent e) {
		txtUsername.setText("");
		txtPassword.setText("");
		txtUsername.requestFocus();
	}
}
