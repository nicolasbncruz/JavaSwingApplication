package tienda;

import java.awt.EventQueue;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class ConsultarMaleta extends JDialog implements ActionListener {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblPesokg;
	@SuppressWarnings("rawtypes")
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtPeso;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarMaleta dialog = new ConsultarMaleta();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ConsultarMaleta() {
		setTitle("Consultar maleta");
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
		lblPesokg = new JLabel("Peso (kg)");
		lblPesokg.setBounds(25, 211, 73, 14);
		contentPanel.add(lblPesokg);
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(
				new DefaultComboBoxModel(new String[] { "Aviator", "Lucca", "Samsonite", "Century", "Saxoline" }));
		cboModelo.setBounds(128, 20, 117, 20);
		contentPanel.add(cboModelo);
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(128, 56, 117, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(128, 92, 117, 20);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setBounds(128, 130, 117, 20);
		contentPanel.add(txtAlto);
		txtAlto.setColumns(10);
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setBounds(128, 168, 117, 20);
		contentPanel.add(txtFondo);
		txtFondo.setColumns(10);
		txtPeso = new JTextField();
		txtPeso.setEditable(false);
		txtPeso.setBounds(128, 208, 117, 20);
		contentPanel.add(txtPeso);
		txtPeso.setColumns(10);
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(306, 19, 89, 23);
		btnCerrar.addActionListener(this);
		contentPanel.add(btnCerrar);
		// Mostrar los datos del primer modelo de mochila
		cboModelo.setToolTipText(Tienda.modelo0);
		txtPrecio.setText("" + Tienda.precio0);
		txtAncho.setText("" + Tienda.ancho0);
		txtAlto.setText("" + Tienda.alto0);
		txtFondo.setText("" + Tienda.fondo0);
		txtPeso.setText("" + Tienda.peso0);

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
		int modelo, anchomaleta, altomaleta, fondomaleta;
		double pesomaleta, preciomaleta;
		// Creamos métodos
		modelo = elegirmodelomochila();
		preciomaleta = elegirpreciomaleta(modelo);
		anchomaleta = elegiranchomaleta(modelo);
		altomaleta = elegiraltomaleta(modelo);
		fondomaleta = elegirfondomaleta(modelo);
		pesomaleta = elegirpesomaleta(modelo);
		mostrarresultados(preciomaleta, anchomaleta, altomaleta, fondomaleta, pesomaleta);
	}

	int elegirmodelomochila() {
		return cboModelo.getSelectedIndex();
	}

	double elegirpreciomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.precio0;
		case 1:
			return Tienda.precio1;
		case 2:
			return Tienda.precio2;
		case 3:
			return Tienda.precio3;
		default:
			return Tienda.precio4;
		}
	}

	int elegiranchomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.ancho0;
		case 1:
			return Tienda.ancho1;
		case 2:
			return Tienda.ancho2;
		case 3:
			return Tienda.ancho3;
		default:
			return Tienda.ancho4;
		}
	}

	int elegiraltomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.alto0;
		case 1:
			return Tienda.alto1;
		case 2:
			return Tienda.alto2;
		case 3:
			return Tienda.alto3;
		default:
			return Tienda.alto4;
		}
	}

	int elegirfondomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.fondo0;
		case 1:
			return Tienda.fondo1;
		case 2:
			return Tienda.fondo2;
		case 3:
			return Tienda.fondo3;
		default:
			return Tienda.fondo4;
		}
	}

	double elegirpesomaleta(int modelo) {
		switch (modelo) {
		case 0:
			return Tienda.peso0;
		case 1:
			return Tienda.peso1;
		case 2:
			return Tienda.peso2;
		case 3:
			return Tienda.peso3;
		default:
			return Tienda.peso4;
		}
	}

	void mostrarresultados(double preciomaleta, int anchomaleta, int altomaleta, int fondomaleta, double pesomaleta) {
		txtPrecio.setText(String.valueOf(preciomaleta));
		txtAncho.setText(String.valueOf(anchomaleta));
		txtAlto.setText(String.valueOf(altomaleta));
		txtFondo.setText(String.valueOf(fondomaleta));
		txtPeso.setText(String.valueOf(pesomaleta));
	}

}
