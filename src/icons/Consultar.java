package icons;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import pe.first.kitchen.FrmMain;

public class Consultar extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblQuemadores;	
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Consultar dialog = new Consultar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Consultar() {
		setTitle("Consultar cocina");
		// Agregando icono a la ventana Tienda
		Image icono = new ImageIcon(getClass().getResource("/icons/tienda.png")).getImage();
		setIconImage(icono);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(26, 23, 61, 14);
		contentPanel.add(lblModelo);
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(26, 59, 72, 14);
		contentPanel.add(lblPrecio);
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(26, 95, 72, 14);
		contentPanel.add(lblAncho);
		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(28, 133, 70, 14);
		contentPanel.add(lblAlto);
		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(26, 171, 85, 14);
		contentPanel.add(lblFondo);
		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(25, 211, 73, 14);
		contentPanel.add(lblQuemadores);
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(
				new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		cboModelo.setBounds(128, 20, 144, 20);
		contentPanel.add(cboModelo);
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(128, 56, 144, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(128, 92, 144, 20);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setBounds(128, 130, 144, 20);
		contentPanel.add(txtAlto);
		txtAlto.setColumns(10);
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setBounds(128, 168, 144, 20);
		contentPanel.add(txtFondo);
		txtFondo.setColumns(10);
		txtQuemadores = new JTextField();
		txtQuemadores.setEditable(false);
		txtQuemadores.setBounds(128, 208, 144, 20);
		contentPanel.add(txtQuemadores);
		txtQuemadores.setColumns(10);
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 19, 89, 23);
		btnCerrar.addActionListener(this);
		contentPanel.add(btnCerrar);
		// Setear datos primer modelo de Cocina
		cboModelo.setToolTipText(FrmMain.modelo0);
		txtPrecio.setText("" + FrmMain.precio0);
		txtAncho.setText("" + FrmMain.ancho0);
		txtAlto.setText("" + FrmMain.alto0);
		txtFondo.setText("" + FrmMain.fondo0);
		txtQuemadores.setText("" + FrmMain.quemadores0);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}

	// Accionamos el proceso del botón Cerrar
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	// Accionamos el proceso del combobox Modelo
	protected void actionPerformedCboModelo(ActionEvent e) {
		int modelo, quemadores;
		double anchomaleta, altomaleta, fondomaleta, preciomaleta;
		// Creamos métodos
		modelo = getModeloCocina();
		preciomaleta = getPrecioCocina(modelo);
		anchomaleta = getAnchoCocina(modelo);
		altomaleta = getAltoCocina(modelo);
		fondomaleta = getFondoCocina(modelo);
		quemadores = getQuemadoresCocina(modelo);
		mostrarresultados(preciomaleta, anchomaleta, altomaleta, fondomaleta, quemadores);
	}

	int getModeloCocina() {
		return cboModelo.getSelectedIndex();
	}

	double getPrecioCocina(int modelo) {
		switch (modelo) {
		case 0:
			return FrmMain.precio0;
		case 1:
			return FrmMain.precio1;
		case 2:
			return FrmMain.precio2;
		case 3:
			return FrmMain.precio3;
		default:
			return FrmMain.precio4;
		}
	}

	double getAnchoCocina(int modelo) {
		switch (modelo) {
		case 0:
			return FrmMain.ancho0;
		case 1:
			return FrmMain.ancho1;
		case 2:
			return FrmMain.ancho2;
		case 3:
			return FrmMain.ancho3;
		default:
			return FrmMain.ancho4;
		}
	}

	double getAltoCocina(int modelo) {
		switch (modelo) {
		case 0:
			return FrmMain.alto0;
		case 1:
			return FrmMain.alto1;
		case 2:
			return FrmMain.alto2;
		case 3:
			return FrmMain.alto3;
		default:
			return FrmMain.alto4;
		}
	}

	double getFondoCocina(int modelo) {
		switch (modelo) {
		case 0:
			return FrmMain.fondo0;
		case 1:
			return FrmMain.fondo1;
		case 2:
			return FrmMain.fondo2;
		case 3:
			return FrmMain.fondo3;
		default:
			return FrmMain.fondo4;
		}
	}

	int getQuemadoresCocina(int modelo) {
		switch (modelo) {
		case 0:
			return FrmMain.quemadores0;
		case 1:
			return FrmMain.quemadores1;
		case 2:
			return FrmMain.quemadores2;
		case 3:
			return FrmMain.quemadores3;
		default:
			return FrmMain.quemadores4;
		}
	}

	void mostrarresultados(double preciomaleta, double anchomaleta, double altomaleta, double fondomaleta, int quemadores) {
		txtPrecio.setText(String.valueOf(preciomaleta));
		txtAncho.setText(String.valueOf(anchomaleta));
		txtAlto.setText(String.valueOf(altomaleta));
		txtFondo.setText(String.valueOf(fondomaleta));
		txtQuemadores.setText(String.valueOf(quemadores));
	}

}
